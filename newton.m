
x0 = 0.5;
x1 = x0 - (func(x0)/derivative(x0));
j = 0;
while(abs(x1 - x0)<0.00001)
    x0 = x1;
    x1 = x0 - (func(x0)/derivative(x0));
    j = j+1;
end
x1
j