package org.acme.entity;

import io.quarkus.mongodb.panache.PanacheMongoEntity;
import io.quarkus.mongodb.panache.common.MongoEntity;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@MongoEntity(collection = "enterprise")
public class EnterpriseEntity extends PanacheMongoEntity {

    @NotNull
    @Size(min = 3, max = 50)
    public String name;
    public String webPage;

    @Override
    public String toString() {
        return "EnterpriseEntity{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", webPage='" + webPage + '\'' +
                '}';
    }
}