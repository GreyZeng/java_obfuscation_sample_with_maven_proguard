package com.git.enu;

public enum Color {
    RED("red", 1),
    GREEN("green", 2),
    BLUE("blue", 3),
    UNKNOWN("unknown", 9999);

    private String name;

    private int value;

    private Color(String name, int value) {
        this.name = name;
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    /**
     * 根据取值返回名称
     *
     * @param v
     * @return
     */
    public static String getNameByValue(int v) {
        // 获取所有枚举
        Color[] colors = values();

        for (Color c : colors) {
            if (c.getValue() == v) {
                return c.getName();
            }
        }

        return UNKNOWN.getName();
    }

    /**
     * 根据名称返回取值
     *
     * @param v
     * @return
     */
    public static int getValueByName(String name) {
        if ("".equals(name) || null == name) {
            return UNKNOWN.getValue();
        }

        // 获取所有枚举
        Color[] colors = values();

        for (Color c : colors) {
            if (name.equals(c.getName())) {
                return c.getValue();
            }
        }

        return UNKNOWN.getValue();
    }
}