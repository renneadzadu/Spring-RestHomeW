package com.apress.Spring.RestHomeW.repository;

import com.apress.Spring.RestHomeW.domain.Poll;
import org.springframework.data.repository.CrudRepository;

public interface PollRepository extends CrudRepository<Poll, Long> {

}
