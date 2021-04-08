package com.learn.memento.recruit;

import com.learn.memento.common.Memento;

import java.util.HashMap;
import java.util.Map;

/**
 * @ProjectName: [design-patterns]
 * @Package: com.learn.memento.recruit
 * @ClassName: TalentPool
 * @Description:管理者
 * @Author: [wangmeng]
 * @CreateDate: 2021/4/8 16:45
 * @Version: V1.0
 */
public class TalentPool {
    private Map<String,Candidate> candidateMap = new HashMap<>();

    public void addCandidate(Candidate candidate) {
        candidateMap.put(candidate.getName(),candidate);
    }

    public Candidate getCandidate(String name) {
        return candidateMap.get(name);
    }
}
