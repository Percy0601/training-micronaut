package io.training.micronaut.mapper;

import io.micronaut.context.annotation.Executable;
import io.micronaut.data.jdbc.annotation.JdbcRepository;
import io.micronaut.data.model.query.builder.sql.Dialect;
import io.micronaut.data.repository.CrudRepository;
import io.training.micronaut.entity.Item;

@JdbcRepository(dialect = Dialect.MYSQL)
public interface ItemRepository extends CrudRepository<Item, Long> {

    @Executable
    Item find(Long sku);

}
