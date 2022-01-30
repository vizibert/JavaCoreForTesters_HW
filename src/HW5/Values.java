package HW5;

import java.io.IOException;
import java.io.PrintWriter;

public class Values {

        private Integer value1;
        private Integer value2;
        private Integer value3;

        public Values (Integer value1,Integer value2 , Integer value3) {
            this.value1 = value1;
            this.value2 = value2;
            this.value3 = value3;
        }

        @Override
        public String toString() {
            return String.format("%s;%s;%s", value1, value2, value3);
        }

}


