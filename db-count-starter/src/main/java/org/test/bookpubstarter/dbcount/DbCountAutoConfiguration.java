package org.test.bookpubstarter.dbcount;

import org.springframework.context.annotation.Bean;
import org.springframework.data.repository.CrudRepository;

import java.util.Collection;

/**
 * Created by lam on 12/07/16.
 */
public class DbCountAutoConfiguration {
    @Bean
    public DbCountRunner dbCountRunner(Collection<CrudRepository> repositories) {
        return new DbCountRunner(repositories);
    }
}
