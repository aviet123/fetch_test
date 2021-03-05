package com.example.demo.controller;

import com.example.demo.model.MainInfo;
import com.example.demo.model.SystemInfo;
import com.example.demo.service.MainInfoService;
import com.example.demo.service.SysService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("city/weather")
public class SystemInfoController {

    @Autowired
    SysService sysService;

    @PostMapping("/sys")
    public SystemInfo saveSystemInfo(@RequestBody SystemInfo systemInfo){
        return sysService.save(systemInfo);
    }

    @DeleteMapping("/sys/{id}")
    public void removeSystemInfoRecord(@PathVariable Integer id){
        sysService.remove(id);
    }

    @PutMapping("/sys/{id}")
    public SystemInfo updateSystemInfo(@PathVariable Integer id, @RequestBody SystemInfo systemInfo){
        return sysService.update(id,systemInfo);
    }
}
