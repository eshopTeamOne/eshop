package com.onlineShop.bean;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CfgGoodsAuxUnitExample
{
	protected String orderByClause;

	protected boolean distinct;

	protected List<Criteria> oredCriteria;

	public CfgGoodsAuxUnitExample()
	{
		oredCriteria = new ArrayList<Criteria>();
	}

	public void setOrderByClause(String orderByClause)
	{
		this.orderByClause = orderByClause;
	}

	public String getOrderByClause()
	{
		return orderByClause;
	}

	public void setDistinct(boolean distinct)
	{
		this.distinct = distinct;
	}

	public boolean isDistinct()
	{
		return distinct;
	}

	public List<Criteria> getOredCriteria()
	{
		return oredCriteria;
	}

	public void or(Criteria criteria)
	{
		oredCriteria.add(criteria);
	}

	public Criteria or()
	{
		Criteria criteria = createCriteriaInternal();
		oredCriteria.add(criteria);
		return criteria;
	}

	public Criteria createCriteria()
	{
		Criteria criteria = createCriteriaInternal();
		if (oredCriteria.size() == 0)
		{
			oredCriteria.add(criteria);
		}
		return criteria;
	}

	protected Criteria createCriteriaInternal()
	{
		Criteria criteria = new Criteria();
		return criteria;
	}

	public void clear()
	{
		oredCriteria.clear();
		orderByClause = null;
		distinct = false;
	}

	protected abstract static class GeneratedCriteria
	{
		protected List<Criterion> criteria;

		protected GeneratedCriteria()
		{
			super();
			criteria = new ArrayList<Criterion>();
		}

		public boolean isValid()
		{
			return criteria.size() > 0;
		}

		public List<Criterion> getAllCriteria()
		{
			return criteria;
		}

		public List<Criterion> getCriteria()
		{
			return criteria;
		}

		protected void addCriterion(String condition)
		{
			if (condition == null)
			{
				throw new RuntimeException("Value for condition cannot be null");
			}
			criteria.add(new Criterion(condition));
		}

		protected void addCriterion(String condition, Object value, String property)
		{
			if (value == null)
			{
				throw new RuntimeException("Value for " + property + " cannot be null");
			}
			criteria.add(new Criterion(condition, value));
		}

		protected void addCriterion(String condition, Object value1, Object value2, String property)
		{
			if (value1 == null || value2 == null)
			{
				throw new RuntimeException("Between values for " + property + " cannot be null");
			}
			criteria.add(new Criterion(condition, value1, value2));
		}

		public Criteria andRecIdIsNull()
		{
			addCriterion("rec_id is null");
			return (Criteria) this;
		}

		public Criteria andRecIdIsNotNull()
		{
			addCriterion("rec_id is not null");
			return (Criteria) this;
		}

		public Criteria andRecIdEqualTo(Short value)
		{
			addCriterion("rec_id =", value, "recId");
			return (Criteria) this;
		}

		public Criteria andRecIdNotEqualTo(Short value)
		{
			addCriterion("rec_id <>", value, "recId");
			return (Criteria) this;
		}

		public Criteria andRecIdGreaterThan(Short value)
		{
			addCriterion("rec_id >", value, "recId");
			return (Criteria) this;
		}

		public Criteria andRecIdGreaterThanOrEqualTo(Short value)
		{
			addCriterion("rec_id >=", value, "recId");
			return (Criteria) this;
		}

		public Criteria andRecIdLessThan(Short value)
		{
			addCriterion("rec_id <", value, "recId");
			return (Criteria) this;
		}

		public Criteria andRecIdLessThanOrEqualTo(Short value)
		{
			addCriterion("rec_id <=", value, "recId");
			return (Criteria) this;
		}

		public Criteria andRecIdIn(List<Short> values)
		{
			addCriterion("rec_id in", values, "recId");
			return (Criteria) this;
		}

		public Criteria andRecIdNotIn(List<Short> values)
		{
			addCriterion("rec_id not in", values, "recId");
			return (Criteria) this;
		}

		public Criteria andRecIdBetween(Short value1, Short value2)
		{
			addCriterion("rec_id between", value1, value2, "recId");
			return (Criteria) this;
		}

		public Criteria andRecIdNotBetween(Short value1, Short value2)
		{
			addCriterion("rec_id not between", value1, value2, "recId");
			return (Criteria) this;
		}

		public Criteria andNameIsNull()
		{
			addCriterion("name is null");
			return (Criteria) this;
		}

		public Criteria andNameIsNotNull()
		{
			addCriterion("name is not null");
			return (Criteria) this;
		}

		public Criteria andNameEqualTo(String value)
		{
			addCriterion("name =", value, "name");
			return (Criteria) this;
		}

		public Criteria andNameNotEqualTo(String value)
		{
			addCriterion("name <>", value, "name");
			return (Criteria) this;
		}

		public Criteria andNameGreaterThan(String value)
		{
			addCriterion("name >", value, "name");
			return (Criteria) this;
		}

		public Criteria andNameGreaterThanOrEqualTo(String value)
		{
			addCriterion("name >=", value, "name");
			return (Criteria) this;
		}

		public Criteria andNameLessThan(String value)
		{
			addCriterion("name <", value, "name");
			return (Criteria) this;
		}

		public Criteria andNameLessThanOrEqualTo(String value)
		{
			addCriterion("name <=", value, "name");
			return (Criteria) this;
		}

		public Criteria andNameLike(String value)
		{
			addCriterion("name like", value, "name");
			return (Criteria) this;
		}

		public Criteria andNameNotLike(String value)
		{
			addCriterion("name not like", value, "name");
			return (Criteria) this;
		}

		public Criteria andNameIn(List<String> values)
		{
			addCriterion("name in", values, "name");
			return (Criteria) this;
		}

		public Criteria andNameNotIn(List<String> values)
		{
			addCriterion("name not in", values, "name");
			return (Criteria) this;
		}

		public Criteria andNameBetween(String value1, String value2)
		{
			addCriterion("name between", value1, value2, "name");
			return (Criteria) this;
		}

		public Criteria andNameNotBetween(String value1, String value2)
		{
			addCriterion("name not between", value1, value2, "name");
			return (Criteria) this;
		}

		public Criteria andIsDisabledIsNull()
		{
			addCriterion("is_disabled is null");
			return (Criteria) this;
		}

		public Criteria andIsDisabledIsNotNull()
		{
			addCriterion("is_disabled is not null");
			return (Criteria) this;
		}

		public Criteria andIsDisabledEqualTo(Byte value)
		{
			addCriterion("is_disabled =", value, "isDisabled");
			return (Criteria) this;
		}

		public Criteria andIsDisabledNotEqualTo(Byte value)
		{
			addCriterion("is_disabled <>", value, "isDisabled");
			return (Criteria) this;
		}

		public Criteria andIsDisabledGreaterThan(Byte value)
		{
			addCriterion("is_disabled >", value, "isDisabled");
			return (Criteria) this;
		}

		public Criteria andIsDisabledGreaterThanOrEqualTo(Byte value)
		{
			addCriterion("is_disabled >=", value, "isDisabled");
			return (Criteria) this;
		}

		public Criteria andIsDisabledLessThan(Byte value)
		{
			addCriterion("is_disabled <", value, "isDisabled");
			return (Criteria) this;
		}

		public Criteria andIsDisabledLessThanOrEqualTo(Byte value)
		{
			addCriterion("is_disabled <=", value, "isDisabled");
			return (Criteria) this;
		}

		public Criteria andIsDisabledIn(List<Byte> values)
		{
			addCriterion("is_disabled in", values, "isDisabled");
			return (Criteria) this;
		}

		public Criteria andIsDisabledNotIn(List<Byte> values)
		{
			addCriterion("is_disabled not in", values, "isDisabled");
			return (Criteria) this;
		}

		public Criteria andIsDisabledBetween(Byte value1, Byte value2)
		{
			addCriterion("is_disabled between", value1, value2, "isDisabled");
			return (Criteria) this;
		}

		public Criteria andIsDisabledNotBetween(Byte value1, Byte value2)
		{
			addCriterion("is_disabled not between", value1, value2, "isDisabled");
			return (Criteria) this;
		}

		public Criteria andBaseRatioIsNull()
		{
			addCriterion("base_ratio is null");
			return (Criteria) this;
		}

		public Criteria andBaseRatioIsNotNull()
		{
			addCriterion("base_ratio is not null");
			return (Criteria) this;
		}

		public Criteria andBaseRatioEqualTo(BigDecimal value)
		{
			addCriterion("base_ratio =", value, "baseRatio");
			return (Criteria) this;
		}

		public Criteria andBaseRatioNotEqualTo(BigDecimal value)
		{
			addCriterion("base_ratio <>", value, "baseRatio");
			return (Criteria) this;
		}

		public Criteria andBaseRatioGreaterThan(BigDecimal value)
		{
			addCriterion("base_ratio >", value, "baseRatio");
			return (Criteria) this;
		}

		public Criteria andBaseRatioGreaterThanOrEqualTo(BigDecimal value)
		{
			addCriterion("base_ratio >=", value, "baseRatio");
			return (Criteria) this;
		}

		public Criteria andBaseRatioLessThan(BigDecimal value)
		{
			addCriterion("base_ratio <", value, "baseRatio");
			return (Criteria) this;
		}

		public Criteria andBaseRatioLessThanOrEqualTo(BigDecimal value)
		{
			addCriterion("base_ratio <=", value, "baseRatio");
			return (Criteria) this;
		}

		public Criteria andBaseRatioIn(List<BigDecimal> values)
		{
			addCriterion("base_ratio in", values, "baseRatio");
			return (Criteria) this;
		}

		public Criteria andBaseRatioNotIn(List<BigDecimal> values)
		{
			addCriterion("base_ratio not in", values, "baseRatio");
			return (Criteria) this;
		}

		public Criteria andBaseRatioBetween(BigDecimal value1, BigDecimal value2)
		{
			addCriterion("base_ratio between", value1, value2, "baseRatio");
			return (Criteria) this;
		}

		public Criteria andBaseRatioNotBetween(BigDecimal value1, BigDecimal value2)
		{
			addCriterion("base_ratio not between", value1, value2, "baseRatio");
			return (Criteria) this;
		}

		public Criteria andBaseUnitIdIsNull()
		{
			addCriterion("base_unit_id is null");
			return (Criteria) this;
		}

		public Criteria andBaseUnitIdIsNotNull()
		{
			addCriterion("base_unit_id is not null");
			return (Criteria) this;
		}

		public Criteria andBaseUnitIdEqualTo(Short value)
		{
			addCriterion("base_unit_id =", value, "baseUnitId");
			return (Criteria) this;
		}

		public Criteria andBaseUnitIdNotEqualTo(Short value)
		{
			addCriterion("base_unit_id <>", value, "baseUnitId");
			return (Criteria) this;
		}

		public Criteria andBaseUnitIdGreaterThan(Short value)
		{
			addCriterion("base_unit_id >", value, "baseUnitId");
			return (Criteria) this;
		}

		public Criteria andBaseUnitIdGreaterThanOrEqualTo(Short value)
		{
			addCriterion("base_unit_id >=", value, "baseUnitId");
			return (Criteria) this;
		}

		public Criteria andBaseUnitIdLessThan(Short value)
		{
			addCriterion("base_unit_id <", value, "baseUnitId");
			return (Criteria) this;
		}

		public Criteria andBaseUnitIdLessThanOrEqualTo(Short value)
		{
			addCriterion("base_unit_id <=", value, "baseUnitId");
			return (Criteria) this;
		}

		public Criteria andBaseUnitIdIn(List<Short> values)
		{
			addCriterion("base_unit_id in", values, "baseUnitId");
			return (Criteria) this;
		}

		public Criteria andBaseUnitIdNotIn(List<Short> values)
		{
			addCriterion("base_unit_id not in", values, "baseUnitId");
			return (Criteria) this;
		}

		public Criteria andBaseUnitIdBetween(Short value1, Short value2)
		{
			addCriterion("base_unit_id between", value1, value2, "baseUnitId");
			return (Criteria) this;
		}

		public Criteria andBaseUnitIdNotBetween(Short value1, Short value2)
		{
			addCriterion("base_unit_id not between", value1, value2, "baseUnitId");
			return (Criteria) this;
		}

		public Criteria andModifiedIsNull()
		{
			addCriterion("modified is null");
			return (Criteria) this;
		}

		public Criteria andModifiedIsNotNull()
		{
			addCriterion("modified is not null");
			return (Criteria) this;
		}

		public Criteria andModifiedEqualTo(Date value)
		{
			addCriterion("modified =", value, "modified");
			return (Criteria) this;
		}

		public Criteria andModifiedNotEqualTo(Date value)
		{
			addCriterion("modified <>", value, "modified");
			return (Criteria) this;
		}

		public Criteria andModifiedGreaterThan(Date value)
		{
			addCriterion("modified >", value, "modified");
			return (Criteria) this;
		}

		public Criteria andModifiedGreaterThanOrEqualTo(Date value)
		{
			addCriterion("modified >=", value, "modified");
			return (Criteria) this;
		}

		public Criteria andModifiedLessThan(Date value)
		{
			addCriterion("modified <", value, "modified");
			return (Criteria) this;
		}

		public Criteria andModifiedLessThanOrEqualTo(Date value)
		{
			addCriterion("modified <=", value, "modified");
			return (Criteria) this;
		}

		public Criteria andModifiedIn(List<Date> values)
		{
			addCriterion("modified in", values, "modified");
			return (Criteria) this;
		}

		public Criteria andModifiedNotIn(List<Date> values)
		{
			addCriterion("modified not in", values, "modified");
			return (Criteria) this;
		}

		public Criteria andModifiedBetween(Date value1, Date value2)
		{
			addCriterion("modified between", value1, value2, "modified");
			return (Criteria) this;
		}

		public Criteria andModifiedNotBetween(Date value1, Date value2)
		{
			addCriterion("modified not between", value1, value2, "modified");
			return (Criteria) this;
		}

		public Criteria andCreatedIsNull()
		{
			addCriterion("created is null");
			return (Criteria) this;
		}

		public Criteria andCreatedIsNotNull()
		{
			addCriterion("created is not null");
			return (Criteria) this;
		}

		public Criteria andCreatedEqualTo(Date value)
		{
			addCriterion("created =", value, "created");
			return (Criteria) this;
		}

		public Criteria andCreatedNotEqualTo(Date value)
		{
			addCriterion("created <>", value, "created");
			return (Criteria) this;
		}

		public Criteria andCreatedGreaterThan(Date value)
		{
			addCriterion("created >", value, "created");
			return (Criteria) this;
		}

		public Criteria andCreatedGreaterThanOrEqualTo(Date value)
		{
			addCriterion("created >=", value, "created");
			return (Criteria) this;
		}

		public Criteria andCreatedLessThan(Date value)
		{
			addCriterion("created <", value, "created");
			return (Criteria) this;
		}

		public Criteria andCreatedLessThanOrEqualTo(Date value)
		{
			addCriterion("created <=", value, "created");
			return (Criteria) this;
		}

		public Criteria andCreatedIn(List<Date> values)
		{
			addCriterion("created in", values, "created");
			return (Criteria) this;
		}

		public Criteria andCreatedNotIn(List<Date> values)
		{
			addCriterion("created not in", values, "created");
			return (Criteria) this;
		}

		public Criteria andCreatedBetween(Date value1, Date value2)
		{
			addCriterion("created between", value1, value2, "created");
			return (Criteria) this;
		}

		public Criteria andCreatedNotBetween(Date value1, Date value2)
		{
			addCriterion("created not between", value1, value2, "created");
			return (Criteria) this;
		}
	}

	public static class Criteria extends GeneratedCriteria
	{

		protected Criteria()
		{
			super();
		}
	}

	public static class Criterion
	{
		private String condition;

		private Object value;

		private Object secondValue;

		private boolean noValue;

		private boolean singleValue;

		private boolean betweenValue;

		private boolean listValue;

		private String typeHandler;

		public String getCondition()
		{
			return condition;
		}

		public Object getValue()
		{
			return value;
		}

		public Object getSecondValue()
		{
			return secondValue;
		}

		public boolean isNoValue()
		{
			return noValue;
		}

		public boolean isSingleValue()
		{
			return singleValue;
		}

		public boolean isBetweenValue()
		{
			return betweenValue;
		}

		public boolean isListValue()
		{
			return listValue;
		}

		public String getTypeHandler()
		{
			return typeHandler;
		}

		protected Criterion(String condition)
		{
			super();
			this.condition = condition;
			this.typeHandler = null;
			this.noValue = true;
		}

		protected Criterion(String condition, Object value, String typeHandler)
		{
			super();
			this.condition = condition;
			this.value = value;
			this.typeHandler = typeHandler;
			if (value instanceof List<?>)
			{
				this.listValue = true;
			}
			else
			{
				this.singleValue = true;
			}
		}

		protected Criterion(String condition, Object value)
		{
			this(condition, value, null);
		}

		protected Criterion(String condition, Object value, Object secondValue, String typeHandler)
		{
			super();
			this.condition = condition;
			this.value = value;
			this.secondValue = secondValue;
			this.typeHandler = typeHandler;
			this.betweenValue = true;
		}

		protected Criterion(String condition, Object value, Object secondValue)
		{
			this(condition, value, secondValue, null);
		}
	}
}