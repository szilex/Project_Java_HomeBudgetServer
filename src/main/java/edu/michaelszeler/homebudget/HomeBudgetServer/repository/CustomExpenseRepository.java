package edu.michaelszeler.homebudget.HomeBudgetServer.repository;

import edu.michaelszeler.homebudget.HomeBudgetServer.entity.CustomExpense;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import java.util.List;

public interface CustomExpenseRepository extends JpaRepository<CustomExpense, Long>, JpaSpecificationExecutor<CustomExpense> {
    List<CustomExpense> findAllByIdIn(List<Integer> ids);
}