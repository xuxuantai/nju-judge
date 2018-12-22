package cn.edu.nju.software.judge.beans;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class CproblemExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table _cproblem
     *
     * @mbg.generated Sat Dec 22 11:39:09 CST 2018
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table _cproblem
     *
     * @mbg.generated Sat Dec 22 11:39:09 CST 2018
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table _cproblem
     *
     * @mbg.generated Sat Dec 22 11:39:09 CST 2018
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table _cproblem
     *
     * @mbg.generated Sat Dec 22 11:39:09 CST 2018
     */
    public CproblemExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table _cproblem
     *
     * @mbg.generated Sat Dec 22 11:39:09 CST 2018
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table _cproblem
     *
     * @mbg.generated Sat Dec 22 11:39:09 CST 2018
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table _cproblem
     *
     * @mbg.generated Sat Dec 22 11:39:09 CST 2018
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table _cproblem
     *
     * @mbg.generated Sat Dec 22 11:39:09 CST 2018
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table _cproblem
     *
     * @mbg.generated Sat Dec 22 11:39:09 CST 2018
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table _cproblem
     *
     * @mbg.generated Sat Dec 22 11:39:09 CST 2018
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table _cproblem
     *
     * @mbg.generated Sat Dec 22 11:39:09 CST 2018
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table _cproblem
     *
     * @mbg.generated Sat Dec 22 11:39:09 CST 2018
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table _cproblem
     *
     * @mbg.generated Sat Dec 22 11:39:09 CST 2018
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table _cproblem
     *
     * @mbg.generated Sat Dec 22 11:39:09 CST 2018
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table _cproblem
     *
     * @mbg.generated Sat Dec 22 11:39:09 CST 2018
     */
    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andCproblemIdIsNull() {
            addCriterion("cproblem_id is null");
            return (Criteria) this;
        }

        public Criteria andCproblemIdIsNotNull() {
            addCriterion("cproblem_id is not null");
            return (Criteria) this;
        }

        public Criteria andCproblemIdEqualTo(Integer value) {
            addCriterion("cproblem_id =", value, "cproblemId");
            return (Criteria) this;
        }

        public Criteria andCproblemIdNotEqualTo(Integer value) {
            addCriterion("cproblem_id <>", value, "cproblemId");
            return (Criteria) this;
        }

        public Criteria andCproblemIdGreaterThan(Integer value) {
            addCriterion("cproblem_id >", value, "cproblemId");
            return (Criteria) this;
        }

        public Criteria andCproblemIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("cproblem_id >=", value, "cproblemId");
            return (Criteria) this;
        }

        public Criteria andCproblemIdLessThan(Integer value) {
            addCriterion("cproblem_id <", value, "cproblemId");
            return (Criteria) this;
        }

        public Criteria andCproblemIdLessThanOrEqualTo(Integer value) {
            addCriterion("cproblem_id <=", value, "cproblemId");
            return (Criteria) this;
        }

        public Criteria andCproblemIdIn(List<Integer> values) {
            addCriterion("cproblem_id in", values, "cproblemId");
            return (Criteria) this;
        }

        public Criteria andCproblemIdNotIn(List<Integer> values) {
            addCriterion("cproblem_id not in", values, "cproblemId");
            return (Criteria) this;
        }

        public Criteria andCproblemIdBetween(Integer value1, Integer value2) {
            addCriterion("cproblem_id between", value1, value2, "cproblemId");
            return (Criteria) this;
        }

        public Criteria andCproblemIdNotBetween(Integer value1, Integer value2) {
            addCriterion("cproblem_id not between", value1, value2, "cproblemId");
            return (Criteria) this;
        }

        public Criteria andContestIdIsNull() {
            addCriterion("contest_id is null");
            return (Criteria) this;
        }

        public Criteria andContestIdIsNotNull() {
            addCriterion("contest_id is not null");
            return (Criteria) this;
        }

        public Criteria andContestIdEqualTo(Integer value) {
            addCriterion("contest_id =", value, "contestId");
            return (Criteria) this;
        }

        public Criteria andContestIdNotEqualTo(Integer value) {
            addCriterion("contest_id <>", value, "contestId");
            return (Criteria) this;
        }

        public Criteria andContestIdGreaterThan(Integer value) {
            addCriterion("contest_id >", value, "contestId");
            return (Criteria) this;
        }

        public Criteria andContestIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("contest_id >=", value, "contestId");
            return (Criteria) this;
        }

        public Criteria andContestIdLessThan(Integer value) {
            addCriterion("contest_id <", value, "contestId");
            return (Criteria) this;
        }

        public Criteria andContestIdLessThanOrEqualTo(Integer value) {
            addCriterion("contest_id <=", value, "contestId");
            return (Criteria) this;
        }

        public Criteria andContestIdIn(List<Integer> values) {
            addCriterion("contest_id in", values, "contestId");
            return (Criteria) this;
        }

        public Criteria andContestIdNotIn(List<Integer> values) {
            addCriterion("contest_id not in", values, "contestId");
            return (Criteria) this;
        }

        public Criteria andContestIdBetween(Integer value1, Integer value2) {
            addCriterion("contest_id between", value1, value2, "contestId");
            return (Criteria) this;
        }

        public Criteria andContestIdNotBetween(Integer value1, Integer value2) {
            addCriterion("contest_id not between", value1, value2, "contestId");
            return (Criteria) this;
        }

        public Criteria andProblemIdIsNull() {
            addCriterion("problem_id is null");
            return (Criteria) this;
        }

        public Criteria andProblemIdIsNotNull() {
            addCriterion("problem_id is not null");
            return (Criteria) this;
        }

        public Criteria andProblemIdEqualTo(Integer value) {
            addCriterion("problem_id =", value, "problemId");
            return (Criteria) this;
        }

        public Criteria andProblemIdNotEqualTo(Integer value) {
            addCriterion("problem_id <>", value, "problemId");
            return (Criteria) this;
        }

        public Criteria andProblemIdGreaterThan(Integer value) {
            addCriterion("problem_id >", value, "problemId");
            return (Criteria) this;
        }

        public Criteria andProblemIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("problem_id >=", value, "problemId");
            return (Criteria) this;
        }

        public Criteria andProblemIdLessThan(Integer value) {
            addCriterion("problem_id <", value, "problemId");
            return (Criteria) this;
        }

        public Criteria andProblemIdLessThanOrEqualTo(Integer value) {
            addCriterion("problem_id <=", value, "problemId");
            return (Criteria) this;
        }

        public Criteria andProblemIdIn(List<Integer> values) {
            addCriterion("problem_id in", values, "problemId");
            return (Criteria) this;
        }

        public Criteria andProblemIdNotIn(List<Integer> values) {
            addCriterion("problem_id not in", values, "problemId");
            return (Criteria) this;
        }

        public Criteria andProblemIdBetween(Integer value1, Integer value2) {
            addCriterion("problem_id between", value1, value2, "problemId");
            return (Criteria) this;
        }

        public Criteria andProblemIdNotBetween(Integer value1, Integer value2) {
            addCriterion("problem_id not between", value1, value2, "problemId");
            return (Criteria) this;
        }

        public Criteria andNumIsNull() {
            addCriterion("num is null");
            return (Criteria) this;
        }

        public Criteria andNumIsNotNull() {
            addCriterion("num is not null");
            return (Criteria) this;
        }

        public Criteria andNumEqualTo(String value) {
            addCriterion("num =", value, "num");
            return (Criteria) this;
        }

        public Criteria andNumNotEqualTo(String value) {
            addCriterion("num <>", value, "num");
            return (Criteria) this;
        }

        public Criteria andNumGreaterThan(String value) {
            addCriterion("num >", value, "num");
            return (Criteria) this;
        }

        public Criteria andNumGreaterThanOrEqualTo(String value) {
            addCriterion("num >=", value, "num");
            return (Criteria) this;
        }

        public Criteria andNumLessThan(String value) {
            addCriterion("num <", value, "num");
            return (Criteria) this;
        }

        public Criteria andNumLessThanOrEqualTo(String value) {
            addCriterion("num <=", value, "num");
            return (Criteria) this;
        }

        public Criteria andNumLike(String value) {
            addCriterion("num like", value, "num");
            return (Criteria) this;
        }

        public Criteria andNumNotLike(String value) {
            addCriterion("num not like", value, "num");
            return (Criteria) this;
        }

        public Criteria andNumIn(List<String> values) {
            addCriterion("num in", values, "num");
            return (Criteria) this;
        }

        public Criteria andNumNotIn(List<String> values) {
            addCriterion("num not in", values, "num");
            return (Criteria) this;
        }

        public Criteria andNumBetween(String value1, String value2) {
            addCriterion("num between", value1, value2, "num");
            return (Criteria) this;
        }

        public Criteria andNumNotBetween(String value1, String value2) {
            addCriterion("num not between", value1, value2, "num");
            return (Criteria) this;
        }

        public Criteria andTitleIsNull() {
            addCriterion("title is null");
            return (Criteria) this;
        }

        public Criteria andTitleIsNotNull() {
            addCriterion("title is not null");
            return (Criteria) this;
        }

        public Criteria andTitleEqualTo(String value) {
            addCriterion("title =", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotEqualTo(String value) {
            addCriterion("title <>", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleGreaterThan(String value) {
            addCriterion("title >", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleGreaterThanOrEqualTo(String value) {
            addCriterion("title >=", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLessThan(String value) {
            addCriterion("title <", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLessThanOrEqualTo(String value) {
            addCriterion("title <=", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLike(String value) {
            addCriterion("title like", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotLike(String value) {
            addCriterion("title not like", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleIn(List<String> values) {
            addCriterion("title in", values, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotIn(List<String> values) {
            addCriterion("title not in", values, "title");
            return (Criteria) this;
        }

        public Criteria andTitleBetween(String value1, String value2) {
            addCriterion("title between", value1, value2, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotBetween(String value1, String value2) {
            addCriterion("title not between", value1, value2, "title");
            return (Criteria) this;
        }

        public Criteria andAcceptedIsNull() {
            addCriterion("accepted is null");
            return (Criteria) this;
        }

        public Criteria andAcceptedIsNotNull() {
            addCriterion("accepted is not null");
            return (Criteria) this;
        }

        public Criteria andAcceptedEqualTo(Integer value) {
            addCriterion("accepted =", value, "accepted");
            return (Criteria) this;
        }

        public Criteria andAcceptedNotEqualTo(Integer value) {
            addCriterion("accepted <>", value, "accepted");
            return (Criteria) this;
        }

        public Criteria andAcceptedGreaterThan(Integer value) {
            addCriterion("accepted >", value, "accepted");
            return (Criteria) this;
        }

        public Criteria andAcceptedGreaterThanOrEqualTo(Integer value) {
            addCriterion("accepted >=", value, "accepted");
            return (Criteria) this;
        }

        public Criteria andAcceptedLessThan(Integer value) {
            addCriterion("accepted <", value, "accepted");
            return (Criteria) this;
        }

        public Criteria andAcceptedLessThanOrEqualTo(Integer value) {
            addCriterion("accepted <=", value, "accepted");
            return (Criteria) this;
        }

        public Criteria andAcceptedIn(List<Integer> values) {
            addCriterion("accepted in", values, "accepted");
            return (Criteria) this;
        }

        public Criteria andAcceptedNotIn(List<Integer> values) {
            addCriterion("accepted not in", values, "accepted");
            return (Criteria) this;
        }

        public Criteria andAcceptedBetween(Integer value1, Integer value2) {
            addCriterion("accepted between", value1, value2, "accepted");
            return (Criteria) this;
        }

        public Criteria andAcceptedNotBetween(Integer value1, Integer value2) {
            addCriterion("accepted not between", value1, value2, "accepted");
            return (Criteria) this;
        }

        public Criteria andSubmitIsNull() {
            addCriterion("submit is null");
            return (Criteria) this;
        }

        public Criteria andSubmitIsNotNull() {
            addCriterion("submit is not null");
            return (Criteria) this;
        }

        public Criteria andSubmitEqualTo(Integer value) {
            addCriterion("submit =", value, "submit");
            return (Criteria) this;
        }

        public Criteria andSubmitNotEqualTo(Integer value) {
            addCriterion("submit <>", value, "submit");
            return (Criteria) this;
        }

        public Criteria andSubmitGreaterThan(Integer value) {
            addCriterion("submit >", value, "submit");
            return (Criteria) this;
        }

        public Criteria andSubmitGreaterThanOrEqualTo(Integer value) {
            addCriterion("submit >=", value, "submit");
            return (Criteria) this;
        }

        public Criteria andSubmitLessThan(Integer value) {
            addCriterion("submit <", value, "submit");
            return (Criteria) this;
        }

        public Criteria andSubmitLessThanOrEqualTo(Integer value) {
            addCriterion("submit <=", value, "submit");
            return (Criteria) this;
        }

        public Criteria andSubmitIn(List<Integer> values) {
            addCriterion("submit in", values, "submit");
            return (Criteria) this;
        }

        public Criteria andSubmitNotIn(List<Integer> values) {
            addCriterion("submit not in", values, "submit");
            return (Criteria) this;
        }

        public Criteria andSubmitBetween(Integer value1, Integer value2) {
            addCriterion("submit between", value1, value2, "submit");
            return (Criteria) this;
        }

        public Criteria andSubmitNotBetween(Integer value1, Integer value2) {
            addCriterion("submit not between", value1, value2, "submit");
            return (Criteria) this;
        }

        public Criteria andSolvedIsNull() {
            addCriterion("solved is null");
            return (Criteria) this;
        }

        public Criteria andSolvedIsNotNull() {
            addCriterion("solved is not null");
            return (Criteria) this;
        }

        public Criteria andSolvedEqualTo(Integer value) {
            addCriterion("solved =", value, "solved");
            return (Criteria) this;
        }

        public Criteria andSolvedNotEqualTo(Integer value) {
            addCriterion("solved <>", value, "solved");
            return (Criteria) this;
        }

        public Criteria andSolvedGreaterThan(Integer value) {
            addCriterion("solved >", value, "solved");
            return (Criteria) this;
        }

        public Criteria andSolvedGreaterThanOrEqualTo(Integer value) {
            addCriterion("solved >=", value, "solved");
            return (Criteria) this;
        }

        public Criteria andSolvedLessThan(Integer value) {
            addCriterion("solved <", value, "solved");
            return (Criteria) this;
        }

        public Criteria andSolvedLessThanOrEqualTo(Integer value) {
            addCriterion("solved <=", value, "solved");
            return (Criteria) this;
        }

        public Criteria andSolvedIn(List<Integer> values) {
            addCriterion("solved in", values, "solved");
            return (Criteria) this;
        }

        public Criteria andSolvedNotIn(List<Integer> values) {
            addCriterion("solved not in", values, "solved");
            return (Criteria) this;
        }

        public Criteria andSolvedBetween(Integer value1, Integer value2) {
            addCriterion("solved between", value1, value2, "solved");
            return (Criteria) this;
        }

        public Criteria andSolvedNotBetween(Integer value1, Integer value2) {
            addCriterion("solved not between", value1, value2, "solved");
            return (Criteria) this;
        }

        public Criteria andAddDatetimeIsNull() {
            addCriterion("add_datetime is null");
            return (Criteria) this;
        }

        public Criteria andAddDatetimeIsNotNull() {
            addCriterion("add_datetime is not null");
            return (Criteria) this;
        }

        public Criteria andAddDatetimeEqualTo(LocalDateTime value) {
            addCriterion("add_datetime =", value, "addDatetime");
            return (Criteria) this;
        }

        public Criteria andAddDatetimeNotEqualTo(LocalDateTime value) {
            addCriterion("add_datetime <>", value, "addDatetime");
            return (Criteria) this;
        }

        public Criteria andAddDatetimeGreaterThan(LocalDateTime value) {
            addCriterion("add_datetime >", value, "addDatetime");
            return (Criteria) this;
        }

        public Criteria andAddDatetimeGreaterThanOrEqualTo(LocalDateTime value) {
            addCriterion("add_datetime >=", value, "addDatetime");
            return (Criteria) this;
        }

        public Criteria andAddDatetimeLessThan(LocalDateTime value) {
            addCriterion("add_datetime <", value, "addDatetime");
            return (Criteria) this;
        }

        public Criteria andAddDatetimeLessThanOrEqualTo(LocalDateTime value) {
            addCriterion("add_datetime <=", value, "addDatetime");
            return (Criteria) this;
        }

        public Criteria andAddDatetimeIn(List<LocalDateTime> values) {
            addCriterion("add_datetime in", values, "addDatetime");
            return (Criteria) this;
        }

        public Criteria andAddDatetimeNotIn(List<LocalDateTime> values) {
            addCriterion("add_datetime not in", values, "addDatetime");
            return (Criteria) this;
        }

        public Criteria andAddDatetimeBetween(LocalDateTime value1, LocalDateTime value2) {
            addCriterion("add_datetime between", value1, value2, "addDatetime");
            return (Criteria) this;
        }

        public Criteria andAddDatetimeNotBetween(LocalDateTime value1, LocalDateTime value2) {
            addCriterion("add_datetime not between", value1, value2, "addDatetime");
            return (Criteria) this;
        }

        public Criteria andUpdateDatetimeIsNull() {
            addCriterion("update_datetime is null");
            return (Criteria) this;
        }

        public Criteria andUpdateDatetimeIsNotNull() {
            addCriterion("update_datetime is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateDatetimeEqualTo(LocalDateTime value) {
            addCriterion("update_datetime =", value, "updateDatetime");
            return (Criteria) this;
        }

        public Criteria andUpdateDatetimeNotEqualTo(LocalDateTime value) {
            addCriterion("update_datetime <>", value, "updateDatetime");
            return (Criteria) this;
        }

        public Criteria andUpdateDatetimeGreaterThan(LocalDateTime value) {
            addCriterion("update_datetime >", value, "updateDatetime");
            return (Criteria) this;
        }

        public Criteria andUpdateDatetimeGreaterThanOrEqualTo(LocalDateTime value) {
            addCriterion("update_datetime >=", value, "updateDatetime");
            return (Criteria) this;
        }

        public Criteria andUpdateDatetimeLessThan(LocalDateTime value) {
            addCriterion("update_datetime <", value, "updateDatetime");
            return (Criteria) this;
        }

        public Criteria andUpdateDatetimeLessThanOrEqualTo(LocalDateTime value) {
            addCriterion("update_datetime <=", value, "updateDatetime");
            return (Criteria) this;
        }

        public Criteria andUpdateDatetimeIn(List<LocalDateTime> values) {
            addCriterion("update_datetime in", values, "updateDatetime");
            return (Criteria) this;
        }

        public Criteria andUpdateDatetimeNotIn(List<LocalDateTime> values) {
            addCriterion("update_datetime not in", values, "updateDatetime");
            return (Criteria) this;
        }

        public Criteria andUpdateDatetimeBetween(LocalDateTime value1, LocalDateTime value2) {
            addCriterion("update_datetime between", value1, value2, "updateDatetime");
            return (Criteria) this;
        }

        public Criteria andUpdateDatetimeNotBetween(LocalDateTime value1, LocalDateTime value2) {
            addCriterion("update_datetime not between", value1, value2, "updateDatetime");
            return (Criteria) this;
        }

        public Criteria andDelIsNull() {
            addCriterion("del is null");
            return (Criteria) this;
        }

        public Criteria andDelIsNotNull() {
            addCriterion("del is not null");
            return (Criteria) this;
        }

        public Criteria andDelEqualTo(Integer value) {
            addCriterion("del =", value, "del");
            return (Criteria) this;
        }

        public Criteria andDelNotEqualTo(Integer value) {
            addCriterion("del <>", value, "del");
            return (Criteria) this;
        }

        public Criteria andDelGreaterThan(Integer value) {
            addCriterion("del >", value, "del");
            return (Criteria) this;
        }

        public Criteria andDelGreaterThanOrEqualTo(Integer value) {
            addCriterion("del >=", value, "del");
            return (Criteria) this;
        }

        public Criteria andDelLessThan(Integer value) {
            addCriterion("del <", value, "del");
            return (Criteria) this;
        }

        public Criteria andDelLessThanOrEqualTo(Integer value) {
            addCriterion("del <=", value, "del");
            return (Criteria) this;
        }

        public Criteria andDelIn(List<Integer> values) {
            addCriterion("del in", values, "del");
            return (Criteria) this;
        }

        public Criteria andDelNotIn(List<Integer> values) {
            addCriterion("del not in", values, "del");
            return (Criteria) this;
        }

        public Criteria andDelBetween(Integer value1, Integer value2) {
            addCriterion("del between", value1, value2, "del");
            return (Criteria) this;
        }

        public Criteria andDelNotBetween(Integer value1, Integer value2) {
            addCriterion("del not between", value1, value2, "del");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table _cproblem
     *
     * @mbg.generated do_not_delete_during_merge Sat Dec 22 11:39:09 CST 2018
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table _cproblem
     *
     * @mbg.generated Sat Dec 22 11:39:09 CST 2018
     */
    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}