package domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class ProductExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ProductExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

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

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
        }

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andCpmIsNull() {
            addCriterion("cpm is null");
            return (Criteria) this;
        }

        public Criteria andCpmIsNotNull() {
            addCriterion("cpm is not null");
            return (Criteria) this;
        }

        public Criteria andCpmEqualTo(String value) {
            addCriterion("cpm =", value, "cpm");
            return (Criteria) this;
        }

        public Criteria andCpmNotEqualTo(String value) {
            addCriterion("cpm <>", value, "cpm");
            return (Criteria) this;
        }

        public Criteria andCpmGreaterThan(String value) {
            addCriterion("cpm >", value, "cpm");
            return (Criteria) this;
        }

        public Criteria andCpmGreaterThanOrEqualTo(String value) {
            addCriterion("cpm >=", value, "cpm");
            return (Criteria) this;
        }

        public Criteria andCpmLessThan(String value) {
            addCriterion("cpm <", value, "cpm");
            return (Criteria) this;
        }

        public Criteria andCpmLessThanOrEqualTo(String value) {
            addCriterion("cpm <=", value, "cpm");
            return (Criteria) this;
        }

        public Criteria andCpmLike(String value) {
            addCriterion("cpm like", value, "cpm");
            return (Criteria) this;
        }

        public Criteria andCpmNotLike(String value) {
            addCriterion("cpm not like", value, "cpm");
            return (Criteria) this;
        }

        public Criteria andCpmIn(List<String> values) {
            addCriterion("cpm in", values, "cpm");
            return (Criteria) this;
        }

        public Criteria andCpmNotIn(List<String> values) {
            addCriterion("cpm not in", values, "cpm");
            return (Criteria) this;
        }

        public Criteria andCpmBetween(String value1, String value2) {
            addCriterion("cpm between", value1, value2, "cpm");
            return (Criteria) this;
        }

        public Criteria andCpmNotBetween(String value1, String value2) {
            addCriterion("cpm not between", value1, value2, "cpm");
            return (Criteria) this;
        }

        public Criteria andHhIsNull() {
            addCriterion("hh is null");
            return (Criteria) this;
        }

        public Criteria andHhIsNotNull() {
            addCriterion("hh is not null");
            return (Criteria) this;
        }

        public Criteria andHhEqualTo(String value) {
            addCriterion("hh =", value, "hh");
            return (Criteria) this;
        }

        public Criteria andHhNotEqualTo(String value) {
            addCriterion("hh <>", value, "hh");
            return (Criteria) this;
        }

        public Criteria andHhGreaterThan(String value) {
            addCriterion("hh >", value, "hh");
            return (Criteria) this;
        }

        public Criteria andHhGreaterThanOrEqualTo(String value) {
            addCriterion("hh >=", value, "hh");
            return (Criteria) this;
        }

        public Criteria andHhLessThan(String value) {
            addCriterion("hh <", value, "hh");
            return (Criteria) this;
        }

        public Criteria andHhLessThanOrEqualTo(String value) {
            addCriterion("hh <=", value, "hh");
            return (Criteria) this;
        }

        public Criteria andHhLike(String value) {
            addCriterion("hh like", value, "hh");
            return (Criteria) this;
        }

        public Criteria andHhNotLike(String value) {
            addCriterion("hh not like", value, "hh");
            return (Criteria) this;
        }

        public Criteria andHhIn(List<String> values) {
            addCriterion("hh in", values, "hh");
            return (Criteria) this;
        }

        public Criteria andHhNotIn(List<String> values) {
            addCriterion("hh not in", values, "hh");
            return (Criteria) this;
        }

        public Criteria andHhBetween(String value1, String value2) {
            addCriterion("hh between", value1, value2, "hh");
            return (Criteria) this;
        }

        public Criteria andHhNotBetween(String value1, String value2) {
            addCriterion("hh not between", value1, value2, "hh");
            return (Criteria) this;
        }

        public Criteria andTxmIsNull() {
            addCriterion("txm is null");
            return (Criteria) this;
        }

        public Criteria andTxmIsNotNull() {
            addCriterion("txm is not null");
            return (Criteria) this;
        }

        public Criteria andTxmEqualTo(String value) {
            addCriterion("txm =", value, "txm");
            return (Criteria) this;
        }

        public Criteria andTxmNotEqualTo(String value) {
            addCriterion("txm <>", value, "txm");
            return (Criteria) this;
        }

        public Criteria andTxmGreaterThan(String value) {
            addCriterion("txm >", value, "txm");
            return (Criteria) this;
        }

        public Criteria andTxmGreaterThanOrEqualTo(String value) {
            addCriterion("txm >=", value, "txm");
            return (Criteria) this;
        }

        public Criteria andTxmLessThan(String value) {
            addCriterion("txm <", value, "txm");
            return (Criteria) this;
        }

        public Criteria andTxmLessThanOrEqualTo(String value) {
            addCriterion("txm <=", value, "txm");
            return (Criteria) this;
        }

        public Criteria andTxmLike(String value) {
            addCriterion("txm like", value, "txm");
            return (Criteria) this;
        }

        public Criteria andTxmNotLike(String value) {
            addCriterion("txm not like", value, "txm");
            return (Criteria) this;
        }

        public Criteria andTxmIn(List<String> values) {
            addCriterion("txm in", values, "txm");
            return (Criteria) this;
        }

        public Criteria andTxmNotIn(List<String> values) {
            addCriterion("txm not in", values, "txm");
            return (Criteria) this;
        }

        public Criteria andTxmBetween(String value1, String value2) {
            addCriterion("txm between", value1, value2, "txm");
            return (Criteria) this;
        }

        public Criteria andTxmNotBetween(String value1, String value2) {
            addCriterion("txm not between", value1, value2, "txm");
            return (Criteria) this;
        }

        public Criteria andLbIsNull() {
            addCriterion("lb is null");
            return (Criteria) this;
        }

        public Criteria andLbIsNotNull() {
            addCriterion("lb is not null");
            return (Criteria) this;
        }

        public Criteria andLbEqualTo(String value) {
            addCriterion("lb =", value, "lb");
            return (Criteria) this;
        }

        public Criteria andLbNotEqualTo(String value) {
            addCriterion("lb <>", value, "lb");
            return (Criteria) this;
        }

        public Criteria andLbGreaterThan(String value) {
            addCriterion("lb >", value, "lb");
            return (Criteria) this;
        }

        public Criteria andLbGreaterThanOrEqualTo(String value) {
            addCriterion("lb >=", value, "lb");
            return (Criteria) this;
        }

        public Criteria andLbLessThan(String value) {
            addCriterion("lb <", value, "lb");
            return (Criteria) this;
        }

        public Criteria andLbLessThanOrEqualTo(String value) {
            addCriterion("lb <=", value, "lb");
            return (Criteria) this;
        }

        public Criteria andLbLike(String value) {
            addCriterion("lb like", value, "lb");
            return (Criteria) this;
        }

        public Criteria andLbNotLike(String value) {
            addCriterion("lb not like", value, "lb");
            return (Criteria) this;
        }

        public Criteria andLbIn(List<String> values) {
            addCriterion("lb in", values, "lb");
            return (Criteria) this;
        }

        public Criteria andLbNotIn(List<String> values) {
            addCriterion("lb not in", values, "lb");
            return (Criteria) this;
        }

        public Criteria andLbBetween(String value1, String value2) {
            addCriterion("lb between", value1, value2, "lb");
            return (Criteria) this;
        }

        public Criteria andLbNotBetween(String value1, String value2) {
            addCriterion("lb not between", value1, value2, "lb");
            return (Criteria) this;
        }

        public Criteria andStyleIsNull() {
            addCriterion("style is null");
            return (Criteria) this;
        }

        public Criteria andStyleIsNotNull() {
            addCriterion("style is not null");
            return (Criteria) this;
        }

        public Criteria andStyleEqualTo(String value) {
            addCriterion("style =", value, "style");
            return (Criteria) this;
        }

        public Criteria andStyleNotEqualTo(String value) {
            addCriterion("style <>", value, "style");
            return (Criteria) this;
        }

        public Criteria andStyleGreaterThan(String value) {
            addCriterion("style >", value, "style");
            return (Criteria) this;
        }

        public Criteria andStyleGreaterThanOrEqualTo(String value) {
            addCriterion("style >=", value, "style");
            return (Criteria) this;
        }

        public Criteria andStyleLessThan(String value) {
            addCriterion("style <", value, "style");
            return (Criteria) this;
        }

        public Criteria andStyleLessThanOrEqualTo(String value) {
            addCriterion("style <=", value, "style");
            return (Criteria) this;
        }

        public Criteria andStyleLike(String value) {
            addCriterion("style like", value, "style");
            return (Criteria) this;
        }

        public Criteria andStyleNotLike(String value) {
            addCriterion("style not like", value, "style");
            return (Criteria) this;
        }

        public Criteria andStyleIn(List<String> values) {
            addCriterion("style in", values, "style");
            return (Criteria) this;
        }

        public Criteria andStyleNotIn(List<String> values) {
            addCriterion("style not in", values, "style");
            return (Criteria) this;
        }

        public Criteria andStyleBetween(String value1, String value2) {
            addCriterion("style between", value1, value2, "style");
            return (Criteria) this;
        }

        public Criteria andStyleNotBetween(String value1, String value2) {
            addCriterion("style not between", value1, value2, "style");
            return (Criteria) this;
        }

        public Criteria andSfdzIsNull() {
            addCriterion("sfdz is null");
            return (Criteria) this;
        }

        public Criteria andSfdzIsNotNull() {
            addCriterion("sfdz is not null");
            return (Criteria) this;
        }

        public Criteria andSfdzEqualTo(String value) {
            addCriterion("sfdz =", value, "sfdz");
            return (Criteria) this;
        }

        public Criteria andSfdzNotEqualTo(String value) {
            addCriterion("sfdz <>", value, "sfdz");
            return (Criteria) this;
        }

        public Criteria andSfdzGreaterThan(String value) {
            addCriterion("sfdz >", value, "sfdz");
            return (Criteria) this;
        }

        public Criteria andSfdzGreaterThanOrEqualTo(String value) {
            addCriterion("sfdz >=", value, "sfdz");
            return (Criteria) this;
        }

        public Criteria andSfdzLessThan(String value) {
            addCriterion("sfdz <", value, "sfdz");
            return (Criteria) this;
        }

        public Criteria andSfdzLessThanOrEqualTo(String value) {
            addCriterion("sfdz <=", value, "sfdz");
            return (Criteria) this;
        }

        public Criteria andSfdzLike(String value) {
            addCriterion("sfdz like", value, "sfdz");
            return (Criteria) this;
        }

        public Criteria andSfdzNotLike(String value) {
            addCriterion("sfdz not like", value, "sfdz");
            return (Criteria) this;
        }

        public Criteria andSfdzIn(List<String> values) {
            addCriterion("sfdz in", values, "sfdz");
            return (Criteria) this;
        }

        public Criteria andSfdzNotIn(List<String> values) {
            addCriterion("sfdz not in", values, "sfdz");
            return (Criteria) this;
        }

        public Criteria andSfdzBetween(String value1, String value2) {
            addCriterion("sfdz between", value1, value2, "sfdz");
            return (Criteria) this;
        }

        public Criteria andSfdzNotBetween(String value1, String value2) {
            addCriterion("sfdz not between", value1, value2, "sfdz");
            return (Criteria) this;
        }

        public Criteria andSyrqIsNull() {
            addCriterion("syrq is null");
            return (Criteria) this;
        }

        public Criteria andSyrqIsNotNull() {
            addCriterion("syrq is not null");
            return (Criteria) this;
        }

        public Criteria andSyrqEqualTo(String value) {
            addCriterion("syrq =", value, "syrq");
            return (Criteria) this;
        }

        public Criteria andSyrqNotEqualTo(String value) {
            addCriterion("syrq <>", value, "syrq");
            return (Criteria) this;
        }

        public Criteria andSyrqGreaterThan(String value) {
            addCriterion("syrq >", value, "syrq");
            return (Criteria) this;
        }

        public Criteria andSyrqGreaterThanOrEqualTo(String value) {
            addCriterion("syrq >=", value, "syrq");
            return (Criteria) this;
        }

        public Criteria andSyrqLessThan(String value) {
            addCriterion("syrq <", value, "syrq");
            return (Criteria) this;
        }

        public Criteria andSyrqLessThanOrEqualTo(String value) {
            addCriterion("syrq <=", value, "syrq");
            return (Criteria) this;
        }

        public Criteria andSyrqLike(String value) {
            addCriterion("syrq like", value, "syrq");
            return (Criteria) this;
        }

        public Criteria andSyrqNotLike(String value) {
            addCriterion("syrq not like", value, "syrq");
            return (Criteria) this;
        }

        public Criteria andSyrqIn(List<String> values) {
            addCriterion("syrq in", values, "syrq");
            return (Criteria) this;
        }

        public Criteria andSyrqNotIn(List<String> values) {
            addCriterion("syrq not in", values, "syrq");
            return (Criteria) this;
        }

        public Criteria andSyrqBetween(String value1, String value2) {
            addCriterion("syrq between", value1, value2, "syrq");
            return (Criteria) this;
        }

        public Criteria andSyrqNotBetween(String value1, String value2) {
            addCriterion("syrq not between", value1, value2, "syrq");
            return (Criteria) this;
        }

        public Criteria andJgrqIsNull() {
            addCriterion("jgrq is null");
            return (Criteria) this;
        }

        public Criteria andJgrqIsNotNull() {
            addCriterion("jgrq is not null");
            return (Criteria) this;
        }

        public Criteria andJgrqEqualTo(Date value) {
            addCriterionForJDBCDate("jgrq =", value, "jgrq");
            return (Criteria) this;
        }

        public Criteria andJgrqNotEqualTo(Date value) {
            addCriterionForJDBCDate("jgrq <>", value, "jgrq");
            return (Criteria) this;
        }

        public Criteria andJgrqGreaterThan(Date value) {
            addCriterionForJDBCDate("jgrq >", value, "jgrq");
            return (Criteria) this;
        }

        public Criteria andJgrqGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("jgrq >=", value, "jgrq");
            return (Criteria) this;
        }

        public Criteria andJgrqLessThan(Date value) {
            addCriterionForJDBCDate("jgrq <", value, "jgrq");
            return (Criteria) this;
        }

        public Criteria andJgrqLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("jgrq <=", value, "jgrq");
            return (Criteria) this;
        }

        public Criteria andJgrqIn(List<Date> values) {
            addCriterionForJDBCDate("jgrq in", values, "jgrq");
            return (Criteria) this;
        }

        public Criteria andJgrqNotIn(List<Date> values) {
            addCriterionForJDBCDate("jgrq not in", values, "jgrq");
            return (Criteria) this;
        }

        public Criteria andJgrqBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("jgrq between", value1, value2, "jgrq");
            return (Criteria) this;
        }

        public Criteria andJgrqNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("jgrq not between", value1, value2, "jgrq");
            return (Criteria) this;
        }

        public Criteria andCpbtIsNull() {
            addCriterion("cpbt is null");
            return (Criteria) this;
        }

        public Criteria andCpbtIsNotNull() {
            addCriterion("cpbt is not null");
            return (Criteria) this;
        }

        public Criteria andCpbtEqualTo(String value) {
            addCriterion("cpbt =", value, "cpbt");
            return (Criteria) this;
        }

        public Criteria andCpbtNotEqualTo(String value) {
            addCriterion("cpbt <>", value, "cpbt");
            return (Criteria) this;
        }

        public Criteria andCpbtGreaterThan(String value) {
            addCriterion("cpbt >", value, "cpbt");
            return (Criteria) this;
        }

        public Criteria andCpbtGreaterThanOrEqualTo(String value) {
            addCriterion("cpbt >=", value, "cpbt");
            return (Criteria) this;
        }

        public Criteria andCpbtLessThan(String value) {
            addCriterion("cpbt <", value, "cpbt");
            return (Criteria) this;
        }

        public Criteria andCpbtLessThanOrEqualTo(String value) {
            addCriterion("cpbt <=", value, "cpbt");
            return (Criteria) this;
        }

        public Criteria andCpbtLike(String value) {
            addCriterion("cpbt like", value, "cpbt");
            return (Criteria) this;
        }

        public Criteria andCpbtNotLike(String value) {
            addCriterion("cpbt not like", value, "cpbt");
            return (Criteria) this;
        }

        public Criteria andCpbtIn(List<String> values) {
            addCriterion("cpbt in", values, "cpbt");
            return (Criteria) this;
        }

        public Criteria andCpbtNotIn(List<String> values) {
            addCriterion("cpbt not in", values, "cpbt");
            return (Criteria) this;
        }

        public Criteria andCpbtBetween(String value1, String value2) {
            addCriterion("cpbt between", value1, value2, "cpbt");
            return (Criteria) this;
        }

        public Criteria andCpbtNotBetween(String value1, String value2) {
            addCriterion("cpbt not between", value1, value2, "cpbt");
            return (Criteria) this;
        }

        public Criteria andBzIsNull() {
            addCriterion("bz is null");
            return (Criteria) this;
        }

        public Criteria andBzIsNotNull() {
            addCriterion("bz is not null");
            return (Criteria) this;
        }

        public Criteria andBzEqualTo(String value) {
            addCriterion("bz =", value, "bz");
            return (Criteria) this;
        }

        public Criteria andBzNotEqualTo(String value) {
            addCriterion("bz <>", value, "bz");
            return (Criteria) this;
        }

        public Criteria andBzGreaterThan(String value) {
            addCriterion("bz >", value, "bz");
            return (Criteria) this;
        }

        public Criteria andBzGreaterThanOrEqualTo(String value) {
            addCriterion("bz >=", value, "bz");
            return (Criteria) this;
        }

        public Criteria andBzLessThan(String value) {
            addCriterion("bz <", value, "bz");
            return (Criteria) this;
        }

        public Criteria andBzLessThanOrEqualTo(String value) {
            addCriterion("bz <=", value, "bz");
            return (Criteria) this;
        }

        public Criteria andBzLike(String value) {
            addCriterion("bz like", value, "bz");
            return (Criteria) this;
        }

        public Criteria andBzNotLike(String value) {
            addCriterion("bz not like", value, "bz");
            return (Criteria) this;
        }

        public Criteria andBzIn(List<String> values) {
            addCriterion("bz in", values, "bz");
            return (Criteria) this;
        }

        public Criteria andBzNotIn(List<String> values) {
            addCriterion("bz not in", values, "bz");
            return (Criteria) this;
        }

        public Criteria andBzBetween(String value1, String value2) {
            addCriterion("bz between", value1, value2, "bz");
            return (Criteria) this;
        }

        public Criteria andBzNotBetween(String value1, String value2) {
            addCriterion("bz not between", value1, value2, "bz");
            return (Criteria) this;
        }

        public Criteria andTpljIsNull() {
            addCriterion("tplj is null");
            return (Criteria) this;
        }

        public Criteria andTpljIsNotNull() {
            addCriterion("tplj is not null");
            return (Criteria) this;
        }

        public Criteria andTpljEqualTo(String value) {
            addCriterion("tplj =", value, "tplj");
            return (Criteria) this;
        }

        public Criteria andTpljNotEqualTo(String value) {
            addCriterion("tplj <>", value, "tplj");
            return (Criteria) this;
        }

        public Criteria andTpljGreaterThan(String value) {
            addCriterion("tplj >", value, "tplj");
            return (Criteria) this;
        }

        public Criteria andTpljGreaterThanOrEqualTo(String value) {
            addCriterion("tplj >=", value, "tplj");
            return (Criteria) this;
        }

        public Criteria andTpljLessThan(String value) {
            addCriterion("tplj <", value, "tplj");
            return (Criteria) this;
        }

        public Criteria andTpljLessThanOrEqualTo(String value) {
            addCriterion("tplj <=", value, "tplj");
            return (Criteria) this;
        }

        public Criteria andTpljLike(String value) {
            addCriterion("tplj like", value, "tplj");
            return (Criteria) this;
        }

        public Criteria andTpljNotLike(String value) {
            addCriterion("tplj not like", value, "tplj");
            return (Criteria) this;
        }

        public Criteria andTpljIn(List<String> values) {
            addCriterion("tplj in", values, "tplj");
            return (Criteria) this;
        }

        public Criteria andTpljNotIn(List<String> values) {
            addCriterion("tplj not in", values, "tplj");
            return (Criteria) this;
        }

        public Criteria andTpljBetween(String value1, String value2) {
            addCriterion("tplj between", value1, value2, "tplj");
            return (Criteria) this;
        }

        public Criteria andTpljNotBetween(String value1, String value2) {
            addCriterion("tplj not between", value1, value2, "tplj");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("create_time not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateByIsNull() {
            addCriterion("create_by is null");
            return (Criteria) this;
        }

        public Criteria andCreateByIsNotNull() {
            addCriterion("create_by is not null");
            return (Criteria) this;
        }

        public Criteria andCreateByEqualTo(String value) {
            addCriterion("create_by =", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByNotEqualTo(String value) {
            addCriterion("create_by <>", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByGreaterThan(String value) {
            addCriterion("create_by >", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByGreaterThanOrEqualTo(String value) {
            addCriterion("create_by >=", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByLessThan(String value) {
            addCriterion("create_by <", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByLessThanOrEqualTo(String value) {
            addCriterion("create_by <=", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByLike(String value) {
            addCriterion("create_by like", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByNotLike(String value) {
            addCriterion("create_by not like", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByIn(List<String> values) {
            addCriterion("create_by in", values, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByNotIn(List<String> values) {
            addCriterion("create_by not in", values, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByBetween(String value1, String value2) {
            addCriterion("create_by between", value1, value2, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByNotBetween(String value1, String value2) {
            addCriterion("create_by not between", value1, value2, "createBy");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNull() {
            addCriterion("update_time is null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNotNull() {
            addCriterion("update_time is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeEqualTo(Date value) {
            addCriterion("update_time =", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualTo(Date value) {
            addCriterion("update_time <>", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThan(Date value) {
            addCriterion("update_time >", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("update_time >=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThan(Date value) {
            addCriterion("update_time <", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("update_time <=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIn(List<Date> values) {
            addCriterion("update_time in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotIn(List<Date> values) {
            addCriterion("update_time not in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("update_time between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("update_time not between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateByIsNull() {
            addCriterion("update_by is null");
            return (Criteria) this;
        }

        public Criteria andUpdateByIsNotNull() {
            addCriterion("update_by is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateByEqualTo(String value) {
            addCriterion("update_by =", value, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByNotEqualTo(String value) {
            addCriterion("update_by <>", value, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByGreaterThan(String value) {
            addCriterion("update_by >", value, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByGreaterThanOrEqualTo(String value) {
            addCriterion("update_by >=", value, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByLessThan(String value) {
            addCriterion("update_by <", value, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByLessThanOrEqualTo(String value) {
            addCriterion("update_by <=", value, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByLike(String value) {
            addCriterion("update_by like", value, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByNotLike(String value) {
            addCriterion("update_by not like", value, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByIn(List<String> values) {
            addCriterion("update_by in", values, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByNotIn(List<String> values) {
            addCriterion("update_by not in", values, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByBetween(String value1, String value2) {
            addCriterion("update_by between", value1, value2, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByNotBetween(String value1, String value2) {
            addCriterion("update_by not between", value1, value2, "updateBy");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

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