/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package be.osmosis.web.domain;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import javax.json.bind.JsonbBuilder;
import javax.json.bind.JsonbConfig;
import javax.json.bind.config.PropertyVisibilityStrategy;

/**
 *
 * @author diete
 */
public class User {
    
    private String openId;
    private String email;
    private String firstName;
    private String lastName;

    public User(String openId, String email, String firstName, String lastName) {
        this.openId = openId;
        this.email = email;
        this.firstName = firstName;
        this.lastName = lastName;
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
