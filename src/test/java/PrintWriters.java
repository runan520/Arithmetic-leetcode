import org.junit.Test;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class PrintWriters {
    @Test
    public void givenWritingStringToFile_whenUsingPrintWriter_thenCorrect()
            throws IOException, SQLException {
//        FileWriter fileWriter = new FileWriter("D:\\IdeaProjects\\spring-data-book\\hadoop\\batch-import\\src\\main\\resources\\create-and-populate-hive-tables.sql");
//        PrintWriter printWriter = new PrintWriter(fileWriter);
//        printWriter.println("Some Strings");
//        printWriter.printf("Product name is %s and its price is %d $", "iPhone", 1000);
//        printWriter.close();

//        String url = "jdbc:h2:mem:sbia_ch02";
//        String user = "sa";
//        String pwds = "";
//        Connection conn = DriverManager.getConnection(url, user, pwds);
//        conn.createStatement().executeUpdate("insert into public.product(id,price,name,description,date) values('122328231','dim','tmp_english_student_read_speed_ninet','select student_id,stage_id,case when stage_speed >=200 then ceil(stage_speed /2) else stage_speed end as diff_stage_speed from (selecta2.student_id as student_id, stage_id, case when diff_stage_speed is not null then  diff_stage_speed else speed_value end as stage_speed,max_diff_day,case when max_diff_day = 0 then  1 when max_diff_day >0 and max_diff_day <= 6 then 7 when max_diff_day >6 and max_diff_day <= 14  then 15 from dim.tmp_english_student_read_speed_ninet','2022-11-17');");
////        conn.createStatement().execute("show databases");
//        conn.close();

        String table = "`ods_ca_county_agent_student_open`";
        System.out.println(table.replace("`",""));

    }
}
