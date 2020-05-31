package com.cadio.common.repositroy;

import java.util.List;

public interface SearchRepository {
	public abstract List<Object> searchList(Object obj) throws Exception;
}
