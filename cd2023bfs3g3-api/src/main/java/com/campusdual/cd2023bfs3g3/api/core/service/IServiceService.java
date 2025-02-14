package com.campusdual.cd2023bfs3g3.api.core.service;

import com.ontimize.jee.common.dto.EntityResult;
import com.ontimize.jee.common.exceptions.OntimizeJEERuntimeException;

import java.util.List;
import java.util.Map;

public interface IServiceService {
    public EntityResult serviceQuery(Map<String, Object> keyMap, List<String> attrList) throws OntimizeJEERuntimeException;
    public EntityResult serviceInsert(Map<String, Object> attrMap) throws OntimizeJEERuntimeException;
    public EntityResult serviceUpdate(Map<String, Object> attrMap, Map<String, Object> keyMap) throws OntimizeJEERuntimeException;
    public EntityResult serviceDelete(Map<String, Object> keyMap) throws OntimizeJEERuntimeException;
    public EntityResult myServiceQuery(Map<String, Object> keyMap, List<String> attrList) throws OntimizeJEERuntimeException;
    public EntityResult myServiceInsert(Map<String, Object> keyMap) throws OntimizeJEERuntimeException;
    public EntityResult myServiceDelete(Map<String, Object> keyMap) throws OntimizeJEERuntimeException;
    public EntityResult myServiceUpdate(Map<String,  Object> attrMap, Map<String, Object> keyMap) throws OntimizeJEERuntimeException;
}
