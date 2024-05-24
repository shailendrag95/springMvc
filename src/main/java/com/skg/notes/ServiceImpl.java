package com.skg.notes;

@org.springframework.stereotype.Service
public class ServiceImpl implements Service{
    @Override
    public String getHealthStatus() {
        return "UP";
    }
}
