package cn.edu.nju.software.judge.beans;

import java.io.Serializable;
import java.time.LocalDateTime;

public class Cproblem implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column _cproblem.cproblem_id
     *
     * @mbg.generated Sat Dec 22 11:39:09 CST 2018
     */
    private Integer cproblemId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column _cproblem.contest_id
     *
     * @mbg.generated Sat Dec 22 11:39:09 CST 2018
     */
    private Integer contestId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column _cproblem.problem_id
     *
     * @mbg.generated Sat Dec 22 11:39:09 CST 2018
     */
    private Integer problemId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column _cproblem.num
     *
     * @mbg.generated Sat Dec 22 11:39:09 CST 2018
     */
    private String num;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column _cproblem.title
     *
     * @mbg.generated Sat Dec 22 11:39:09 CST 2018
     */
    private String title;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column _cproblem.accepted
     *
     * @mbg.generated Sat Dec 22 11:39:09 CST 2018
     */
    private Integer accepted;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column _cproblem.submit
     *
     * @mbg.generated Sat Dec 22 11:39:09 CST 2018
     */
    private Integer submit;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column _cproblem.solved
     *
     * @mbg.generated Sat Dec 22 11:39:09 CST 2018
     */
    private Integer solved;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column _cproblem.add_datetime
     *
     * @mbg.generated Sat Dec 22 11:39:09 CST 2018
     */
    private LocalDateTime addDatetime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column _cproblem.update_datetime
     *
     * @mbg.generated Sat Dec 22 11:39:09 CST 2018
     */
    private LocalDateTime updateDatetime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column _cproblem.del
     *
     * @mbg.generated Sat Dec 22 11:39:09 CST 2018
     */
    private Integer del;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table _cproblem
     *
     * @mbg.generated Sat Dec 22 11:39:09 CST 2018
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column _cproblem.cproblem_id
     *
     * @return the value of _cproblem.cproblem_id
     *
     * @mbg.generated Sat Dec 22 11:39:09 CST 2018
     */
    public Integer getCproblemId() {
        return cproblemId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column _cproblem.cproblem_id
     *
     * @param cproblemId the value for _cproblem.cproblem_id
     *
     * @mbg.generated Sat Dec 22 11:39:09 CST 2018
     */
    public void setCproblemId(Integer cproblemId) {
        this.cproblemId = cproblemId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column _cproblem.contest_id
     *
     * @return the value of _cproblem.contest_id
     *
     * @mbg.generated Sat Dec 22 11:39:09 CST 2018
     */
    public Integer getContestId() {
        return contestId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column _cproblem.contest_id
     *
     * @param contestId the value for _cproblem.contest_id
     *
     * @mbg.generated Sat Dec 22 11:39:09 CST 2018
     */
    public void setContestId(Integer contestId) {
        this.contestId = contestId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column _cproblem.problem_id
     *
     * @return the value of _cproblem.problem_id
     *
     * @mbg.generated Sat Dec 22 11:39:09 CST 2018
     */
    public Integer getProblemId() {
        return problemId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column _cproblem.problem_id
     *
     * @param problemId the value for _cproblem.problem_id
     *
     * @mbg.generated Sat Dec 22 11:39:09 CST 2018
     */
    public void setProblemId(Integer problemId) {
        this.problemId = problemId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column _cproblem.num
     *
     * @return the value of _cproblem.num
     *
     * @mbg.generated Sat Dec 22 11:39:09 CST 2018
     */
    public String getNum() {
        return num;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column _cproblem.num
     *
     * @param num the value for _cproblem.num
     *
     * @mbg.generated Sat Dec 22 11:39:09 CST 2018
     */
    public void setNum(String num) {
        this.num = num;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column _cproblem.title
     *
     * @return the value of _cproblem.title
     *
     * @mbg.generated Sat Dec 22 11:39:09 CST 2018
     */
    public String getTitle() {
        return title;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column _cproblem.title
     *
     * @param title the value for _cproblem.title
     *
     * @mbg.generated Sat Dec 22 11:39:09 CST 2018
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column _cproblem.accepted
     *
     * @return the value of _cproblem.accepted
     *
     * @mbg.generated Sat Dec 22 11:39:09 CST 2018
     */
    public Integer getAccepted() {
        return accepted;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column _cproblem.accepted
     *
     * @param accepted the value for _cproblem.accepted
     *
     * @mbg.generated Sat Dec 22 11:39:09 CST 2018
     */
    public void setAccepted(Integer accepted) {
        this.accepted = accepted;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column _cproblem.submit
     *
     * @return the value of _cproblem.submit
     *
     * @mbg.generated Sat Dec 22 11:39:09 CST 2018
     */
    public Integer getSubmit() {
        return submit;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column _cproblem.submit
     *
     * @param submit the value for _cproblem.submit
     *
     * @mbg.generated Sat Dec 22 11:39:09 CST 2018
     */
    public void setSubmit(Integer submit) {
        this.submit = submit;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column _cproblem.solved
     *
     * @return the value of _cproblem.solved
     *
     * @mbg.generated Sat Dec 22 11:39:09 CST 2018
     */
    public Integer getSolved() {
        return solved;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column _cproblem.solved
     *
     * @param solved the value for _cproblem.solved
     *
     * @mbg.generated Sat Dec 22 11:39:09 CST 2018
     */
    public void setSolved(Integer solved) {
        this.solved = solved;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column _cproblem.add_datetime
     *
     * @return the value of _cproblem.add_datetime
     *
     * @mbg.generated Sat Dec 22 11:39:09 CST 2018
     */
    public LocalDateTime getAddDatetime() {
        return addDatetime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column _cproblem.add_datetime
     *
     * @param addDatetime the value for _cproblem.add_datetime
     *
     * @mbg.generated Sat Dec 22 11:39:09 CST 2018
     */
    public void setAddDatetime(LocalDateTime addDatetime) {
        this.addDatetime = addDatetime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column _cproblem.update_datetime
     *
     * @return the value of _cproblem.update_datetime
     *
     * @mbg.generated Sat Dec 22 11:39:09 CST 2018
     */
    public LocalDateTime getUpdateDatetime() {
        return updateDatetime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column _cproblem.update_datetime
     *
     * @param updateDatetime the value for _cproblem.update_datetime
     *
     * @mbg.generated Sat Dec 22 11:39:09 CST 2018
     */
    public void setUpdateDatetime(LocalDateTime updateDatetime) {
        this.updateDatetime = updateDatetime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column _cproblem.del
     *
     * @return the value of _cproblem.del
     *
     * @mbg.generated Sat Dec 22 11:39:09 CST 2018
     */
    public Integer getDel() {
        return del;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column _cproblem.del
     *
     * @param del the value for _cproblem.del
     *
     * @mbg.generated Sat Dec 22 11:39:09 CST 2018
     */
    public void setDel(Integer del) {
        this.del = del;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table _cproblem
     *
     * @mbg.generated Sat Dec 22 11:39:09 CST 2018
     */
    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        Cproblem other = (Cproblem) that;
        return (this.getCproblemId() == null ? other.getCproblemId() == null : this.getCproblemId().equals(other.getCproblemId()))
            && (this.getContestId() == null ? other.getContestId() == null : this.getContestId().equals(other.getContestId()))
            && (this.getProblemId() == null ? other.getProblemId() == null : this.getProblemId().equals(other.getProblemId()))
            && (this.getNum() == null ? other.getNum() == null : this.getNum().equals(other.getNum()))
            && (this.getTitle() == null ? other.getTitle() == null : this.getTitle().equals(other.getTitle()))
            && (this.getAccepted() == null ? other.getAccepted() == null : this.getAccepted().equals(other.getAccepted()))
            && (this.getSubmit() == null ? other.getSubmit() == null : this.getSubmit().equals(other.getSubmit()))
            && (this.getSolved() == null ? other.getSolved() == null : this.getSolved().equals(other.getSolved()))
            && (this.getAddDatetime() == null ? other.getAddDatetime() == null : this.getAddDatetime().equals(other.getAddDatetime()))
            && (this.getUpdateDatetime() == null ? other.getUpdateDatetime() == null : this.getUpdateDatetime().equals(other.getUpdateDatetime()))
            && (this.getDel() == null ? other.getDel() == null : this.getDel().equals(other.getDel()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table _cproblem
     *
     * @mbg.generated Sat Dec 22 11:39:09 CST 2018
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getCproblemId() == null) ? 0 : getCproblemId().hashCode());
        result = prime * result + ((getContestId() == null) ? 0 : getContestId().hashCode());
        result = prime * result + ((getProblemId() == null) ? 0 : getProblemId().hashCode());
        result = prime * result + ((getNum() == null) ? 0 : getNum().hashCode());
        result = prime * result + ((getTitle() == null) ? 0 : getTitle().hashCode());
        result = prime * result + ((getAccepted() == null) ? 0 : getAccepted().hashCode());
        result = prime * result + ((getSubmit() == null) ? 0 : getSubmit().hashCode());
        result = prime * result + ((getSolved() == null) ? 0 : getSolved().hashCode());
        result = prime * result + ((getAddDatetime() == null) ? 0 : getAddDatetime().hashCode());
        result = prime * result + ((getUpdateDatetime() == null) ? 0 : getUpdateDatetime().hashCode());
        result = prime * result + ((getDel() == null) ? 0 : getDel().hashCode());
        return result;
    }
}