/**
 *
 */
package com.fullwish.bean.base;

/**
 * @author fullwish
 */
public enum Profession {
    MOGUL {
        public String getName() {
            return "���";
        }
    },
    BRAWLER {
        public String getName() {
            return "�ְ�";
        }
    },
    CRIMINAL {
        public String getName() {
            return "����";
        }
    };

    public abstract String getName();
}
// public enum Gender {
// MAN{
// public String getName(){return "��";}
// },WOMEN{
// public String getName(){return "Ů";}
// };
// public abstract String getName();
// }