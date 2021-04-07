package com.learn.composite.transparent;

import java.util.List;

/**
 * @ProjectName: [design-patterns]
 * @Package: com.learn.Composite.transparent
 * @ClassName: Component
 * @Description:
 * @Author: [wangmeng]
 * @CreateDate: 2021/3/30 22:51
 * @Version: V1.0
 * Copyright: 北京宏图天安 Copyright (c) 2021
 */
public interface DeptComponent {
    void add(DeptComponent deptComponent);

    void remove(DeptComponent deptComponent);

    List<DeptComponent> getChildren();

    void getName();
}
