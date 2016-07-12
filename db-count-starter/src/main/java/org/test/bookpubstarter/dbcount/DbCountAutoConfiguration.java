package org.test.bookpubstarter.dbcount;

import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.context.annotation.Bean;
import org.springframework.data.repository.CrudRepository;

import java.util.Collection;

/**
 * Created by lam on 12/07/16.
 */
public class DbCountAutoConfiguration {
    @Bean
    @ConditionalOnMissingBean
    public DbCountRunner dbCountRunner(Collection<CrudRepository> repositories) {
        return new DbCountRunner(repositories);
    }
}
