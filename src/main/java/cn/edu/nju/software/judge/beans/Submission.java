package cn.edu.nju.software.judge.beans;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;

public class Submission implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column _submission.submission_id
     *
     * @mbg.generated Sat Dec 22 11:39:09 CST 2018
     */
    private Integer submissionId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column _submission.problem_id
     *
     * @mbg.generated Sat Dec 22 11:39:09 CST 2018
     */
    private Integer problemId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column _submission.contest_id
     *
     * @mbg.generated Sat Dec 22 11:39:09 CST 2018
     */
    private Integer contestId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column _submission.contest_num
     *
     * @mbg.generated Sat Dec 22 11:39:09 CST 2018
     */
    private String contestNum;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column _submission.user_id
     *
     * @mbg.generated Sat Dec 22 11:39:09 CST 2018
     */
    private Integer userId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column _submission.user_name
     *
     * @mbg.generated Sat Dec 22 11:39:09 CST 2018
     */
    private String userName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column _submission.result
     *
     * @mbg.generated Sat Dec 22 11:39:09 CST 2018
     */
    private Short result;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column _submission.time
     *
     * @mbg.generated Sat Dec 22 11:39:09 CST 2018
     */
    private Integer time;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column _submission.memory
     *
     * @mbg.generated Sat Dec 22 11:39:09 CST 2018
     */
    private Integer memory;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column _submission.submit_time
     *
     * @mbg.generated Sat Dec 22 11:39:09 CST 2018
     */
    private LocalDateTime submitTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column _submission.language
     *
     * @mbg.generated Sat Dec 22 11:39:09 CST 2018
     */
    private Integer language;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column _submission.open
     *
     * @mbg.generated Sat Dec 22 11:39:09 CST 2018
     */
    private Short open;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column _submission.disp_language
     *
     * @mbg.generated Sat Dec 22 11:39:09 CST 2018
     */
    private String dispLanguage;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column _submission.username
     *
     * @mbg.generated Sat Dec 22 11:39:09 CST 2018
     */
    private String username;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column _submission.status_canonical
     *
     * @mbg.generated Sat Dec 22 11:39:09 CST 2018
     */
    private String statusCanonical;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column _submission.source_length
     *
     * @mbg.generated Sat Dec 22 11:39:09 CST 2018
     */
    private Integer sourceLength;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column _submission.valid
     *
     * @mbg.generated Sat Dec 22 11:39:09 CST 2018
     */
    private Byte valid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column _submission.judge_time
     *
     * @mbg.generated Sat Dec 22 11:39:09 CST 2018
     */
    private LocalDateTime judgeTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column _submission.pass_rate
     *
     * @mbg.generated Sat Dec 22 11:39:09 CST 2018
     */
    private BigDecimal passRate;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column _submission.judger
     *
     * @mbg.generated Sat Dec 22 11:39:09 CST 2018
     */
    private String judger;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column _submission.add_datetime
     *
     * @mbg.generated Sat Dec 22 11:39:09 CST 2018
     */
    private LocalDateTime addDatetime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column _submission.update_datetime
     *
     * @mbg.generated Sat Dec 22 11:39:09 CST 2018
     */
    private LocalDateTime updateDatetime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column _submission.del
     *
     * @mbg.generated Sat Dec 22 11:39:09 CST 2018
     */
    private Integer del;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table _submission
     *
     * @mbg.generated Sat Dec 22 11:39:09 CST 2018
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column _submission.submission_id
     *
     * @return the value of _submission.submission_id
     *
     * @mbg.generated Sat Dec 22 11:39:09 CST 2018
     */
    public Integer getSubmissionId() {
        return submissionId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column _submission.submission_id
     *
     * @param submissionId the value for _submission.submission_id
     *
     * @mbg.generated Sat Dec 22 11:39:09 CST 2018
     */
    public void setSubmissionId(Integer submissionId) {
        this.submissionId = submissionId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column _submission.problem_id
     *
     * @return the value of _submission.problem_id
     *
     * @mbg.generated Sat Dec 22 11:39:09 CST 2018
     */
    public Integer getProblemId() {
        return problemId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column _submission.problem_id
     *
     * @param problemId the value for _submission.problem_id
     *
     * @mbg.generated Sat Dec 22 11:39:09 CST 2018
     */
    public void setProblemId(Integer problemId) {
        this.problemId = problemId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column _submission.contest_id
     *
     * @return the value of _submission.contest_id
     *
     * @mbg.generated Sat Dec 22 11:39:09 CST 2018
     */
    public Integer getContestId() {
        return contestId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column _submission.contest_id
     *
     * @param contestId the value for _submission.contest_id
     *
     * @mbg.generated Sat Dec 22 11:39:09 CST 2018
     */
    public void setContestId(Integer contestId) {
        this.contestId = contestId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column _submission.contest_num
     *
     * @return the value of _submission.contest_num
     *
     * @mbg.generated Sat Dec 22 11:39:09 CST 2018
     */
    public String getContestNum() {
        return contestNum;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column _submission.contest_num
     *
     * @param contestNum the value for _submission.contest_num
     *
     * @mbg.generated Sat Dec 22 11:39:09 CST 2018
     */
    public void setContestNum(String contestNum) {
        this.contestNum = contestNum;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column _submission.user_id
     *
     * @return the value of _submission.user_id
     *
     * @mbg.generated Sat Dec 22 11:39:09 CST 2018
     */
    public Integer getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column _submission.user_id
     *
     * @param userId the value for _submission.user_id
     *
     * @mbg.generated Sat Dec 22 11:39:09 CST 2018
     */
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column _submission.user_name
     *
     * @return the value of _submission.user_name
     *
     * @mbg.generated Sat Dec 22 11:39:09 CST 2018
     */
    public String getUserName() {
        return userName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column _submission.user_name
     *
     * @param userName the value for _submission.user_name
     *
     * @mbg.generated Sat Dec 22 11:39:09 CST 2018
     */
    public void setUserName(String userName) {
        this.userName = userName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column _submission.result
     *
     * @return the value of _submission.result
     *
     * @mbg.generated Sat Dec 22 11:39:09 CST 2018
     */
    public Short getResult() {
        return result;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column _submission.result
     *
     * @param result the value for _submission.result
     *
     * @mbg.generated Sat Dec 22 11:39:09 CST 2018
     */
    public void setResult(Short result) {
        this.result = result;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column _submission.time
     *
     * @return the value of _submission.time
     *
     * @mbg.generated Sat Dec 22 11:39:09 CST 2018
     */
    public Integer getTime() {
        return time;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column _submission.time
     *
     * @param time the value for _submission.time
     *
     * @mbg.generated Sat Dec 22 11:39:09 CST 2018
     */
    public void setTime(Integer time) {
        this.time = time;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column _submission.memory
     *
     * @return the value of _submission.memory
     *
     * @mbg.generated Sat Dec 22 11:39:09 CST 2018
     */
    public Integer getMemory() {
        return memory;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column _submission.memory
     *
     * @param memory the value for _submission.memory
     *
     * @mbg.generated Sat Dec 22 11:39:09 CST 2018
     */
    public void setMemory(Integer memory) {
        this.memory = memory;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column _submission.submit_time
     *
     * @return the value of _submission.submit_time
     *
     * @mbg.generated Sat Dec 22 11:39:09 CST 2018
     */
    public LocalDateTime getSubmitTime() {
        return submitTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column _submission.submit_time
     *
     * @param submitTime the value for _submission.submit_time
     *
     * @mbg.generated Sat Dec 22 11:39:09 CST 2018
     */
    public void setSubmitTime(LocalDateTime submitTime) {
        this.submitTime = submitTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column _submission.language
     *
     * @return the value of _submission.language
     *
     * @mbg.generated Sat Dec 22 11:39:09 CST 2018
     */
    public Integer getLanguage() {
        return language;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column _submission.language
     *
     * @param language the value for _submission.language
     *
     * @mbg.generated Sat Dec 22 11:39:09 CST 2018
     */
    public void setLanguage(Integer language) {
        this.language = language;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column _submission.open
     *
     * @return the value of _submission.open
     *
     * @mbg.generated Sat Dec 22 11:39:09 CST 2018
     */
    public Short getOpen() {
        return open;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column _submission.open
     *
     * @param open the value for _submission.open
     *
     * @mbg.generated Sat Dec 22 11:39:09 CST 2018
     */
    public void setOpen(Short open) {
        this.open = open;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column _submission.disp_language
     *
     * @return the value of _submission.disp_language
     *
     * @mbg.generated Sat Dec 22 11:39:09 CST 2018
     */
    public String getDispLanguage() {
        return dispLanguage;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column _submission.disp_language
     *
     * @param dispLanguage the value for _submission.disp_language
     *
     * @mbg.generated Sat Dec 22 11:39:09 CST 2018
     */
    public void setDispLanguage(String dispLanguage) {
        this.dispLanguage = dispLanguage;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column _submission.username
     *
     * @return the value of _submission.username
     *
     * @mbg.generated Sat Dec 22 11:39:09 CST 2018
     */
    public String getUsername() {
        return username;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column _submission.username
     *
     * @param username the value for _submission.username
     *
     * @mbg.generated Sat Dec 22 11:39:09 CST 2018
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column _submission.status_canonical
     *
     * @return the value of _submission.status_canonical
     *
     * @mbg.generated Sat Dec 22 11:39:09 CST 2018
     */
    public String getStatusCanonical() {
        return statusCanonical;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column _submission.status_canonical
     *
     * @param statusCanonical the value for _submission.status_canonical
     *
     * @mbg.generated Sat Dec 22 11:39:09 CST 2018
     */
    public void setStatusCanonical(String statusCanonical) {
        this.statusCanonical = statusCanonical;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column _submission.source_length
     *
     * @return the value of _submission.source_length
     *
     * @mbg.generated Sat Dec 22 11:39:09 CST 2018
     */
    public Integer getSourceLength() {
        return sourceLength;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column _submission.source_length
     *
     * @param sourceLength the value for _submission.source_length
     *
     * @mbg.generated Sat Dec 22 11:39:09 CST 2018
     */
    public void setSourceLength(Integer sourceLength) {
        this.sourceLength = sourceLength;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column _submission.valid
     *
     * @return the value of _submission.valid
     *
     * @mbg.generated Sat Dec 22 11:39:09 CST 2018
     */
    public Byte getValid() {
        return valid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column _submission.valid
     *
     * @param valid the value for _submission.valid
     *
     * @mbg.generated Sat Dec 22 11:39:09 CST 2018
     */
    public void setValid(Byte valid) {
        this.valid = valid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column _submission.judge_time
     *
     * @return the value of _submission.judge_time
     *
     * @mbg.generated Sat Dec 22 11:39:09 CST 2018
     */
    public LocalDateTime getJudgeTime() {
        return judgeTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column _submission.judge_time
     *
     * @param judgeTime the value for _submission.judge_time
     *
     * @mbg.generated Sat Dec 22 11:39:09 CST 2018
     */
    public void setJudgeTime(LocalDateTime judgeTime) {
        this.judgeTime = judgeTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column _submission.pass_rate
     *
     * @return the value of _submission.pass_rate
     *
     * @mbg.generated Sat Dec 22 11:39:09 CST 2018
     */
    public BigDecimal getPassRate() {
        return passRate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column _submission.pass_rate
     *
     * @param passRate the value for _submission.pass_rate
     *
     * @mbg.generated Sat Dec 22 11:39:09 CST 2018
     */
    public void setPassRate(BigDecimal passRate) {
        this.passRate = passRate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column _submission.judger
     *
     * @return the value of _submission.judger
     *
     * @mbg.generated Sat Dec 22 11:39:09 CST 2018
     */
    public String getJudger() {
        return judger;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column _submission.judger
     *
     * @param judger the value for _submission.judger
     *
     * @mbg.generated Sat Dec 22 11:39:09 CST 2018
     */
    public void setJudger(String judger) {
        this.judger = judger;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column _submission.add_datetime
     *
     * @return the value of _submission.add_datetime
     *
     * @mbg.generated Sat Dec 22 11:39:09 CST 2018
     */
    public LocalDateTime getAddDatetime() {
        return addDatetime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column _submission.add_datetime
     *
     * @param addDatetime the value for _submission.add_datetime
     *
     * @mbg.generated Sat Dec 22 11:39:09 CST 2018
     */
    public void setAddDatetime(LocalDateTime addDatetime) {
        this.addDatetime = addDatetime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column _submission.update_datetime
     *
     * @return the value of _submission.update_datetime
     *
     * @mbg.generated Sat Dec 22 11:39:09 CST 2018
     */
    public LocalDateTime getUpdateDatetime() {
        return updateDatetime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column _submission.update_datetime
     *
     * @param updateDatetime the value for _submission.update_datetime
     *
     * @mbg.generated Sat Dec 22 11:39:09 CST 2018
     */
    public void setUpdateDatetime(LocalDateTime updateDatetime) {
        this.updateDatetime = updateDatetime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column _submission.del
     *
     * @return the value of _submission.del
     *
     * @mbg.generated Sat Dec 22 11:39:09 CST 2018
     */
    public Integer getDel() {
        return del;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column _submission.del
     *
     * @param del the value for _submission.del
     *
     * @mbg.generated Sat Dec 22 11:39:09 CST 2018
     */
    public void setDel(Integer del) {
        this.del = del;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table _submission
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
        Submission other = (Submission) that;
        return (this.getSubmissionId() == null ? other.getSubmissionId() == null : this.getSubmissionId().equals(other.getSubmissionId()))
            && (this.getProblemId() == null ? other.getProblemId() == null : this.getProblemId().equals(other.getProblemId()))
            && (this.getContestId() == null ? other.getContestId() == null : this.getContestId().equals(other.getContestId()))
            && (this.getContestNum() == null ? other.getContestNum() == null : this.getContestNum().equals(other.getContestNum()))
            && (this.getUserId() == null ? other.getUserId() == null : this.getUserId().equals(other.getUserId()))
            && (this.getUserName() == null ? other.getUserName() == null : this.getUserName().equals(other.getUserName()))
            && (this.getResult() == null ? other.getResult() == null : this.getResult().equals(other.getResult()))
            && (this.getTime() == null ? other.getTime() == null : this.getTime().equals(other.getTime()))
            && (this.getMemory() == null ? other.getMemory() == null : this.getMemory().equals(other.getMemory()))
            && (this.getSubmitTime() == null ? other.getSubmitTime() == null : this.getSubmitTime().equals(other.getSubmitTime()))
            && (this.getLanguage() == null ? other.getLanguage() == null : this.getLanguage().equals(other.getLanguage()))
            && (this.getOpen() == null ? other.getOpen() == null : this.getOpen().equals(other.getOpen()))
            && (this.getDispLanguage() == null ? other.getDispLanguage() == null : this.getDispLanguage().equals(other.getDispLanguage()))
            && (this.getUsername() == null ? other.getUsername() == null : this.getUsername().equals(other.getUsername()))
            && (this.getStatusCanonical() == null ? other.getStatusCanonical() == null : this.getStatusCanonical().equals(other.getStatusCanonical()))
            && (this.getSourceLength() == null ? other.getSourceLength() == null : this.getSourceLength().equals(other.getSourceLength()))
            && (this.getValid() == null ? other.getValid() == null : this.getValid().equals(other.getValid()))
            && (this.getJudgeTime() == null ? other.getJudgeTime() == null : this.getJudgeTime().equals(other.getJudgeTime()))
            && (this.getPassRate() == null ? other.getPassRate() == null : this.getPassRate().equals(other.getPassRate()))
            && (this.getJudger() == null ? other.getJudger() == null : this.getJudger().equals(other.getJudger()))
            && (this.getAddDatetime() == null ? other.getAddDatetime() == null : this.getAddDatetime().equals(other.getAddDatetime()))
            && (this.getUpdateDatetime() == null ? other.getUpdateDatetime() == null : this.getUpdateDatetime().equals(other.getUpdateDatetime()))
            && (this.getDel() == null ? other.getDel() == null : this.getDel().equals(other.getDel()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table _submission
     *
     * @mbg.generated Sat Dec 22 11:39:09 CST 2018
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getSubmissionId() == null) ? 0 : getSubmissionId().hashCode());
        result = prime * result + ((getProblemId() == null) ? 0 : getProblemId().hashCode());
        result = prime * result + ((getContestId() == null) ? 0 : getContestId().hashCode());
        result = prime * result + ((getContestNum() == null) ? 0 : getContestNum().hashCode());
        result = prime * result + ((getUserId() == null) ? 0 : getUserId().hashCode());
        result = prime * result + ((getUserName() == null) ? 0 : getUserName().hashCode());
        result = prime * result + ((getResult() == null) ? 0 : getResult().hashCode());
        result = prime * result + ((getTime() == null) ? 0 : getTime().hashCode());
        result = prime * result + ((getMemory() == null) ? 0 : getMemory().hashCode());
        result = prime * result + ((getSubmitTime() == null) ? 0 : getSubmitTime().hashCode());
        result = prime * result + ((getLanguage() == null) ? 0 : getLanguage().hashCode());
        result = prime * result + ((getOpen() == null) ? 0 : getOpen().hashCode());
        result = prime * result + ((getDispLanguage() == null) ? 0 : getDispLanguage().hashCode());
        result = prime * result + ((getUsername() == null) ? 0 : getUsername().hashCode());
        result = prime * result + ((getStatusCanonical() == null) ? 0 : getStatusCanonical().hashCode());
        result = prime * result + ((getSourceLength() == null) ? 0 : getSourceLength().hashCode());
        result = prime * result + ((getValid() == null) ? 0 : getValid().hashCode());
        result = prime * result + ((getJudgeTime() == null) ? 0 : getJudgeTime().hashCode());
        result = prime * result + ((getPassRate() == null) ? 0 : getPassRate().hashCode());
        result = prime * result + ((getJudger() == null) ? 0 : getJudger().hashCode());
        result = prime * result + ((getAddDatetime() == null) ? 0 : getAddDatetime().hashCode());
        result = prime * result + ((getUpdateDatetime() == null) ? 0 : getUpdateDatetime().hashCode());
        result = prime * result + ((getDel() == null) ? 0 : getDel().hashCode());
        return result;
    }
}