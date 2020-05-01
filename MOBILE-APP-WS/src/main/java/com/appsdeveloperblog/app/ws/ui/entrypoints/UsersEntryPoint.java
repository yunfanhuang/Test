/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.appsdeveloperblog.app.ws.ui.entrypoints;

import com.appsdeveloperblog.app.ws.service.UsersService;
import com.appsdeveloperblog.app.ws.shared.dto.UserDTO;
import com.appsdeveloperblog.app.ws.ui.model.reponse.UserProfileRest;
import com.appsdeveloperblog.app.ws.ui.model.request.CreateUserRequestModel;
import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import org.springframework.beans.BeanUtils;

/**
 *
 * @author BOBO
 */
@Path("/users")
public class UsersEntryPoint {

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    //@Consumes =>宣告 POST Body 裡面的格式，可以是純文字、XML 格式或是 JSON 格式等
    @Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
    //@Produces =>宣告回傳值的格式，可以是純文字、XML 格式或是 JSON 格式等
    public UserProfileRest createUser(CreateUserRequestModel requestObject) {
        UserProfileRest returnValue = new UserProfileRest();
        
        // Prepare UserDTO
        UserDTO userDto = new UserDTO();
        BeanUtils.copyProperties(requestObject, userDto);
        
        // Create new user 
        UsersService userService = new UsersServiceImpl();
        UserDTO createdUserProfile = userService.createUser(userDto);
 
        //Prepare response
         BeanUtils.copyProperties(createdUserProfile, returnValue);

        return returnValue;

    }

}
