f=@(x) x^3-5*x+1;
df=@(x) 3*x^2-5;
x=1;
i=1;
while(true)
    x1=x-(f(x)/df(x));
    if(abs(x-x1)<10^-10)
        break;
    end
    x=x1;
    fprintf('Value after %d iteration is %.5f',i,x);
    disp('\n');
    i=i+1;
end
sol=x;
fprintf('Approximate Root is %.5f',sol);
disp('\n')
fprintf('Number of iteration is %d',i);
