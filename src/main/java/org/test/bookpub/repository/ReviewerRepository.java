package org.test.bookpub.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.test.bookpub.entity.Reviewer;

/**
 * Created by lam on 12/07/16.
 */
public interface ReviewerRepository extends PagingAndSortingRepository<Reviewer, Long> {

}
