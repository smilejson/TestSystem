package service;

import javax.jws.WebService;

@WebService
public class HelloWordServiceImpl  implements HelloWordService{


    @Override
    public String sayHello(String name) {
        // TODO Auto-generated method stub
        System.out.println("WebService sayHello "+name);
        return "sayHello "+name;
    }

    @Override
    public String save(String name, String pwd) {
        // TODO Auto-generated method stub
        System.out.println("WebService save "+name+"， "+pwd);
        return "save Success";
    }

}
