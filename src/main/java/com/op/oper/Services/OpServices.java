package com.op.oper.Services;

import org.springframework.stereotype.Service;

import com.op.oper.Entity.Operations;

@Service
public class OpServices {

    public Integer operation(Integer a, Integer b, String op) throws Exception{
        switch(op) {
            case "add" : return a + b;
            case "sub" : return a - b;
            case "mul" : return a * b;
            case "div" :if(b == 0)
                            throw new Exception("cannot divide by zero");
                        else 
                            return a / b;
            default :  throw new Exception("Error!!");
        }
    }

    public Operations getResult(Operations o) throws Exception {
        Integer res = operation(o.getA(), o.getB(), o.getOp());
        o.setRes(res);
        return o;
    }

}
