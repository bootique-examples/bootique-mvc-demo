package io.bootique.mvc.demo;

import com.google.inject.Binder;
import com.google.inject.Module;
import io.bootique.Bootique;
import io.bootique.jersey.JerseyModule;
import io.bootique.mvc.demo.contoller.BootiqueController;

public class Application implements Module {

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
    }
}
