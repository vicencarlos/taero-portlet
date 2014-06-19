/**
 * Copyright (c) 2000-2013 Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package home.cvicente.livetasks.service.persistence;

import com.liferay.portal.service.persistence.BasePersistence;

import home.cvicente.livetasks.model.TaskType;

/**
 * The persistence interface for the task type service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author cvicente
 * @see TaskTypePersistenceImpl
 * @see TaskTypeUtil
 * @generated
 */
public interface TaskTypePersistence extends BasePersistence<TaskType> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link TaskTypeUtil} to access the task type persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns all the task types where uuid = &#63;.
	*
	* @param uuid the uuid
	* @return the matching task types
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<home.cvicente.livetasks.model.TaskType> findByUuid(
		java.lang.String uuid)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the task types where uuid = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link home.cvicente.livetasks.model.impl.TaskTypeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param start the lower bound of the range of task types
	* @param end the upper bound of the range of task types (not inclusive)
	* @return the range of matching task types
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<home.cvicente.livetasks.model.TaskType> findByUuid(
		java.lang.String uuid, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the task types where uuid = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link home.cvicente.livetasks.model.impl.TaskTypeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param start the lower bound of the range of task types
	* @param end the upper bound of the range of task types (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching task types
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<home.cvicente.livetasks.model.TaskType> findByUuid(
		java.lang.String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first task type in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching task type
	* @throws home.cvicente.livetasks.NoSuchTaskTypeException if a matching task type could not be found
	* @throws SystemException if a system exception occurred
	*/
	public home.cvicente.livetasks.model.TaskType findByUuid_First(
		java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			home.cvicente.livetasks.NoSuchTaskTypeException;

	/**
	* Returns the first task type in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching task type, or <code>null</code> if a matching task type could not be found
	* @throws SystemException if a system exception occurred
	*/
	public home.cvicente.livetasks.model.TaskType fetchByUuid_First(
		java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last task type in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching task type
	* @throws home.cvicente.livetasks.NoSuchTaskTypeException if a matching task type could not be found
	* @throws SystemException if a system exception occurred
	*/
	public home.cvicente.livetasks.model.TaskType findByUuid_Last(
		java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			home.cvicente.livetasks.NoSuchTaskTypeException;

	/**
	* Returns the last task type in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching task type, or <code>null</code> if a matching task type could not be found
	* @throws SystemException if a system exception occurred
	*/
	public home.cvicente.livetasks.model.TaskType fetchByUuid_Last(
		java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the task types before and after the current task type in the ordered set where uuid = &#63;.
	*
	* @param typeId the primary key of the current task type
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next task type
	* @throws home.cvicente.livetasks.NoSuchTaskTypeException if a task type with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public home.cvicente.livetasks.model.TaskType[] findByUuid_PrevAndNext(
		long typeId, java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			home.cvicente.livetasks.NoSuchTaskTypeException;

	/**
	* Removes all the task types where uuid = &#63; from the database.
	*
	* @param uuid the uuid
	* @throws SystemException if a system exception occurred
	*/
	public void removeByUuid(java.lang.String uuid)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of task types where uuid = &#63;.
	*
	* @param uuid the uuid
	* @return the number of matching task types
	* @throws SystemException if a system exception occurred
	*/
	public int countByUuid(java.lang.String uuid)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the task type where uuid = &#63; and groupId = &#63; or throws a {@link home.cvicente.livetasks.NoSuchTaskTypeException} if it could not be found.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the matching task type
	* @throws home.cvicente.livetasks.NoSuchTaskTypeException if a matching task type could not be found
	* @throws SystemException if a system exception occurred
	*/
	public home.cvicente.livetasks.model.TaskType findByUUID_G(
		java.lang.String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.SystemException,
			home.cvicente.livetasks.NoSuchTaskTypeException;

	/**
	* Returns the task type where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the matching task type, or <code>null</code> if a matching task type could not be found
	* @throws SystemException if a system exception occurred
	*/
	public home.cvicente.livetasks.model.TaskType fetchByUUID_G(
		java.lang.String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the task type where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @param retrieveFromCache whether to use the finder cache
	* @return the matching task type, or <code>null</code> if a matching task type could not be found
	* @throws SystemException if a system exception occurred
	*/
	public home.cvicente.livetasks.model.TaskType fetchByUUID_G(
		java.lang.String uuid, long groupId, boolean retrieveFromCache)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes the task type where uuid = &#63; and groupId = &#63; from the database.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the task type that was removed
	* @throws SystemException if a system exception occurred
	*/
	public home.cvicente.livetasks.model.TaskType removeByUUID_G(
		java.lang.String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.SystemException,
			home.cvicente.livetasks.NoSuchTaskTypeException;

	/**
	* Returns the number of task types where uuid = &#63; and groupId = &#63;.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the number of matching task types
	* @throws SystemException if a system exception occurred
	*/
	public int countByUUID_G(java.lang.String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the task types where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @return the matching task types
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<home.cvicente.livetasks.model.TaskType> findByUuid_C(
		java.lang.String uuid, long companyId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the task types where uuid = &#63; and companyId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link home.cvicente.livetasks.model.impl.TaskTypeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param start the lower bound of the range of task types
	* @param end the upper bound of the range of task types (not inclusive)
	* @return the range of matching task types
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<home.cvicente.livetasks.model.TaskType> findByUuid_C(
		java.lang.String uuid, long companyId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the task types where uuid = &#63; and companyId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link home.cvicente.livetasks.model.impl.TaskTypeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param start the lower bound of the range of task types
	* @param end the upper bound of the range of task types (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching task types
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<home.cvicente.livetasks.model.TaskType> findByUuid_C(
		java.lang.String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first task type in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching task type
	* @throws home.cvicente.livetasks.NoSuchTaskTypeException if a matching task type could not be found
	* @throws SystemException if a system exception occurred
	*/
	public home.cvicente.livetasks.model.TaskType findByUuid_C_First(
		java.lang.String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			home.cvicente.livetasks.NoSuchTaskTypeException;

	/**
	* Returns the first task type in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching task type, or <code>null</code> if a matching task type could not be found
	* @throws SystemException if a system exception occurred
	*/
	public home.cvicente.livetasks.model.TaskType fetchByUuid_C_First(
		java.lang.String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last task type in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching task type
	* @throws home.cvicente.livetasks.NoSuchTaskTypeException if a matching task type could not be found
	* @throws SystemException if a system exception occurred
	*/
	public home.cvicente.livetasks.model.TaskType findByUuid_C_Last(
		java.lang.String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			home.cvicente.livetasks.NoSuchTaskTypeException;

	/**
	* Returns the last task type in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching task type, or <code>null</code> if a matching task type could not be found
	* @throws SystemException if a system exception occurred
	*/
	public home.cvicente.livetasks.model.TaskType fetchByUuid_C_Last(
		java.lang.String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the task types before and after the current task type in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param typeId the primary key of the current task type
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next task type
	* @throws home.cvicente.livetasks.NoSuchTaskTypeException if a task type with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public home.cvicente.livetasks.model.TaskType[] findByUuid_C_PrevAndNext(
		long typeId, java.lang.String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			home.cvicente.livetasks.NoSuchTaskTypeException;

	/**
	* Removes all the task types where uuid = &#63; and companyId = &#63; from the database.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @throws SystemException if a system exception occurred
	*/
	public void removeByUuid_C(java.lang.String uuid, long companyId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of task types where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @return the number of matching task types
	* @throws SystemException if a system exception occurred
	*/
	public int countByUuid_C(java.lang.String uuid, long companyId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the task types where groupId = &#63;.
	*
	* @param groupId the group ID
	* @return the matching task types
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<home.cvicente.livetasks.model.TaskType> findByGroupId(
		long groupId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the task types where groupId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link home.cvicente.livetasks.model.impl.TaskTypeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param start the lower bound of the range of task types
	* @param end the upper bound of the range of task types (not inclusive)
	* @return the range of matching task types
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<home.cvicente.livetasks.model.TaskType> findByGroupId(
		long groupId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the task types where groupId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link home.cvicente.livetasks.model.impl.TaskTypeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param start the lower bound of the range of task types
	* @param end the upper bound of the range of task types (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching task types
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<home.cvicente.livetasks.model.TaskType> findByGroupId(
		long groupId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first task type in the ordered set where groupId = &#63;.
	*
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching task type
	* @throws home.cvicente.livetasks.NoSuchTaskTypeException if a matching task type could not be found
	* @throws SystemException if a system exception occurred
	*/
	public home.cvicente.livetasks.model.TaskType findByGroupId_First(
		long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			home.cvicente.livetasks.NoSuchTaskTypeException;

	/**
	* Returns the first task type in the ordered set where groupId = &#63;.
	*
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching task type, or <code>null</code> if a matching task type could not be found
	* @throws SystemException if a system exception occurred
	*/
	public home.cvicente.livetasks.model.TaskType fetchByGroupId_First(
		long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last task type in the ordered set where groupId = &#63;.
	*
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching task type
	* @throws home.cvicente.livetasks.NoSuchTaskTypeException if a matching task type could not be found
	* @throws SystemException if a system exception occurred
	*/
	public home.cvicente.livetasks.model.TaskType findByGroupId_Last(
		long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			home.cvicente.livetasks.NoSuchTaskTypeException;

	/**
	* Returns the last task type in the ordered set where groupId = &#63;.
	*
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching task type, or <code>null</code> if a matching task type could not be found
	* @throws SystemException if a system exception occurred
	*/
	public home.cvicente.livetasks.model.TaskType fetchByGroupId_Last(
		long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the task types before and after the current task type in the ordered set where groupId = &#63;.
	*
	* @param typeId the primary key of the current task type
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next task type
	* @throws home.cvicente.livetasks.NoSuchTaskTypeException if a task type with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public home.cvicente.livetasks.model.TaskType[] findByGroupId_PrevAndNext(
		long typeId, long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			home.cvicente.livetasks.NoSuchTaskTypeException;

	/**
	* Returns all the task types that the user has permission to view where groupId = &#63;.
	*
	* @param groupId the group ID
	* @return the matching task types that the user has permission to view
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<home.cvicente.livetasks.model.TaskType> filterFindByGroupId(
		long groupId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the task types that the user has permission to view where groupId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link home.cvicente.livetasks.model.impl.TaskTypeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param start the lower bound of the range of task types
	* @param end the upper bound of the range of task types (not inclusive)
	* @return the range of matching task types that the user has permission to view
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<home.cvicente.livetasks.model.TaskType> filterFindByGroupId(
		long groupId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the task types that the user has permissions to view where groupId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link home.cvicente.livetasks.model.impl.TaskTypeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param start the lower bound of the range of task types
	* @param end the upper bound of the range of task types (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching task types that the user has permission to view
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<home.cvicente.livetasks.model.TaskType> filterFindByGroupId(
		long groupId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the task types before and after the current task type in the ordered set of task types that the user has permission to view where groupId = &#63;.
	*
	* @param typeId the primary key of the current task type
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next task type
	* @throws home.cvicente.livetasks.NoSuchTaskTypeException if a task type with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public home.cvicente.livetasks.model.TaskType[] filterFindByGroupId_PrevAndNext(
		long typeId, long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			home.cvicente.livetasks.NoSuchTaskTypeException;

	/**
	* Removes all the task types where groupId = &#63; from the database.
	*
	* @param groupId the group ID
	* @throws SystemException if a system exception occurred
	*/
	public void removeByGroupId(long groupId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of task types where groupId = &#63;.
	*
	* @param groupId the group ID
	* @return the number of matching task types
	* @throws SystemException if a system exception occurred
	*/
	public int countByGroupId(long groupId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of task types that the user has permission to view where groupId = &#63;.
	*
	* @param groupId the group ID
	* @return the number of matching task types that the user has permission to view
	* @throws SystemException if a system exception occurred
	*/
	public int filterCountByGroupId(long groupId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the task types where companyId = &#63;.
	*
	* @param companyId the company ID
	* @return the matching task types
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<home.cvicente.livetasks.model.TaskType> findByCompanyId(
		long companyId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the task types where companyId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link home.cvicente.livetasks.model.impl.TaskTypeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param companyId the company ID
	* @param start the lower bound of the range of task types
	* @param end the upper bound of the range of task types (not inclusive)
	* @return the range of matching task types
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<home.cvicente.livetasks.model.TaskType> findByCompanyId(
		long companyId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the task types where companyId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link home.cvicente.livetasks.model.impl.TaskTypeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param companyId the company ID
	* @param start the lower bound of the range of task types
	* @param end the upper bound of the range of task types (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching task types
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<home.cvicente.livetasks.model.TaskType> findByCompanyId(
		long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first task type in the ordered set where companyId = &#63;.
	*
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching task type
	* @throws home.cvicente.livetasks.NoSuchTaskTypeException if a matching task type could not be found
	* @throws SystemException if a system exception occurred
	*/
	public home.cvicente.livetasks.model.TaskType findByCompanyId_First(
		long companyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			home.cvicente.livetasks.NoSuchTaskTypeException;

	/**
	* Returns the first task type in the ordered set where companyId = &#63;.
	*
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching task type, or <code>null</code> if a matching task type could not be found
	* @throws SystemException if a system exception occurred
	*/
	public home.cvicente.livetasks.model.TaskType fetchByCompanyId_First(
		long companyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last task type in the ordered set where companyId = &#63;.
	*
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching task type
	* @throws home.cvicente.livetasks.NoSuchTaskTypeException if a matching task type could not be found
	* @throws SystemException if a system exception occurred
	*/
	public home.cvicente.livetasks.model.TaskType findByCompanyId_Last(
		long companyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			home.cvicente.livetasks.NoSuchTaskTypeException;

	/**
	* Returns the last task type in the ordered set where companyId = &#63;.
	*
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching task type, or <code>null</code> if a matching task type could not be found
	* @throws SystemException if a system exception occurred
	*/
	public home.cvicente.livetasks.model.TaskType fetchByCompanyId_Last(
		long companyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the task types before and after the current task type in the ordered set where companyId = &#63;.
	*
	* @param typeId the primary key of the current task type
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next task type
	* @throws home.cvicente.livetasks.NoSuchTaskTypeException if a task type with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public home.cvicente.livetasks.model.TaskType[] findByCompanyId_PrevAndNext(
		long typeId, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			home.cvicente.livetasks.NoSuchTaskTypeException;

	/**
	* Removes all the task types where companyId = &#63; from the database.
	*
	* @param companyId the company ID
	* @throws SystemException if a system exception occurred
	*/
	public void removeByCompanyId(long companyId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of task types where companyId = &#63;.
	*
	* @param companyId the company ID
	* @return the number of matching task types
	* @throws SystemException if a system exception occurred
	*/
	public int countByCompanyId(long companyId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Caches the task type in the entity cache if it is enabled.
	*
	* @param taskType the task type
	*/
	public void cacheResult(home.cvicente.livetasks.model.TaskType taskType);

	/**
	* Caches the task types in the entity cache if it is enabled.
	*
	* @param taskTypes the task types
	*/
	public void cacheResult(
		java.util.List<home.cvicente.livetasks.model.TaskType> taskTypes);

	/**
	* Creates a new task type with the primary key. Does not add the task type to the database.
	*
	* @param typeId the primary key for the new task type
	* @return the new task type
	*/
	public home.cvicente.livetasks.model.TaskType create(long typeId);

	/**
	* Removes the task type with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param typeId the primary key of the task type
	* @return the task type that was removed
	* @throws home.cvicente.livetasks.NoSuchTaskTypeException if a task type with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public home.cvicente.livetasks.model.TaskType remove(long typeId)
		throws com.liferay.portal.kernel.exception.SystemException,
			home.cvicente.livetasks.NoSuchTaskTypeException;

	public home.cvicente.livetasks.model.TaskType updateImpl(
		home.cvicente.livetasks.model.TaskType taskType)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the task type with the primary key or throws a {@link home.cvicente.livetasks.NoSuchTaskTypeException} if it could not be found.
	*
	* @param typeId the primary key of the task type
	* @return the task type
	* @throws home.cvicente.livetasks.NoSuchTaskTypeException if a task type with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public home.cvicente.livetasks.model.TaskType findByPrimaryKey(long typeId)
		throws com.liferay.portal.kernel.exception.SystemException,
			home.cvicente.livetasks.NoSuchTaskTypeException;

	/**
	* Returns the task type with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param typeId the primary key of the task type
	* @return the task type, or <code>null</code> if a task type with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public home.cvicente.livetasks.model.TaskType fetchByPrimaryKey(long typeId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the task types.
	*
	* @return the task types
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<home.cvicente.livetasks.model.TaskType> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the task types.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link home.cvicente.livetasks.model.impl.TaskTypeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of task types
	* @param end the upper bound of the range of task types (not inclusive)
	* @return the range of task types
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<home.cvicente.livetasks.model.TaskType> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the task types.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link home.cvicente.livetasks.model.impl.TaskTypeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of task types
	* @param end the upper bound of the range of task types (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of task types
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<home.cvicente.livetasks.model.TaskType> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the task types from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of task types.
	*
	* @return the number of task types
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}