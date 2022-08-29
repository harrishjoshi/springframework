package com.harxsh.spring.aop.data;

import com.harxsh.spring.aop.aspect.TrackTime;
import org.springframework.stereotype.Repository;

@Repository
public class Dao1 {

    @TrackTime
    public String retrieveSomething() {
        return "dao1";
    }
}
