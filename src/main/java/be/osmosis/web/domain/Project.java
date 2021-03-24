/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package be.osmosis.web.domain;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.List;
import javax.json.bind.JsonbBuilder;
import javax.json.bind.JsonbConfig;
import javax.json.bind.config.PropertyVisibilityStrategy;

/**
 *
 * @author diete
 */
public class Project {
    private String description;
    private List<User> users;

    public Project(String description, List<User> users) {
        this.description = description;
        this.users = users;
    }
    
    
    public String toJson(){
        JsonbConfig config = new JsonbConfig().withPropertyVisibilityStrategy(new PropertyVisibilityStrategy(){
            @Override
            public boolean isVisible(Field field) {
                return true;
            }

            @Override
            public boolean isVisible(Method method) {
                return false;
            }
            
        });
        return JsonbBuilder.create(config).toJson(this);
    }
    
}
