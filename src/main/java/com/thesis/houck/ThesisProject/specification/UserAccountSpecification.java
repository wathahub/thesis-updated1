package com.thesis.houck.ThesisProject.specification;

import com.thesis.houck.ThesisProject.model.UserAccount;
import org.springframework.data.jpa.domain.Specification;

import javax.persistence.criteria.Predicate;
import java.util.ArrayList;
import java.util.List;


public class UserAccountSpecification {

    public static Specification<UserAccount> findByUsernameAndPassword(String username, String password) {
        return (root, query, cb) -> {
            List<Predicate> predicateList = new ArrayList<>();
            predicateList.add(cb.equal(root.get("username"), username));
            predicateList.add(cb.equal(root.get("password"), password));
            return cb.and(predicateList.toArray(new Predicate[predicateList.size()]));
        };
    }

}
