function[y] = derivative(x)
y = (f(x+0.00001) - f(x))/0.00001;
end