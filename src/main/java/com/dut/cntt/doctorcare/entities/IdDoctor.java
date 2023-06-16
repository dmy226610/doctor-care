package com.dut.cntt.doctorcare.entities;
import java.io.Serializable;
import java.util.stream.Stream;

import org.hibernate.HibernateException;
import org.hibernate.engine.spi.SharedSessionContractImplementor;
import org.hibernate.id.IdentifierGenerator;

public class  IdDoctor implements IdentifierGenerator{
    private String id = "DT";

    public Serializable generate(SharedSessionContractImplementor session, Object object) throws HibernateException {
        String query = "select  e.id from Doctor e";
        Stream<String> stream = session.createQuery(query, String.class).stream();
        Long max = stream.map(o -> o.replace(id, "")).mapToLong(Long::parseLong).max().orElse(0L);
        return id + (String.format("%03d", max + 1));
    }
}

