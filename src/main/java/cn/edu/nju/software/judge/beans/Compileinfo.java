package cn.edu.nju.software.judge.beans;

import java.io.Serializable;

public class Compileinfo implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column _compileinfo.submission_id
     *
     * @mbg.generated Sat Dec 22 11:39:09 CST 2018
     */
    private Integer submissionId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column _compileinfo.error
     *
     * @mbg.generated Sat Dec 22 11:39:09 CST 2018
     */
    private String error;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table _compileinfo
     *
     * @mbg.generated Sat Dec 22 11:39:09 CST 2018
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column _compileinfo.submission_id
     *
     * @return the value of _compileinfo.submission_id
     *
     * @mbg.generated Sat Dec 22 11:39:09 CST 2018
     */
    public Integer getSubmissionId() {
        return submissionId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column _compileinfo.submission_id
     *
     * @param submissionId the value for _compileinfo.submission_id
     *
     * @mbg.generated Sat Dec 22 11:39:09 CST 2018
     */
    public void setSubmissionId(Integer submissionId) {
        this.submissionId = submissionId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column _compileinfo.error
     *
     * @return the value of _compileinfo.error
     *
     * @mbg.generated Sat Dec 22 11:39:09 CST 2018
     */
    public String getError() {
        return error;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column _compileinfo.error
     *
     * @param error the value for _compileinfo.error
     *
     * @mbg.generated Sat Dec 22 11:39:09 CST 2018
     */
    public void setError(String error) {
        this.error = error;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table _compileinfo
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
        Compileinfo other = (Compileinfo) that;
        return (this.getSubmissionId() == null ? other.getSubmissionId() == null : this.getSubmissionId().equals(other.getSubmissionId()))
            && (this.getError() == null ? other.getError() == null : this.getError().equals(other.getError()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table _compileinfo
     *
     * @mbg.generated Sat Dec 22 11:39:09 CST 2018
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getSubmissionId() == null) ? 0 : getSubmissionId().hashCode());
        result = prime * result + ((getError() == null) ? 0 : getError().hashCode());
        return result;
    }
}