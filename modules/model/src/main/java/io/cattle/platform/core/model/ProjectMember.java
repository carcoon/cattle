/*
 * This file is generated by jOOQ.
*/
package io.cattle.platform.core.model;


import java.io.Serializable;
import java.util.Date;
import java.util.Map;

import javax.annotation.Generated;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.9.3"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
@Entity
@Table(name = "project_member", schema = "cattle")
public interface ProjectMember extends Serializable {

    /**
     * Setter for <code>cattle.project_member.id</code>.
     */
    public void setId(Long value);

    /**
     * Getter for <code>cattle.project_member.id</code>.
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", unique = true, nullable = false, precision = 19)
    public Long getId();

    /**
     * Setter for <code>cattle.project_member.name</code>.
     */
    public void setName(String value);

    /**
     * Getter for <code>cattle.project_member.name</code>.
     */
    @Column(name = "name", length = 255)
    public String getName();

    /**
     * Setter for <code>cattle.project_member.account_id</code>.
     */
    public void setAccountId(Long value);

    /**
     * Getter for <code>cattle.project_member.account_id</code>.
     */
    @Column(name = "account_id", precision = 19)
    public Long getAccountId();

    /**
     * Setter for <code>cattle.project_member.kind</code>.
     */
    public void setKind(String value);

    /**
     * Getter for <code>cattle.project_member.kind</code>.
     */
    @Column(name = "kind", nullable = false, length = 255)
    public String getKind();

    /**
     * Setter for <code>cattle.project_member.uuid</code>.
     */
    public void setUuid(String value);

    /**
     * Getter for <code>cattle.project_member.uuid</code>.
     */
    @Column(name = "uuid", unique = true, nullable = false, length = 128)
    public String getUuid();

    /**
     * Setter for <code>cattle.project_member.description</code>.
     */
    public void setDescription(String value);

    /**
     * Getter for <code>cattle.project_member.description</code>.
     */
    @Column(name = "description", length = 1024)
    public String getDescription();

    /**
     * Setter for <code>cattle.project_member.state</code>.
     */
    public void setState(String value);

    /**
     * Getter for <code>cattle.project_member.state</code>.
     */
    @Column(name = "state", nullable = false, length = 128)
    public String getState();

    /**
     * Setter for <code>cattle.project_member.created</code>.
     */
    public void setCreated(Date value);

    /**
     * Getter for <code>cattle.project_member.created</code>.
     */
    @Column(name = "created")
    public Date getCreated();

    /**
     * Setter for <code>cattle.project_member.removed</code>.
     */
    public void setRemoved(Date value);

    /**
     * Getter for <code>cattle.project_member.removed</code>.
     */
    @Column(name = "removed")
    public Date getRemoved();

    /**
     * Setter for <code>cattle.project_member.remove_time</code>.
     */
    public void setRemoveTime(Date value);

    /**
     * Getter for <code>cattle.project_member.remove_time</code>.
     */
    @Column(name = "remove_time")
    public Date getRemoveTime();

    /**
     * Setter for <code>cattle.project_member.data</code>.
     */
    public void setData(Map<String,Object> value);

    /**
     * Getter for <code>cattle.project_member.data</code>.
     */
    @Column(name = "data", length = 16777215)
    public Map<String,Object> getData();

    /**
     * Setter for <code>cattle.project_member.external_id</code>.
     */
    public void setExternalId(String value);

    /**
     * Getter for <code>cattle.project_member.external_id</code>.
     */
    @Column(name = "external_id", nullable = false, length = 255)
    public String getExternalId();

    /**
     * Setter for <code>cattle.project_member.project_id</code>.
     */
    public void setProjectId(Long value);

    /**
     * Getter for <code>cattle.project_member.project_id</code>.
     */
    @Column(name = "project_id", nullable = false, precision = 19)
    public Long getProjectId();

    /**
     * Setter for <code>cattle.project_member.external_id_type</code>.
     */
    public void setExternalIdType(String value);

    /**
     * Getter for <code>cattle.project_member.external_id_type</code>.
     */
    @Column(name = "external_id_type", nullable = false, length = 255)
    public String getExternalIdType();

    /**
     * Setter for <code>cattle.project_member.role</code>.
     */
    public void setRole(String value);

    /**
     * Getter for <code>cattle.project_member.role</code>.
     */
    @Column(name = "role", nullable = false, length = 255)
    public String getRole();

    // -------------------------------------------------------------------------
    // FROM and INTO
    // -------------------------------------------------------------------------

    /**
     * Load data from another generated Record/POJO implementing the common interface ProjectMember
     */
    public void from(io.cattle.platform.core.model.ProjectMember from);

    /**
     * Copy data into another generated Record/POJO implementing the common interface ProjectMember
     */
    public <E extends io.cattle.platform.core.model.ProjectMember> E into(E into);
}