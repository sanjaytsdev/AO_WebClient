package com.op.oper.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.op.oper.Entity.Operations;
import com.op.oper.Services.OpServices;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
public class OpController {

        @Autowired
        private OpServices os;

        @PostMapping("/calc")
        public Operations calculate(@RequestBody Operations ops) throws Exception {
            return os.getResult(ops);
        }
        
}
