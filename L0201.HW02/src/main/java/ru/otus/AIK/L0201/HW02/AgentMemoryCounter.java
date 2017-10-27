package ru.otus.AIK.L0201.HW02;

import java.lang.instrument.Instrumentation;

public class AgentMemoryCounter {
    private static Instrumentation instrumentation;

    public static void premain(String args, Instrumentation instrumentation) {
        System.out.println("AgentMemoryCounter (Instrumentation) is running");
        AgentMemoryCounter.instrumentation = instrumentation;
    }

    public static long getSize(Object obj) {
        if (instrumentation == null) {
            throw new IllegalStateException("AgentMemoryCounter not initialised");
        }
        return instrumentation.getObjectSize(obj);
    }
}
