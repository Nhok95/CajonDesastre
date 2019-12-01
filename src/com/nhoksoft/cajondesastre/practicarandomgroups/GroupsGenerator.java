package com.nhoksoft.cajondesastre.practicarandomgroups;

import java.util.List;
import java.util.Map;

public interface GroupsGenerator {

	public Map<String,List<String>> generate(int groupSize, String groupName, String... members);
}
