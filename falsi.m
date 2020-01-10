a = 0;
b = 1;
x = [];
x1 = 0;
while(func(a)*func(b)>0)
    b = b+1;
end
for i = 1:4
    x1 = (((a*func(b)) - (b*func(a)))/(func(b)-func(a)));
    x = [x x1];
    if(func(x1) == 0)
        break
    elseif(func(x1)*func(a)<0)
        b = x1;
    else
        a = x1;
    end
end
x
