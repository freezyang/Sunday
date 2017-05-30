package com.sunday.group.controller;

import com.sunday.group.model.Group;
import com.sunday.group.service.GroupService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by novot on 2017-05-30.
 */
@Controller
@RequestMapping("/group")
public class GroupController {

    @Autowired
    private GroupService groupService;

    @RequestMapping("/info/{serial}")
    @ResponseBody
    public Group getGroupInfo(@PathVariable(name = "serial") long serial) {
        return groupService.getChurchGroupInfo(serial);
    }

}
