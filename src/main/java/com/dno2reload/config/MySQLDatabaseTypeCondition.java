package com.dno2reload.config;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;

public class MySQLDatabaseTypeCondition implements Condition
{
    @Override
    public boolean matches(ConditionContext conditionContext, AnnotatedTypeMetadata metadata)
    {
        String dbType = conditionContext.getEnvironment().getProperty("app.dbType");
        return "MONGO".equalsIgnoreCase(dbType);
    }
}