package io.bootique.mvc.demo;

import io.bootique.BaseModule;
import io.bootique.Bootique;
import io.bootique.di.Binder;
import io.bootique.jersey.JerseyModule;
import io.bootique.jetty.JettyModule;
import io.bootique.mvc.demo.contoller.BootiqueController;

public class Application extends BaseModule {

    public static void main(String[] args) {
        Bootique
                .app(args)
                .autoLoadModules()
                .module(Application.class)
                .args("--server", "--config=classpath:bootique.yml")
                .exec()
                .exit();
    }

    @Override
    public void configure(Binder binder) {
        JerseyModule.extend(binder).addResource(BootiqueController.class);
        JettyModule.extend(binder).addStaticServlet("css","/css/*");
    }
}
