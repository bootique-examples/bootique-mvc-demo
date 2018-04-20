package io.bootique.mvc.demo.view;

import io.bootique.mvc.AbstractView;

public class PageView extends AbstractView {

    private Object model;

    public PageView(String template, Object model) {
        super(template);
        this.model = model;
    }

    public Object getModel() {
        return model;
    }
}