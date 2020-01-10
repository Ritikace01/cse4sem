a = 0;
b = 1;
c = 0;
fc = 0;
while(func(a)*func(b)>0)
    b = b+1;
end
while(1)
    c = (a+b)/2;
    fc = func(c);
    if(fc<0.001 && fc>-0.001)
        break
    
    elseif(fc*func(a)<0)
            b = c;
        else
            a = c;
    end
end

