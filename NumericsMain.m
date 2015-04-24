while 1
 
clear all;
clc
fprintf('MENU DE METODOS NUMERICOS\n\n');
fprintf('1.-MENU DE METODOS CERRADOS\n\n');
fprintf('2.-MENU DE METODOS ABIERTOS\n\n');
fprintf('3.-MENU DE METODOS ABIERTOS PARA ECUACIONES NO LINEALES\n\n');
fprintf('4.-MENU DE DIFERENCIACION E INTEGRACION NUMERICA\n\n');
fprintf('5.-SALIR\n');

opc=input('Escoja una opcion:');

clc
   
switch (opc) 
    
     case 1 
        clear all
     while 1
        clear all;
        fprintf('MENU DE METODOS CERRADOS\n')
        fprintf('1.- METODO BISECCION.\n')
        fprintf('2.- METODO FALSA POSICION.\n')
        fprintf('3.- SALIR\n')
        opc1=input('Escoja una opcion\n');
        
        switch (opc1)
                   
             
            case 1
                        clear all
                        format short;     
                        clc
                        fun=input('Introduzcal a funcion f(x)=','s');
                        xl=input('Ingrese el limite inferior para graifcar:','s');
                        xu=input('Ingrese el limite superior para graficar:','s');
                        t=linspace(xl,xu);
                        plot(t,subs(fun,t))
                        grid on
                        a=input('Introduzca el valor de a: ');
                        b=input('Introduzca el valor de b: ');
                        cont=input('Introduzca el número de iteraciones cont: ');

                        f=inline(fun);
                        for k=1:cont
                            c=(a+b)/2;
                            e=abs((b-a)/2);
                            A(k,:)=[k a b c f(c) e];
                            if f(a)*f(c)<0
                                b=c;
                            else
                                a=c;
                            end
                        end
                        fprintf('\n \tk \ta \tb \tc \tf(x) \terror \n')
                        disp(A)
                        fprintf('Solución:\n x=%8.5f\n',c)
                        fprintf('f(x)=%8.5f\n',f(c))
                        fprintf('error=%8.5f\n',e)
                        fprintf('\n')
                        fprintf('\n')
            
            case 2
                
                
                        clear all
                        format short;
                        clc
                        fun=input('Introduzcal a funcion f(x)=','s');
                        xl=input('Ingrese el limite inferior para graifcar: ');
                        xu=input('Ingrese el limite superior para graficar: ');
                        t=linspace(xl,xu,1000);
                        plot(t,subs(fun,t))
                        grid on
                        b=input('Introduzca el valor de x-inferior: ');
                        a=input('Introduzca el valor de x-superior: ');
                       
                        cont=input('Introduzca el número de iteraciones cont: ');
                        x=a;
                        Fa=eval(fun);
                        x=b;
                        Fb=eval(fun);
                        c=0;
                        f=inline(fun);
                        for k=1:cont
                            aux=c;
                            c=(b*Fa-a*Fb)/(Fa-Fb);
                             e=abs(((c-aux)/c)*100);
                            A(k,:)=[k a b c f(c) e];
                            if f(a)*f(c)<0
                                b=c;
                            else
                                a=c;
                            end

                        end
                        fprintf('\n \tinteraciones \ta \tb \tx \tf(x) \terror \n')
                        disp(A)
                        fprintf('Solución:\n x=%8.5f\n',c)
                        a=subs(fun,c);
                        fprintf('f(x)=%8.5f\n',a)
                        fprintf('error=%8.5f\n',e)
                        fprintf('\n')
                        fprintf('\n')
            
            
            case 3 
                
               
               
                break;
                
                
            otherwise
              fprintf('opcion invalida');   
                
           
        end
        
        
     end
              
     case 2
        clear all 
     while 1
         clear all;  
        fprintf('MENU DE METODOS ABIERTOS\n')
        fprintf('1.- METODO ITERACION DE PUNTO FIJO.\n')
        fprintf('2.- METODO DE NEWTON-RAPHSON\n')
        fprintf('3.- METODO DE LA SECANTE\n')
        fprintf('4.- METODO DE LA SECANTE MODIFICADO \n')
        fprintf('5.- METODO DE NEWTON-RAPHSON MODIFICADO PARA RAICES MULTIPLES\n')
        fprintf('6.- SALIR\n')
        opc2=input('Escoja una opcion\n');
        
     switch (opc2)  
               
         case 1
                        clear all;
                        clc
                        syms x;

                        f=input('Ingrese la función f(x), despejada g(f(x)):','s');
                       
                        xf(1)=input('Ingrese el valor inicial: ');
                        tol=0.000001;       % input('Ingrese el porcentaje de error: ');

                    
                        i=1;
                        ea(1)=100;
                        while abs(ea(i))>=tol,

                            xf(i+1) = subs(f,x,xf(i)); 
                            ea(i+1) = abs((xf(i+1)-xf(i))/xf(i+1))*100; 
                            i=i+1;
                        end
                        fprintf('i     xf(i)         Error aprox (i) \n');

                        for j=1:i;
                            fprintf('%2d \t %11.7f \t %7.3f \n',j-1,xf(j),ea(j));   
                        end


                        fprintf('Solución:\n x=%8.5f\n',xf(i-1))
        fprintf('\n')
        fprintf('\n')
                
                
                case 2
                            
                                 clear all
                                %format short;
                                clc
                                syms x;
                                fun=input('Introduzca la funcion f(x)=');
                                fund=diff(fun);
                                
                                ezplot(fun);
                                grid on;
                                a=input('Introduzca el valor de x0: ');
                                %b=input('Introduzca el valor de x-inferior: ');
                                cont=input('Introduzca el número de iteraciones cont: ');
                                    f=inline(fun);
                                    c=0;
                                    x=a;
                                    b=0;

                                for k=1:cont
                                    Fa=eval(fun);
                                    Fb=eval(fund);
                                    aux=c;
                                    c=x-(Fa/Fb);
                                    x=c;

                                     e=abs(((c-aux)/c)*100);
                                    A(k,:)=[k c e];


                                end
                                fprintf('\n \tK   \tx  \terror \n')
                                disp(A)
                                fprintf('Solución:\n x=%8.5f\n',c)
                                a=subs(fun,c);
                                fprintf('f(x)=%8.5f\n',a)
                                fprintf('error=%8.5f\n',e)
fprintf('\n')
fprintf('\n')
                                
                                case 3

                                                                                               clc
                                                            clear

                                                            f=input('Ingrese la funcion:\n','s');
                                                            
                                                            grid on;
                                                            ezplot(f);
                                                            f=inline(f);
                                                            x0=input('Ingrese el primer punto inicial:\n');
                                                            x1=input('Ingrese el segundo punto inicial:\n');
                                                            cont=input('ingrese el numero de interaciones\n');
                                                            xra=0;
                                                            xr=0;
                                                            tol=0.01;
                                                            i=1;
                                                            error_aprox=1;
                                                            error=0;

                                                            fx1=f(x1);
                                                            fx0=f(x0);

                                                            xr=x1-((x1-x0)/(fx1-fx0))*fx1;

                                                            fprintf('It.        X0              X1              Xr       Error aprox \n');
                                                            fprintf('%2d \t %11.7f \t %11.7f \t %11.7f \t %11.7f \n',i,x0,x1,xr,error);

                                                            for k=1:cont-1

                                                            xra=xr;
                                                            x1=xr;

                                                            fx1=f(x1);
                                                            fx0=f(x0);

                                                            xr=x1-((x1-x0)/(fx1-fx0))*fx1;

                                                            error = abs((xr - xra) / xr);
                                                            error_aprox = error;

                                                            i=i+1;

                                                            fprintf('%2d \t %11.7f \t %11.7f \t %11.7f \t %11.7f \n',i,x0,x1,xr,error_aprox);

                                                            end
                                                            fprintf('Solución:\n x=%8.5f\n',xr)
                                                           fprintf('\n')
                                                           fprintf('\n')


         
                               case 4
                                   
                                                                               clear all
                                            %format short;
                                            clc
                                            fun=input('Introduzca la funcion f(x)=','s');   
                                            grid on;
                                             ezplot(fun);
                                            a=input('Introduzca el valor de x0: ');
                                            b=input('Introduzca el valor de delta : ');
                                            cont=input('Introduzca el número de iteraciones : ');
                                                f=inline(fun);
                                                c=0;

                                                x=a;
                                                z=0;

                                            for k=1:cont

                                                Fa=eval(fun);

                                                z=x+(b*x);
                                                phi=x;%%
                                                x=z;

                                                FB=eval(fun);

                                                x=phi;
                                                aux=c;

                                                c=x-((b*x*Fa)/(FB-Fa));

                                                x=c;

                                                 e=abs(((c-aux)/c)*100);
                                                A(k,:)=[k c e];


                                            end
                                            fprintf('\n \tK   \tx  \terror \n')
                                            disp(A)
                                            fprintf('Solución:\n x=%8.5f\n',c)
                                            a=subs(fun,c);
                                            fprintf('f(x)=%8.5f\n',a)
                                            fprintf('error=%8.5f\n',e)
                                        fprintf('\n')
                                        fprintf('\n')
                                   
                            case 5
                                
                           clear;

                                        clc;

                                        %****************************************************************

                                        %** Se ingresan los datos de la ecuacion que deseamos          **

                                        %** conocer sus raices, valor inicial de x y con que           **

                                        %** porcentaje de error.                                       **

                                        %**************************************************************** 





                                        fprintf('\nCalculo de la raiz de una ecuacion por el metodo de Newton Rapson Modoficado\n\n');

                                        f=input('Dame la funcion f(x) : ','s');

                                        ff=input('Dame la derivada de funcion f(x) : ','s');

                                        fff=input('Dame la segunda derivada de funcion f(x) : ','s');
                                          grid on;
                                        ezplot(fun);

                                        xi=input('Dame el valor inicial de x : ');

                                        itr=input('Dame el numero de interaciones: ');
                                        ea=1000;

                                        c=1;

                                        x=xi;

                                        %****************************************************************

                                        %** Se realizan los calculos para determinar la raiz en la     **

                                        %** siguiente seccion.                                         **

                                        %**************************************************************** 



                                        for k=1:itr 



                                        g=eval(f);

                                        h=eval(ff);

                                        z=eval(fff);

                                        c=x-(g*h)/(h^(2)-(g*z));

                                        ea=abs((c-x)/c*100);

                                        x=c;



                                        A(k,:)=[k c ea];

                                        end

                                        %****************************************************************

                                        %** Se imprimen resultados                                     **

                                        %**************************************************************** 



                                        fprintf('\n \tK   \tx  \terror \n')
                                        disp(A)
                                        fprintf('Solución:\n x=%8.5f\n',c)

                                        fprintf('error=%8.5f\n',ea)     


                                fprintf('\n')
                                fprintf('\n')
                                
                                
                                
                                
                                
                         case 6
                    
                   break;
                
                
              
                    
    end
            
               
        
     end
    
     case 3
            clear all
     while 1
        clear all;
        fprintf('MENU DE METODOS ABIERTOS PARA E.N.L\n')
        fprintf('1.- METODO ITERACION DE PUNTO FIJO PARA E.N.L.\n')
        fprintf('2.- METODO DE NEWTON-RAPHON PRA E.N.L.\n')
        fprintf('3.- SALIR\n')
        opc1=input('Escoja una opcion\n');
        
        switch (opc1)
                   
             
            case 1

                            clc
                            syms x;
                            syms y;

                            fprintf('Metodo de iteracion de punto fijo para ecuaciones no lineales\n\n');
                            f=input('Ingrese la función g(x,y): ');
                            f2=input('Ingrese la segunda funcion g(x,y): ');
                            a=input('Ingrese el primer valor inicial x : ');
                            b=input('Ingrese el segundo valor inicial y : ');
                            contador=input('Ingrese el numero de iteraciones: ');
                            fg=input('Ingrese la función f(x,y) para graficar: ');
                            f2g=input('Ingrese la segunda funcion f(x,y) para graficar: ');
                            ezplot(fg);
                            hold on;
                                 
                            ezplot(f2g);
                                        
                            
                             grid on;

                            
                            rx=subs(f,{x,y},{a,b});
                            ry=subs(f2,{x,y},{rx,b});
                            fprintf('It.            X              Y           \n\n');
                            fprintf('1 \t %11.7f \t %11.7f \n',rx,ry);


                            for k=1:contador


                            ax=subs(f,{x,y},{rx,ry});

                            ay=subs(f2,{x,y},{ax,ry});

                            ry=ay;

                            rx=ax;
                            fprintf('%d \t %11.7f \t %11.7f \n',k+1,rx,ry);


                            end

                            fprintf('\n\nResultado x=%f\ty=%f\n',ax,ay)
                            
                            
                            
                            hold off;
                            fprintf('\n')
                            fprintf('\n')

            case 2
                                                     %%Newton Multiples raices


                                        clc
                                        syms x;
                                        syms y;

                                        fprintf('Metodo de Newton-Raphon para ecuaciones no lineales\n\n');
                                        f=input('Ingrese la función f(x,y): ');
                                        f2=input('Ingrese la segunda funcion f(x,y): ');
                                        
                                        a=input('Ingrese el primer valor inicial x : ');
                                        b=input('Ingrese el segundo valor inicial y : ');
                                        contador=input('Ingrese el numero de iteraciones: ');
                                      
                                         
                                        
                                        tol=0.000001;       % input('Ingrese el porcentaje de error: ');

                                        rx=subs(f,{x,y},{a,b});
                                        ry=subs(f2,{x,y},{a,b});

                                        dux1=diff(f,x);
                                        duy1=diff(f,y);
                                        dvx1=diff(f2,x);
                                        dvy1=diff(f2,y);


                                        dux=subs(dux1,{x,y},{a,b});
                                        duy=subs(duy1,{x,y},{a,b});
                                        dvy=subs(dvy1,{x,y},{a,b});
                                        dvx=subs(dvx1,{x,y},{a,b});



                                        jacobian=(dux*dvy)-(duy*dvx);

                                        z=a-((rx*dvy-ry*duy)/(jacobian));

                                        v=b-((ry*dux-rx*dvx)/(jacobian));

                                        ax=z;
                                        by=v;

                                        fprintf('It.            U              V              du/dx            du/dy           dv/dy          dv/dx            J                x                 y     \n\n');
                                        fprintf('1 \t %11.7f \t %11.7f \t %11.7f \t %11.7f \t %11.7f \t %11.7f \t %11.7f \t %11.7f \t %11.7f\n',rx,ry,dux,duy,dvy,dvx,jacobian,z,v);




                                        for k=1:contador




                                        rx=subs(f,{x,y},{ax,by});
                                        ry=subs(f2,{x,y},{ax,by});

                                        dux=subs(dux1,{x,y},{ax,by});
                                        duy=subs(duy1,{x,y},{ax,by});
                                        dvy=subs(dvy1,{x,y},{ax,by});
                                        dvx=subs(dvx1,{x,y},{ax,by});

                                        jacobian=(dux*dvy)-(duy*dvx);


                                        rootx=ax-((rx*dvy-ry*duy)/(jacobian));

                                        rooty=by-((ry*dux-rx*dvx)/(jacobian));

                                        ax=rootx;
                                        by=rooty;   


                                        fprintf('%d \t %11.7f \t %11.7f \t %11.7f \t %11.7f \t %11.7f \t %11.7f \t %11.7f \t %11.7f \t %11.7f\n',k+1,rx,ry,dux,duy,dvy,dvx,jacobian,ax,by);


                                        end



                                        fprintf('\n\nResultado x=%f\ty=%f\n\n',ax,by)
                                        
                                        
                                      %  hold off;
                                      fprintf('\n')
                                      fprintf('\n')

            case 3
                
             break;   
        end
        
     end   
       
    case 4
             clear all
     while 1
        clear all;
        fprintf('MENU DE DIFERENCIACION E INTEGRACION NUMERICAL\n')
        fprintf('1.- METODO DEL TRAPECIO\n');
        fprintf('2.- METODO DE  SIMPSON 3/8 \n');
        fprintf('3.- METODO DE  ROMBERG  \n');
        fprintf('4.- METODO DE DIFERENCIACION HACIA ATRAS\n');
        fprintf('5.- METODO DE DIFERENCIACION EN EL CENTRO\n');
        fprintf('6.- METODO DE DIFERENCIACION HACIA ADELANTE\n');
        fprintf('7.- SALIR\n')
        opc1=input('Escoja una opcion\n');
        
        switch (opc1)
            case 1
                                        clear all; 
                        clc; 
                         fprintf('Calculo de la integral por el metodo del trapecio\n\n'); 
                         f=input('introduce la funcion:','s'); 
                         ezplot(f);
                         grid on;
                         a=input('limite inferior:'); 
                         b=input('limite superior:'); 
                         c=input('numero de segmentos a dividir:'); 
                         h=(b-a)/c; 
                         z=0; 
                        for x=a:h:b

                            k=eval(f);

                            if x==a,d=k;
                            
                            end

                            if x==b,e=k;
                            
                            end

                            z=z+k;
                        end

                          z=z-d-e;
                          z=z*2; 
                          z=z+d+e; 
                          z=z/(2*c); 
                          z=z*(b-a); 
                          fprintf('Resultado %f \n\n\n',z);
                          fprintf('\n')
                          fprintf('\n')

            case 2
                
                            clc
                            clear all

                            fun=input('ingrese la funcion\n','s');
                            ezplot(fun);
                            grid on;
                            a=input('ingrese el limite inferior de la integral\n');
                            b=input('ingrese el limite superior de la integral\n');
                            h=(b-a)/3;
                            x=a;
                            f1=eval(fun);
                            x=a+h;
                            f2=eval(fun);
                            x=a+2*h;
                            f3=eval(fun);
                            x=b;
                            f4=eval(fun); 
                            I=(3*h/8)*(f1+3*f2+3*f3+f4);
                            fprintf('I=%f \n',I);
                            fprintf('\n')
                            fprintf('\n')

            case 3
                
                
                            clc
                            clear all
                                            format long;
                            fun=input('ingrese la funcion\n','s');
                            ezplot(fun);
                            grid on;
                            a=input('ingrese el limite inferior de la integral\n');
                            b=input('ingrese el limite superior de la integral\n');
                            n=input('ingrese el numero de intervalos\n');
                            h=(b-a);
                            M=1;
                            J=0;
                            R=zeros(n,n);
                            x=a;
                            f1=eval(fun);
                            x=b;
                            f2=eval(fun);
                            R(1,1)=h*(f1+f2)/2;
                            while(J<(n-1))
                            J=J+1;
                            h=h/2;
                            s=0;
                            for p=1:M
                            x=a+h*(2*p-1);
                            f3=eval(fun);
                            s=s+f3;
                            end
                            R(J+1,1)=(1/2)*(R(J,1))+h*s;
                            M=2*M;
                            for K=1:J 
                                R(J+1,K+1)=R(J+1,K)+(R(J+1,K)-R(J,K))/(4^K-1);
                            end
                            end
                            I=R(J+1,J+1);
                            fprintf('I=%f \n',I);
                            fprintf('\n')
                            fprintf('\n')
            
            case 4
                

                            clc
                            clear all

                            fprintf('derivada :diferencias divididas finitas hacia atrás \n');

                                syms x;
                                 k=input('Introdusca la funcion f(x)=');


                                     xv=input('introdusca el valor de x='); 

                                       h=input('Introdusca el tamaño de paso h=');

                                     n=input('numero de pasos=');

                             a=input('introdusca valor -x para graficar=');

                                     b=input('introdusca valor +x para graficar=');
                            Soln=diff(k);

                            Ev=subs(Soln,x,xv);

                            j=zeros(1,n);
                            N=zeros(1,n);
                            H=zeros(1,n);
                            Av=zeros(1,n);
                            Et=zeros(1,n);
                            et=zeros(1,n);
                            Ea=zeros(1,n);
                            ea=zeros(1,n);
                            Sig=zeros(1,n);


                            lin = linspace(a,b,100);
                            y1 = subs(k,lin);
                            y2 = subs(Soln,lin);

                            figure
                            plot(lin,y1,lin,y2)
                            legend('f(x)','derivada');
                            grid on;

                            for i=1:n
                                j(i)=i;
                                N(i)=2^(i-1);
                                H(i)=h/(N(i));
                                Av(i)=(subs(k,xv)-subs(k,xv-H(i)))/(H(i));
                                Et(i)=Ev-Av(i);
                                et(i)=abs(Et(i)/Ev*100);

                                if i>1
                                    Ea(i)=Av(i)-Av(i-1);
                                    ea(i)=abs(Ea(i)/Av(i)*100);
                                    if 0<ea(i)<5
                                        Sig(i)=floor((2-log10(ea(i)/0.5)));
                                    else
                                       Sig(i)=0; 
                                   end   
                                end
                            end

                            fprintf('\n');
                            disp('      O       dx/dy      Et    |et|')
                            Results=[   H'     Av'   Et'   et'];
                            disp(sprintf('\n'))
                            disp(Results)
                            disp(sprintf('\n'))


                            fprintf('resultado %f\n',Av);
                            fprintf('\n')
                            fprintf('\n')


           
            case 5
            
                                            clc
                            clear all

                            fprintf('derivada :diferencias divididas finitas Central \n');

                                syms x;
                                 k=input('Introdusca la funcion f(x)=');


                                     xv=input('introdusca el valor de x='); 

                                       h=input('Introdusca el tamaño de paso h=');

                                     n=input('numero de pasos=');

                                     a=input('introdusca valor -x para graficar=');

                                     b=input('introdusca valor +x para graficar=');
                            Soln=diff(k);

                            Ev=subs(Soln,x,xv);
                            j=zeros(1,n);
                            N=zeros(1,n);
                            H=zeros(1,n);
                            Av=zeros(1,n);
                            Et=zeros(1,n);
                            et=zeros(1,n);
                            Ea=zeros(1,n);
                            ea=zeros(1,n);
                            Sig=zeros(1,n);


                            lin = linspace(a,b,100);
                            y1 = subs(k,lin);
                            y2 = subs(Soln,lin);

                            figure
                            plot(lin,y1,lin,y2)
                            legend('f(x)','derivada');
                            grid on;
                            for i=1:n
                                j(i)=i;
                                N(i)=2^(i-1);
                                H(i)=h/(N(i));
                                Av(i)=(subs(k,xv+H(i))-subs(k,xv-H(i)))/(2*H(i));
                                Et(i)=Ev-Av(i);
                                et(i)=abs(Et(i)/Ev*100);
                                if i>1
                                    Ea(i)=Av(i)-Av(i-1);
                                    ea(i)=abs(Ea(i)/Av(i)*100);
                                    if 0<ea(i)<5
                                        Sig(i)=floor((2-log10(ea(i)/0.5)));
                                    else
                                       Sig(i)=0; 
                                   end   
                                end
                             end

                            fprintf('\n');
                            disp('      O       dx/dy      Et    |et|')
                            Results=[   H'     Av'   Et'   et'];
                            disp(sprintf('\n'))
                            disp(Results)
                            disp(sprintf('\n'))


                            fprintf('resultado %f\n',Av);
                            fprintf('\n')
                            fprintf('\n')


            case 6
             
                
                            clc
                            clear all

                            fprintf('derivada :diferencias divididas finitas hacia Adelante \n');

                                syms x;
                                 k=input('Introdusca la funcion f(x)=');


                                     xv=input('introdusca el valor de x='); 

                                       h=input('Introdusca el tamaño de paso h=');

                                     n=input('numero de pasos=');
                             a=input('introdusca valor -x para graficar=');

                                     b=input('introdusca valor +x para graficar=');

                            Soln=diff(k);

                            Ev=subs(Soln,x,xv);

                            j=zeros(1,n);
                            N=zeros(1,n);
                            H=zeros(1,n);
                            Av=zeros(1,n);
                            Et=zeros(1,n);
                            et=zeros(1,n);
                            Ea=zeros(1,n);
                            ea=zeros(1,n);
                            Sig=zeros(1,n);



                            lin = linspace(a,b,100);
                            y1 = subs(k,lin);
                            y2 = subs(Soln,lin);

                            figure
                            plot(lin,y1,lin,y2)
                            legend('f(x)','derivada');
                            grid on;

                            for i=1:n
                                j(i)=i;
                                N(i)=2^(i-1);
                                H(i)=h/(N(i));
                                Av(i)=(subs(k,xv+H(i))-subs(k,xv))/(H(i));
                                Et(i)=Ev-Av(i);
                                et(i)=abs(Et(i)/Ev*100);
                                if i>1
                                    Ea(i)=Av(i)-Av(i-1);
                                    ea(i)=abs(Ea(i)/Av(i)*100);
                                    if 0<ea(i)<5
                                        Sig(i)=floor((2-log10(ea(i)/0.5)));
                                    else
                                       Sig(i)=0; 
                                   end   
                                end
                             end


                            fprintf('\n');
                            disp('      O       dx/dy      Et    |et|')
                            Results=[   H'     Av'   Et'   et'];
                            disp(sprintf('\n'))
                            disp(Results)
                            disp(sprintf('\n'))


                            fprintf('resultado %f\n',Av);
                            fprintf('\n')
                            fprintf('\n')



            case 7
                break;
                
        end
       
     end
         
    case 5
        break;
    otherwise
        
    fprintf('opcion invalida');
  
end


clc
end
