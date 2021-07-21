package com.example.application.views.months;

import com.example.application.services.ClientService;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.html.Paragraph;
import com.vaadin.flow.router.Route;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@Route("months")
public class MonthsView extends Div {

    public MonthsView(@Autowired ClientService clientService){
        List months = clientService.getMonths();
        months.forEach(s -> add(new Paragraph(String.valueOf(s))));
    }




}
