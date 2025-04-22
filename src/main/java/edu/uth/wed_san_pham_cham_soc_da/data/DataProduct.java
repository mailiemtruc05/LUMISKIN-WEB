package edu.uth.wed_san_pham_cham_soc_da.data;

import org.springframework.core.annotation.Order;
import edu.uth.wed_san_pham_cham_soc_da.models.*;
import edu.uth.wed_san_pham_cham_soc_da.repository.*;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.math.BigDecimal;
import java.time.Instant;
import java.util.Arrays;
import java.util.List;

@Order(6)
@Configuration
public class DataProduct {

    @Bean
    CommandLineRunner initProductData(ProductRepository productRepo,
                                      CategoryRepository categoryRepo,
                                      SubCategoryRepository subCategoryRepo) {
        return args -> {
            // Kiểm tra nếu bảng đã có dữ liệu thì không thêm nữa
            if (productRepo.count() > 0) {
                System.out.println("ℹ️ Bảng Product đã có dữ liệu, bỏ qua việc insert.");
                return;
            }

            // Lấy danh sách Category dựa theo ảnh
            Category category1 = categoryRepo.findById(1).orElse(null);
            Category category2 = categoryRepo.findById(2).orElse(null);
            Category category3 = categoryRepo.findById(3).orElse(null);

            // Kiểm tra dữ liệu Category
            if (category1 == null || category2 == null || category3 == null) {
                System.out.println("❌ Lỗi: Không tìm thấy Category.");
                return;
            }

            // Lấy danh sách SubCategory dựa theo ảnh
            SubCategory sub1 = subCategoryRepo.findById(1).orElse(null);
            SubCategory sub2 = subCategoryRepo.findById(2).orElse(null);
            SubCategory sub3 = subCategoryRepo.findById(3).orElse(null);
            SubCategory sub4 = subCategoryRepo.findById(4).orElse(null);
            SubCategory sub5 = subCategoryRepo.findById(5).orElse(null);
            SubCategory sub6 = subCategoryRepo.findById(6).orElse(null);
            SubCategory sub7 = subCategoryRepo.findById(7).orElse(null);
            SubCategory sub8 = subCategoryRepo.findById(8).orElse(null);
            SubCategory sub9 = subCategoryRepo.findById(9).orElse(null);
            SubCategory sub10 = subCategoryRepo.findById(10).orElse(null);
            SubCategory sub11 = subCategoryRepo.findById(11).orElse(null);
            SubCategory sub12 = subCategoryRepo.findById(12).orElse(null);

            // Kiểm tra dữ liệu SubCategory
            if (sub1 == null || sub2 == null || sub3 == null || sub4 == null ||
                    sub5 == null || sub6 == null || sub7 == null || sub8 == null ||
                    sub9 == null || sub10 == null || sub11 == null || sub12 == null) {
                System.out.println("❌ Lỗi: Không tìm thấy một hoặc nhiều SubCategory.");
                return;
            }

            // 🛒 Tạo danh sách sản phẩm
            List<Product> products = Arrays.asList(
                    new Product(
                            "Sữa Rửa Mặt Làm Trắng Da, Ngừa Mụn Senana 60g Trẻ Hóa, Kiểm Soát Dầu, Dưỡng Ẩm Lấy Sạch Bụi Bẩn A234",
                            "https://down-vn.img.susercontent.com/file/vn-11134207-7qukw-ljtfvq8fl69u32@resize_w900_nl.webp",
                            new BigDecimal("55000"),
                            "Sữa Rửa Mặt Làm Trắng Da, Ngừa Mụn Senana 60g\n" +
                                    "\n" +
                                    "Trẻ Hóa, Kiểm Soát Dầu, Dưỡng Ẩm Lấy Sạch Bụi Bẩn\n" +
                                    "\n" +
                                    "\n" +
                                    "\n" +
                                    "Trọng lượng: 60g Công dụng của SRM Senana \n" +
                                    "\n" +
                                    "- Rửa trôi lớp bụi bẩn, bã nhờn và tế bào chết hàng ngày. \n" +
                                    "\n" +
                                    "- cung cấp độ ẩm cho da có hệ dưỡng ẩm 3 ảnh hưởng \n" +
                                    "\n" +
                                    "- Dưỡng da ẩm mượt; tươi trẻ \n" +
                                    "\n" +
                                    "- Ngăn ngừa, làm cho sạch mụn đồng thời vẫn giữ cho da mềm mịn, ko khô ráp \n" +
                                    "\n" +
                                    "- Giúp điều tiết được lượng dầu do da bài tiết giúp da đủ độ ẩm mà ko bị nhờn dầu \n" +
                                    "\n" +
                                    "- Giúp khiến sạch và thông thoáng những nang lông bị bức bí dưới da và đẩy lùi những nhân mụn\n" +
                                    "\n" +
                                    " - Giúp làm cho gạnh nhanh nhân mụn bị đỏ song song hỗ trợ ức chế sự tăng trưởng của các vi khuẩn \n" +
                                    "\n" +
                                    "- Kiểm soát an ninh làn da khỏi sự hình thành của nhân mụn mới. \n" +
                                    "\n" +
                                    "- Diệt khuẩn và ngăn phòng ngừa nguy cơ mụn trở lại \n" +
                                    "\n" +
                                    "- Ngừa mụn, tránh các hậu quả, ngừa thâm\n" +
                                    "\n" +
                                    "\n" +
                                    "\n" +
                                    "COMBO 4 CHAI Gồm:\n" +
                                    "\n" +
                                    "- Whitening: Trắng Sáng\n" +
                                    "\n" +
                                    "- Retouch: Lành Mụn\n" +
                                    "\n" +
                                    "- Amino Acid: Sạch Sâu\n" +
                                    "\n" +
                                    "- Exfloliating: Tẩy tế bào chết\n" +
                                    "\n" +
                                    "\n" +
                                    "\n" +
                                    "HƯỚNG DẪN SỬ DỤNG: \n" +
                                    "\n" +
                                    "3 Chai sữa rửa mặt mình sử dụng chai nào cũng được\n" +
                                    "\n" +
                                    "Bước 1: Làm ướt da mặt bằng nước ấm.\n" +
                                    "\n" +
                                    "Bước 2: Cho một lượng sữa rửa mặt vừa đủ ra lòng bàn tay và tạo bọt.\n" +
                                    "\n" +
                                    "Bước 3: Thoa phần bọt lên mặt từ 30 giây đến 1 phút.\n" +
                                    "\n" +
                                    "Bước 4: Rửa mặt sạch và lau khô\n" +
                                    "\n" +
                                    "\n" +
                                    "\n" +
                                    "Tẩy tế bào chết:\n" +
                                    "\n" +
                                    "+ Giữ mặt và tay khô ráo khi thoa sản phẩm\n" +
                                    "\n" +
                                    "+ Dùng một lượng nhỏ và xoa tròn lên vùng mặt cho đến khi lớp tế bào da chết xuất hiện\n" +
                                    "\n" +
                                    "+ Làm sạch với nước và tiếp tục dùng sữa rửa mặt\n" +
                                    "\n" +
                                    "+ Có thể sử dụng hằng ngày hoặc 3-4 lần/tuần",
                            category1, sub1
                    ),

            new Product(
                    "Sữa rửa mặt Cerave Foaming, Hydrating, SA Smoothing Cleanser cho da dầu mụn, khô, nhạy cảm 88ML - 236ML - 473ML",
                    "https://down-vn.img.susercontent.com/file/vn-11134207-7ras8-m4c0umvdqu0g45@resize_w900_nl.webp",
                    new BigDecimal("175000"),
                    "Sữa rửa mặt Cerave Foaming, Hydrating, SA Smoothing Cleanser cho da dầu mụn, khô, nhạy cảm\n" +
                            "\n" +
                            "- Xuất xứ thương hiệu: Mỹ\n" +
                            "\n" +
                            "- Nơi sản xuất: Trung Quốc\n" +
                            "\n" +
                            "- Dung tích: 473ML - 236ML - 88ML\n" +
                            "\n" +
                            "- Hạn sử dụng: 3 năm kể từ ngày sản xuất\n" +
                            "\n" +
                            "- Ngày sản xuất: In trên bao bì\n" +
                            "\n" +
                            "- Thành phần: Xem chi tiết trên bao bì\n" +
                            "\n" +
                            "\n" +
                            "\n" +
                            "• PHÂN LOẠI: \n" +
                            "\n" +
                            "- CeraVe Foaming Cleanser: Dành cho da dầu mụn\n" +
                            "\n" +
                            "- CeraVe Hydrating Cleanser: Dành cho da thường và da khô\n" +
                            "\n" +
                            "- CeraVe SA Smoothing Cleanser: Dành cho da nhạy cảm\n" +
                            "\n" +
                            "\n" +
                            "\n" +
                            "• THÀNH PHẦN VÀ CÔNG DỤNG:\n" +
                            "\n" +
                            "1. CeraVe Foaming Cleanser (Da Dầu Mụn):\n" +
                            "\n" +
                            "- Có 3 loại Ceramides thiết yếu:  Giúp khôi phục hàng rào độ ẩm da\n" +
                            "\n" +
                            "- Hyaluronic Acid: Giúp duy trì độ ẩm tự nhiên của da\n" +
                            "\n" +
                            "- Niacinamide: Giúp làm dịu, nuôi dưỡng và củng cố hàng rào da\n" +
                            "\n" +
                            "\n" +
                            "\n" +
                            "2. CeraVe Hydrating Cleanser (Da Khô):\n" +
                            "\n" +
                            "- Có 3 loại Ceramides thiết yếu:  Giúp khôi phục hàng rào độ ẩm da\n" +
                            "\n" +
                            "- Công nghệ MVE: Khóa ẩm suốt 24h\n" +
                            "\n" +
                            "- Hyaluronic Acid: Giúp duy trì độ ẩm tự nhiên của da\n" +
                            "\n" +
                            "\n" +
                            "\n" +
                            "3. CeraVe SA Smoothing Cleanser (Da Nhạy Cảm)\n" +
                            "\n" +
                            "-Có 3 loại Ceramides thiết yếu:  Giúp khôi phục hàng rào độ ẩm da\n" +
                            "\n" +
                            "- Hyaluronic Acid: Giúp duy trì độ ẩm tự nhiên của da\n" +
                            "\n" +
                            "- Salicylic Acid (BHA): Tẩy tế bào chết và làm mịn da\n" +
                            "\n" +
                            "\n" +
                            "\n" +
                            "• LƯU Ý: \n" +
                            "\n" +
                            "+ Tránh tiếp xúc với mắt, nếu có, rửa kỹ lại với nước\n" +
                            "\n" +
                            "+ Thông tin dị ứng (nếu có): xem bảng thành phần. \n" +
                            "\n" +
                            "+ Hướng dẫn bảo quản: Bảo quản nơi khô ráo, thoáng mát, tránh ánh nắng trực tiếp từ mặt trời. Để xa tầm tay trẻ em. \n" +
                            "\n" +
                            "\n" +
                            "\n" +
                            "ĐIỀU TUYỆT VỜI KHI MUA HÀNG TẠI MỸ PHẨM MAI HÂN\n" +
                            "\n" +
                            "⍣ Cam kết 100% sản phẩm là hàng chính hãng\n" +
                            "\n" +
                            "⍣ Sản phẩm có tem chống hàng giả điện tử, xác nhận hàng thật bằng tin nhắn\n" +
                            "\n" +
                            "⍣ Đội ngũ tư vấn viên nhiệt tình, hỗ trợ giải đáp thắc mắc trong thời gian ngắn nhất\n" +
                            "\n" +
                            "⍣ Hỗ trợ đổi trả theo quy định của Shopee với điều kiện:\n" +
                            "\n" +
                            "➊ Hàng vẫn còn mới, chưa qua sử dụng\n" +
                            "\n" +
                            "➋ Hàng bị lỗi hoặc hư hỏng do vận chuyển hoặc do nhà sản xuất\n" +
                            "\n" +
                            "➌ Có video quay lại quá trình mở hộp và kiểm tra từng sản phẩm. Video rõ ràng, thấy được gói hàng còn nguyên vẹn, còn niêm phong.\n" +
                            "\n" +
                            "\n" +
                            "\n" +
                            "⛔ Nếu thiếu một trong các điều kiện trên, shop từ chối giải quyết khiếu nại. Thời gian khiếu nại tối đa 7 ngày từ lúc nhận được hàng.",
                    category1, sub1
            ),

            new Product(
                    "Sữa Rửa Mặt Trà Xanh Rau Má Sica White 100Ml, Ngăn Ngừa Và Hỗ Trợ Da Dầu Mụn - SICA WHITE",
                    "https://down-vn.img.susercontent.com/file/vn-11134207-7ras8-m5sfzu56g11z56@resize_w900_nl.webp",
                    new BigDecimal("38000"),
                    "[THÀNH PHẦN] Sữa Rửa Mặt Trà Xanh Rau Má:\n" +
                            "\n" +
                            "\uFEFF\uFEFFChiết xuất trà xanh, rau má...\n" +
                            "\n" +
                            "\uFEFF\uFEFFThành phần chi tiết vui lòng xem trên sản phẩm.\n" +
                            "\n" +
                            "[HƯỚNG DẪN SỬ DỤNG] Sữa Rửa Mặt Trà Xanh Rau Má:\n" +
                            "\n" +
                            "\uFEFF\uFEFFDùng ngày 2 lần sáng tối, dùng sau bước tẩy trang.\n" +
                            "\n" +
                            "\uFEFF\uFEFFLấy lượng sữa rửa mặt vừa đủ, tạo bọt rồi massage lên da 1-2 phút rồi rửa sạch lại với nước sạch.\n" +
                            "\n" +
                            "[HẠN SỬ DỤNG VÀ BẢO QUẢN] Sữa Rửa Mặt Trà Xanh Rau Má:\n" +
                            "\n" +
                            "Hạn sử dụng 24 tháng. Bảo quản nơi thoáng mát. Tránh nơi có nhiệt độ cao (ánh nắng trực tiếp).\n" +
                            "\n" +
                            "\uFEFF\uFEFFSản phẩm được sản xuất tại nhà máy Sica Lab đạt chuẩn CGMP toàn quốc.\n" +
                            "\n" +
                            "• Sản phẩm được SỞ Y TẾ cấp phép lưu hành trên toàn quốc",
                    category1, sub1
            ),

            new Product(
                    "Sữa Rửa Mặt Wonder Bath Balancing PHA 5.5 Cleansing Foam 130ml",
                    "https://down-vn.img.susercontent.com/file/vn-11134201-7ras8-m42yqgpr6byf41@resize_w900_nl.webp",
                    new BigDecimal("77000"),
                    "THÀNH PHẦN:\n" +
                            "- PHA (Polyhydroxy Acids): làm sạch da, loại bỏ tế bào chết dịu nhẹ, cải thiện tình trạng mụn, dưỡng ẩm, chống oxy hóa, ít gây kích ứng.\n" +
                            "- Chiết xuất trà Phổ Nhĩ Hàn Quốc: làm mát da, dưỡng ẩm, chống lão hóa, củng cố lớp hàng rào bảo vệ da trước các tác nhân gây hại bên ngoài môi trường.\n" +
                            "- Dầu dừa và dầu cọ: làm sạch da, dưỡng ẩm, giảm mụn, mờ thâm nám, ức chế sự phát triển của sắc tố melanin, giúp da trắng sáng, chống lão hóa da.\n" +
                            "\n" +
                            "CÔNG DỤNG: \n" +
                            "- Làm sạch sâu, nhẹ nhàng loại bỏ bụi bẩn, tạp chất, tế bào chết và lớp trang điểm cứng đầu trên da một cách triệt để.\n" +
                            "- Bổ sung và cân bằng độ ẩm trên da, cho da luôn căng bóng, mịn màng.\n" +
                            "- Cân bằng độ pH trên da.\n" +
                            "- Ngăn mụn, làm sáng da, cải thiện những vùng da không đều màu, làm mờ thâm nám.\n" +
                            "- Củng cố lớp hàng rào bảo vệ da khỏi các tác nhân gây hại bên ngoài môi trường.\n" +
                            "- Cung cấp độ ẩm, hỗ trợ cân bằng dầu nhờn trên da.\n" +
                            "- Tái tạo, phục hồi tổn thương, dưỡng da sáng khỏe và mềm mại.\n" +
                            "\n" +
                            "CÁCH SỬ DỤNG:\n" +
                            "- B1: Sau khi làm ướt mặt, cho một lượng vừa đủ sản phẩm Sữa Rửa Mặt Byvibes Wonder Bath PHA 5.5 150ml lên tay rồi xoa đều để tạo bọt. \n" +
                            "- B2: Apply sữa rửa mặt lên da nhẹ nhàng theo chuyển động tròn, tránh vùng mắt.\n" +
                            "- B3: Rửa sạch lại với nước ấm.\n" +
                            "- B4: Tiếp tục thực hiện các bước chăm sóc da tiếp theo.",
                    category1, sub1
            ),

            new Product(
                    "Sữa Rửa Mặt Trắng Da Hatomugi Cleansing And Facial Washing Nhật Bản - COCO COSMETICS",
                    "https://down-vn.img.susercontent.com/file/vn-11134207-7r98o-m015g6dsng3xa0@resize_w900_nl.webp",
                    new BigDecimal("46500"),
                    "Sữa rửa mặt Trắng Da Hatomugi cleansing and facial washing\n" +
                            "Xuất xứ: Nhật Bản\n" +
                            "Thương hiệu: Hatomugi\n" +
                            "Trọng lượng: 130g & 170g\n" +
                            "\n" +
                            "Công dụng: \n" +
                            "\uD83D\uDCA6\uD83D\uDCA6Sữa rửa mặt trắng da Hatomugi cleansing and facial washing tuýp 130g giúp cho độ tuổi teen chống lại các loại mụn dậy thì khỏi sạm thâm. Ngoài ra, các bạn nên biết rằng từ tuổi 25 trở đi, mỗi năm chúng ta mất đi từ 1 – 1,5% collagen, nguyên nhân khiến da chúng ta bị chùng nhão, nhăn. Do đó, cần trang bị loại sữa rửa mặt này vì hạt ý dĩ cũng lặp chiến công không nhỏ trong nhiệm vụ làm chậm quá trình lão hóa và làm săn chắc da cực tốt.\n" +
                            "\n" +
                            "- Khoáng chất trong sữa thẩm thấu sâu dưới lớp hạ bì dưỡng ẩm cho da hiệu quả.\n" +
                            "- Vitamin B trong hạt ý dĩ Khống chế lượng dầu, ngăn ngừa viêm da, cải thiện làn da khô.\n" +
                            "- Ngăn ngừa lão hóa da, ngăn ngừa vết nhăn, ngăn ngừa chảy xệ.\n" +
                            "- Se khít lỗ chân lông, hạn chế bã nhờn.\n" +
                            "- Làm trắng sáng da, mờ thâm.\n" +
                            "\n" +
                            "❄\uFE0F Hướng dẫn sử dụng:\n" +
                            "- Rửa mặt 2 lần vào buổi sáng và tối.\n" +
                            "- Lấy một lượng kem vừa đủ tạo bọt và thoa lên cùng da đã làm ướt.\n" +
                            "- Massge nhẹ nhàng theo chuyển động vòng tròn.\n" +
                            "- Rửa lại mặt bằng nước sạch. ",
                    category1, sub1
            ),

            new Product(
                    "Sữa rửa mặt LAIKOU Sakura 50g + Sakura Serum 17ml + Kem dưỡng da 25g",
                    "https://down-vn.img.susercontent.com/file/sg-11134301-7rdw9-lyhkzr42127o12@resize_w900_nl.webp",
                    new BigDecimal("66000"),
                    "Laikou Nhật Bản Sữa rửa mặt làm trắng da mặt Serum giảm đốm nhăn Bộ chăm sóc da\n" +
                            "\n" +
                            "\n" +
                            "\n" +
                            "Thương hiệu: LAIKOU\n" +
                            "\n" +
                            "Xuất xứ: Trung Quốc\n" +
                            "\n" +
                            "Thành phần: Chiết xuất Sakura, glycerin, nước hoa, v.v.\n" +
                            "\n" +
                            "Bảo quản: Để nơi thoáng mát\n" +
                            "\n" +
                            "Thời hạn sử dụng: 5 năm\n" +
                            "\n" +
                            "\n" +
                            "\n" +
                            "Các tính năng:\n" +
                            "\n" +
                            "Nó có thể làm sáng da và làm chậm các dấu hiệu lão hóa da ban đầu.\n" +
                            "\n" +
                            "Phục hồi da hư tổn và làm sạch lỗ chân lông, bụi bẩn\n" +
                            "\n" +
                            "Làm cho làn da của bạn sạch sẽ và tươi sáng\n" +
                            "\n" +
                            "Làm sạch sâu và loại bỏ bụi bẩn, dầu mỡ và tế bào chết trên da\n" +
                            "\n" +
                            "\n" +
                            "\n" +
                            "Loại: Sữa rửa mặt Sakura 50g\n" +
                            "\n" +
                            "Huyết thanh Sakura 17ml\n" +
                            "\n" +
                            "Kem dưỡng da mặt Sakura 25g\n" +
                            "\n" +
                            "\n" +
                            "\n" +
                            "Cách sử dụng:\n" +
                            "\n" +
                            "1.Lấy một lượng sữa rửa mặt thích hợp để rửa mặt\n" +
                            "\n" +
                            "2.Sau bước toner, nhỏ vài giọt serum lên mặt, tránh vùng mắt, vỗ nhẹ cho đến khi thẩm thấu hết.\n" +
                            "\n" +
                            "3.Thoa đều kem lên toàn bộ khuôn mặt\n" +
                            "\n" +
                            "\n" +
                            "\n" +
                            "Gói Bao gồm: 1x 50g Sữa rửa mặt + 1x 17ml serum Sakura + 1x 25g kem Sakura",
                    category1, sub1
            ),

                    // SERUM

            new Product(
                    "Gel Rửa mặt La Roche Posay Effaclar Foarming 400ml , Sữa Rửa Mặt La Roche Posay Cho Da Dầu Nhạy Cảm",
                    "https://down-vn.img.susercontent.com/file/vn-11134201-7ra0g-m6zllo6114yv2f@resize_w900_nl.webp",
                    new BigDecimal("85000"),
                    "Gel Rửa mặt La Roche Posay Effaclar Foarming 400ml , Sữa Rửa Mặt La Roche Posay Cho Da Dầu Nhạy Cảm\n" +
                            "THÔNG TIN THƯƠNG HIỆU\n" +
                            "\n" +
                            "La Roche-Posay là nhãn hàng dược mỹ phẩm đến từ Pháp trực thuộc tập đoàn L’Oreal đã hoạt động được hơn 30 năm, phối hợp nghiên cứu với các bác sĩ da liễu trên toàn thế giới cho ra đời các sản phẩm dưỡng da hướng đến thị trường sản phẩm dành cho da nhạy cảm, ngoài ra còn có dòng sản phẩm dành cho trẻ em. Thành phần nổi bật xuất hiện trong các sản phẩm của La Roche-Posay (LRP) là nước suối khoáng – thermal spring water. Tất cả những sản phẩm thuộc La Roche Posay đều được thử nghiệm lâm sàng và đánh giá khách quan từ bệnh viện Saint Jacques-Toulouse. Quy trình bào chế của sản phẩm cũng rất nghiêm ngặt mang lại cho người sử dụng vẻ đẹp tự nhiên và rất an toàn.\n" +
                            "\n" +
                            "THÔNG TIN SẢN PHẨM:\n" +
                            "\n" +
                            "Độ an toàn\n" +
                            "\n" +
                            "- Độ pH trung tính 5.5.\n" +
                            "\n" +
                            "- Không chứa xà phòng, không chứa cồn, không chất tạo màu và không paraben.\n" +
                            "\n" +
                            "\n" +
                            "\n" +
                            "Thành phần\n" +
                            "\n" +
                            "- ZINC PCA (kẽm) giúp kiểm soát dầu giảm bã nhờn hiệu quả.\n" +
                            "\n" +
                            "- Nước khoáng La Roche-Posay (loại nước duy nhất có chất chống lão hoá Selenium) giúp làm dịu da\n" +
                            "\n" +
                            "- Công thức được lựa chọn kĩ càng với các thành phần làm sạch dịu nhẹ phù hợp cho da dầu và da mụn nhạy cảm.\n" +
                            "\n" +
                            "\n" +
                            "\n" +
                            "ƯU ĐIỂM NỔI BẬT: Nhẹ nhàng làm sạch bụi bẩn và bã nhờn dư thừa , mang đến da sạch và thoáng mát.\n" +
                            "\n" +
                            "\n" +
                            "\n" +
                            "HIỆU QUẢ SỬ DỤNG\n" +
                            "\n" +
                            "- Làm sạch da: Sữa rửa mặt La Roche-Posay có khả năng loại bỏ các bụi bẩn, tạp chất, dầu thừa, tế bào chết bám trên da. Từ đó giúp da được làm sạch sâu, lỗ chân lông được thông thoáng.\n" +
                            "\n" +
                            "- Tẩy trang nhẹ nhàng: Sữa rửa mặt La Roche-Posay có kết cấu dạng sữa dịu nhẹ chứa nhiều dưỡng chất tốt cho da. Vì vậy chúng sẽ giúp da được làm sạch một cách nhẹ nhàng kể cả làn da nhạy cảm.\n" +
                            "\n" +
                            "- Cung cấp độ ẩm, dưỡng ẩm da: Trong thành phần của sữa rửa mặt La Roche-Posay chứa nước khoáng và nhiều dưỡng chất có khả năng hạn chế sự thoát hơi nước, cung cấp độ ẩm, giữ da luôn mềm mịn, tươi sáng.\n" +
                            "\n" +
                            "- Hỗ trợ giảm mụn, ngăn ngừa mụn: Sữa rửa mặt La Roche-Posay còn có tác dụng kiểm soát lượng dầu thừa trên da mặt hiệu quả. Từ đó ngăn chặn sự hình thành và phát triển của mụn.\n" +
                            "\n" +
                            "- Sản phẩm không chứa các chất bảo quản, hương liệu, xà phòng nên không làm khô da hay gây mẩn đỏ cho da khi sử dụng.\n" +
                            "\n" +
                            "\n" +
                            "\n" +
                            "HƯỚNG DẪN SỬ DỤNG\n" +
                            "\n" +
                            "- Sử dụng sữa rửa mặt hằng ngày vào buổi sáng và tối.\n" +
                            "\n" +
                            "- Làm ẩm da với nước ấm, lấy một lượng vừa đủ sữa rửa mặt ra tay, tạo bọt với nước rồi thoa sữa rửa mặt lên mặt, tránh vùng da quanh mắt\n" +
                            "\n" +
                            "- Massage nhẹ nhàng, sau đó rửa sạch lại với nước và lau khô.\n" +
                            "\n" +
                            "\n" +
                            "\n" +
                            "HSD: 03 năm kể từ NSX\n" +
                            "\n" +
                            "NSX: Xem trên bao bì\n" +
                            "\n" +
                            "Xuất xứ thương hiệu: Pháp\n" +
                            "\n" +
                            "Nơi sản xuất: Pháp",
                    category1, sub1
            ),

                    new Product(
                            "Sữa Rửa Mặt Bùn Khoáng COLORKEY LUMINOUS Phù Hợp Da Nhạy Cảm Giúp Làm Sạch Sâu, Giữ Ẩm, Không Gây Khô Da 100g",
                            "https://down-vn.img.susercontent.com/file/vn-11134207-7ras8-m35yqh9wx31747@resize_w900_nl.webp",
                            new BigDecimal("94000"),
                            "Thông tin sản phẩm: Sữa Rửa Mặt Bùn Khoáng COLORKEY LUMINOUS\t\n" +
                                    "\n" +
                                    "\n" +
                                    "\n" +
                                    "Thương hiệu: COLORKEY LUMINOUS\t\n" +
                                    "\n" +
                                    "Khối lượng tịnh: 100g\n" +
                                    "\n" +
                                    "Hạn sử dụng: 3 năm\n" +
                                    "\n" +
                                    "Nơi sản xuất: Quảng Châu.\t\n" +
                                    "\n" +
                                    "Công dụng: Cấp ẩm cho da, hỗ trợ làm sáng, phục hồi da. \n" +
                                    "\n" +
                                    "\n" +
                                    "\n" +
                                    "Hướng dẫn sử dụng:\t\n" +
                                    "\n" +
                                    "Bước 1: Cho một lượng sản phẩm thích hợp vào lòng bàn tay \n" +
                                    "\n" +
                                    "Bước 2: Thêm nước và xoa đều để tạo bọt, thoa đều lên mặt và massage nhẹ nhàng khắp mặt\n" +
                                    "\n" +
                                    "Bước 3: Cuối cùng, rửa lại bằng nước sạch.\n" +
                                    "\n" +
                                    "\n" +
                                    "\n" +
                                    "Lưu ý\t\n" +
                                    "\n" +
                                    "1. Kiểm tra tình trạng kích ứng của da bằng cách lấy một lượng nhỏ và bôi lên phía sau tai và theo dõi trong 24h.\n" +
                                    "\n" +
                                    "2.Ngưng sử dụng nếu có xuất hiện tình trạng kích ứng khi đắp.",
                            category1, sub1
                    ),

                    new Product(
                            "YIHETANG tinh chất serum giảm mụn ẩn thâm mụn mờ thâm chăm sóc da thu nhỏ lỗ chân lông 30ML",
                            "https://down-vn.img.susercontent.com/file/sg-11134201-7rcf9-m6l7skrsi1s9d7@resize_w900_nl.webp",
                            new BigDecimal("139000"),
                            "✅Loại tinh dịch khử mụn này, lựa chọn tinh túy nhiều loại thực vật tự . Ôn hòa thân da, xâm nhập tầng dưới chót của da thịt, chuẩn xác đối  căn nguyên mụn trứng cá.  ,  tiết dầu mỡ trên da, làm nhạt mụn trứng cá, lành da thịt bị tổn thương. Kiên sử dụng, giúp bạn tạm biệt mụn trứng cá, lấy lại trạng thái da thịt mịn màng, nhẹ nhàng\n" +
                                    "\n" +
                                    "\n" +
                                    "\n" +
                                    "✅Hỗ trợ tái phát\n" +
                                    "\n" +
                                    "Công thức thực vật  có thể loại bỏ mụn trứng cá hiện có, mà còn chú trọng từ bên trong da thịt. Bằng cách chỉnh cân bằng nước và dầu của da, tăng cường chức năng rào cản da,   Sử dụng lâu dài, có thể làm cho da thịt ở vào trạng thái khỏe mạnh ổn định, tạm biệt mụn trứng cá quấy nhiễu.\n" +
                                    "\n" +
                                    "\n" +
                                    "\n" +
                                    "✅Nhẹ nhàng\n" +
                                    "\n" +
                                    "Sau khi kiểm tra an toàn nghiêm ngặt, Serum khử mụn không thêm rượu, tinh chất, hormone và các thành phần có hại khác, phù hợp cho tất cả các loại chất da sử dụng, bao gồm cả da nhạy cảm. Công thức ôn hòa của nó trong khử mụn, sẽ không gây thêm gánh nặng cho da thịt, để bạn yên tâm hưởng thụ quá trình khử mụn.\n" +
                                    "\n" +
                                    "\n" +
                                    "\n" +
                                    "✅ giảm thâm mụn trứng cá\n" +
                                    "\n" +
                                    "Bước đầu tiên là loại bỏ mụn trứng cá;\n" +
                                    "\n" +
                                    "\n" +
                                    "\n" +
                                    "Bước thứ hai là loại bỏ các dấu vết do mụn trứng cá để lại;\n" +
                                    "\n" +
                                    "\n" +
                                    "\n" +
                                    "Bước thứ ba là phục hồi da, lỗ chân lông tinh tế, giảm sự xuất hiện lại của mụn trứng cá;\n" +
                                    "\n" +
                                    "\n" +
                                    "\n" +
                                    "\n" +
                                    "\n" +
                                    "\uD83E\uDDE1Giới thiệu Cách sử dụng Serum giảm mụn: \n" +
                                    "\n" +
                                    "1, Làm sạch da mặt: Làm sạch da mặt triệt để với các sản phẩm làm sạch dịu nhẹ, loại bỏ bụi bẩn, dầu và mỹ phẩm dư thừa, đồng thời tạo nền tảng tốt cho sự hấp thụ tinh chất.\n" +
                                    "\n" +
                                    "\n" +
                                    "\n" +
                                    "2, Lấy Một Lượng Tinh Chất Thích Hợp Và Thoa Nó Vào Vị Mụn, Ngày 1 Lần Vào Buổi Sáng Và 1 Lần Vào Buổi Tối.\n" +
                                    "\n" +
                                    "\n" +
                                    "\n" +
                                    "3, Nếu Mụn Nghiêm Trọng Hơn, Bạn Có Thể Vắt Mụn Và Bôi Ngay, Tập Trung Áp Dụng 3-4 Lần Một Ngày.\n" +
                                    "\n" +
                                    "\n" +
                                    "\n" +
                                    "✅Thành phần Thành phần: WATER、BUTYLENE GLYCOL、HYDROLYZED ELASTIN、1,2-HEXANEDIOL、TOTAROL、HEXAMIDINE DIISETHIONATE、o-CYMEN-5-OL、OUBAKU EKISU、SALIX ALBA (WILLOW) BARK EXTRACT、REHMANNIA CHINENSIS ROOT EXTRACT、AZADIRACHTA INDICA LEAF EXTRACT、SCUTELLARIA BAICALENSIS ROOT EXTRACT、HOUTTUYNIA CORDATA EXTRACT、GLYCINE SOJA (SOYBEAN) SEED EXTRACT、ALOE BARBADENSIS LEAF WATER\n" +
                                    "\n" +
                                    "\n" +
                                    "\n" +
                                    "● Được khuyên dùng cho:  giảm mụn trứng cá, thu nhỏ lỗ chân lông;\n" +
                                    "\n" +
                                    "\n" +
                                    "\n" +
                                    "● Phương pháp bảo quản: Bảo quản nơi thoáng mát tránh ánh nắng trực tiếp;\n" +
                                    "\n" +
                                    "\n" +
                                    "\n" +
                                    "● Thời hạn sử dụng: 3 năm kể từ ngày sản xuất",
                            category1, sub2
                    ),

                    new Product(
                            "Serum DELUCIR Cấp Ẩm Phục Hồi Căng Bóng Trẻ Hóa Da - Dung Tích 30ml",
                            "https://down-vn.img.susercontent.com/file/vn-11134207-7ras8-m3doisj3xa8xc8@resize_w900_nl.webp",
                            new BigDecimal("184000"),
                            "1. THÔNG TIN SẢN PHẨM\n" +
                                    "\n" +
                                    "- Tên sản phẩm: Serum Cấp Ẩm Phục Hồi Cấp Tốc 24h DeLucir Trẻ Hóa Căng Bóng Da 30ml\n" +
                                    "\n" +
                                    "- Thương hiệu: DeLucir\n" +
                                    "\n" +
                                    "- Xuất xứ thương hiệu: Việt Nam\n" +
                                    "\n" +
                                    "- Hạn sử dụng: 24 tháng \n" +
                                    "\n" +
                                    "\n" +
                                    "\n" +
                                    "2. THÀNH PHẦN\n" +
                                    "\n" +
                                    "- Thành phần Serum cấp ẩm căng bóng: Tinh chất cam ép lạnh, Niacinemide, Colaggen, Chiết xuất xạ hương, GLYCENRIN,  Các thành phần thiên nhiên khác\n" +
                                    "\n" +
                                    "\n" +
                                    "\n" +
                                    "3. CÔNG DỤNG SẢN PHẨM \n" +
                                    "\n" +
                                    "- Công dụng Serum cấp ẩm căng bóng: Giúp làn da trở nên căng mọng, mịn màng. Cấp ẩm hiệu quả cho làn da, duy trì độ ẩm tự nhiên để da luôn trong trạng thái căng bóng.\n" +
                                    "\n" +
                                    "\n" +
                                    "\n" +
                                    "4. HƯỚNG DẪN SỬ DỤNG\n" +
                                    "\n" +
                                    "- HDSD Serum cấp ẩm căng bóng: dùng mỗi ngày 2-3 lần sau đó rửa mặt và làm ẩm bằng xịt khoáng, với những vùng da ná.m sạ.m nhiều, mỗi lần dùng bạn có thể layer hai lớp để tăng hiệu quả việc dưỡng trắng và làm sáng da.\n" +
                                    "\n" +
                                    "\n" +
                                    "\n" +
                                    "5. ĐỐI TƯỢNG SỬ DỤNG\n" +
                                    "\n" +
                                    "- Do thành phần sản phẩm chiết xuất từ thiên nhiên an toàn lành tính nên phù hợp với mọi loại da, từ da nhạy cảm đến da dầu mụn, da khô\n" +
                                    "\n" +
                                    "\n" +
                                    "\n" +
                                    "6. BẢO QUẢN SẢN PHẨM\n" +
                                    "\n" +
                                    "- Bảo quản nơi khô ráo thoáng mát, tránh ánh nắng trực tiếp. Đậy kín nắp sản phẩm khi sử dụng xong.\n" +
                                    "\n" +
                                    "\n" +
                                    "\n" +
                                    "7. CAM KẾT KHI MUA HÀNG TẠI SHOP \n" +
                                    "\n" +
                                    "- Chúng tôi cam kết mang đến sản phẩm chất lượng tốt với giá cả hợp lý nhất cho khách hàng. \n" +
                                    "\n" +
                                    "- Sản phẩm 100% là hàng chính hãng, có đầy đủ giấy tờ. Cam kết bù tiền x5 lần nếu quý khách thấy hàng không đạt chuẩn\n" +
                                    "\n" +
                                    "- Dịch vụ hỗ trợ khách hàng \"tận tâm - trung thực - nhiệt tình - phục vụ khách hàng 24/7\"\n" +
                                    "\n" +
                                    "- Hỗ trợ giao hàng hỏa tốc trong 3-6 giờ trong nội thành (giao trong giờ hành chính) \n" +
                                    "\n" +
                                    "- Hỗ trợ Đổi/trả trong nếu sản phẩm bị Lỗi từ nhà sản xuất theo quy định của Shopee\n" +
                                    "\n" +
                                    "Quý khách vui lòng liên hệ với Shop để được giải đáp thắc thắc cũng như giải quyết vấn đề (nếu có).",
                            category1, sub2
                    ),

                    new Product(
                            "Serum The Ordinary Niacinamide 10% + Zinc 1% [30ml]",
                            "https://down-vn.img.susercontent.com/file/vn-11134207-7ras8-m4zvpdy54a2r89@resize_w900_nl.webp",
                            new BigDecimal("69000"),
                            "✨✨Tinh chất dưỡng da The Ordinary Niacinamide 10% + Zinc 1% [30ml] ✨✨✨\n" +
                                    "\n" +
                                    "\uD83C\uDF37 THÀNH PHẦN\n" +
                                    "\n" +
                                    "- Serum The Ordinary Nia có các thành phần chính:\n" +
                                    "\n" +
                                    "+ Niacinamide: loại bỏ dần những nốt thâm mụn, đốm nâu và cả tàn nhang trên da, chống lão hóa.\n" +
                                    "\n" +
                                    "+ ZinC: giảm tình trạng tiết dầu đồng thời tái tạo làn da mới khỏe mạnh hơn.\n" +
                                    "\n" +
                                    "- Thành phần đầy đủ: Aqua (Water), Niacinamide, Pentylene Glycol, Zinc PCA, Dimethyl Isosorbide, Tamarindus Indica Seed Gum, Xanthan gum, Isoceteth-20, Ethoxydiglycol, Phenoxyethanol, Chlorphenesin.\n" +
                                    "\n" +
                                    "- Tinh Chất Niacinamide 10% + Zinc 1% không chứa các chất: Cồn, dầu, silicone, gluten.\n" +
                                    "\n" +
                                    "CÔNG DỤNG:\n" +
                                    "\n" +
                                    "Công dụng chính\n" +
                                    "\n" +
                                    "+ Làm dịu da, làm dịu các nốt mụn sưng, mụn viêm và ngăn ngừa mụn trứng cá.\n" +
                                    "\n" +
                                    "+ Điều tiết dầu thừa và bã nhờn.\n" +
                                    "\n" +
                                    "+ Chống lão hóa, chống oxi hóa.\n" +
                                    "\n" +
                                    "+ Làm sáng da và đều màu da.\n" +
                                    "\n" +
                                    "+ Kích thích sản xuất collagen giúp da căng mịn, giảm nếp nhăn.\n" +
                                    "\n" +
                                    "+ Khắc phục các khuyết điểm trên da như tàn nhang, đốm nâu, mụn thâm.\n" +
                                    "\n" +
                                    "\n" +
                                    "\n" +
                                    "\uD83C\uDF37 HƯỚNG DẪN SỬ DỤNG & BẢO QUẢN\n" +
                                    "\n" +
                                    "- Sau khi làm sạch da mặt và cân bằng da (nếu có), apply một lượng The Ordinary Serum vừa đủ khắp mặt cho cả sáng và tối. Dùng kem dưỡng ẩm sau đó.\n" +
                                    "\n" +
                                    "- Nếu bạn dùng nhiều loại serum thì có thể apply Serum T.h.e O.r.d.i.n.a.r.y Nia theo quy tắc lỏng trước đặc sau và mỗi bước cách nhau 2-3 phút để sản phẩm kịp thấm vào da.\n" +
                                    "\n" +
                                    "- Không dùng The Ordinary  Niacinamide 10% + Zinc 1% cùng thời điểm với Vitamin C trong chu trình skincare.\n" +
                                    "\n" +
                                    "- Không sử dụng Serum The Ordinary lên vùng da đang bị thương, có vết hở\n" +
                                    "\n" +
                                    "- Nên test Nia serum lên vùng da khác (cổ tay) trước khi sử dụng lên da mặt\n" +
                                    "\n" +
                                    "- Thoa serm TO tránh xa vùng mắt.\n" +
                                    "\n" +
                                    "\n" +
                                    "\n" +
                                    "\uD83C\uDF37 Serum The Ordinary Nia phù hợp với mọi loại da, đặc biệt da dầu mụn, thâm mụn, kể cả da nhạy cảm.\n" +
                                    "\n" +
                                    "\n" +
                                    "\n" +
                                    "\uD83C\uDF37 BAO BÌ SẢN PHẨM\n" +
                                    "\n" +
                                    "- Hộp giấy màu trắng chữ đen style basic của hãng, vỏ chai thủy tinh vô cùng chắc chắn - Lọ serum không có tem seal niêm phong. - The Ordinary không chú trọng hình thức, chú trọng chất lượng sản phẩm - The Ordinary có nhiều mẫu bao bì, đồng thời thay đổi thường xuyên sẽ có sự khác biệt theo từng lô sản xuất cũng như rất hay lỗi.\n" +
                                    "\n" +
                                    "Chúng tôi sẵn sàng giải quyết mọi thắc mắc về sản phẩm.\n" +
                                    "\n" +
                                    "Vui lòng quay video khi khui hàng.",
                            category1, sub2
                    ),

                    new Product(
                            "Serum dưỡng ẩm sâu trẻ hoá da và phục hồi Losionerie Men HA B5 30ml",
                            "https://down-vn.img.susercontent.com/file/vn-11134207-7r98o-lp52wyijg09nfd@resize_w900_nl.webp",
                            new BigDecimal("38000"),
                            "Serum dưỡng ẩm và phục hồi Losionerie HA B5 30ml với chiết xuất từ các hoạt chất: Hyaluronic acid phân tử thấp, Antaromonas, Niacinamide, Panthenol, Squalane và các thành phần thiên nhiên lành tính như: Chiết xuất Sâm Ngọc Linh, Chiết xuất Dưa Leo, Chiết xuất Diếp Cá hỗ trợ giúp tái tạo làn da thiếu sức sống, da không đều màu, đồng thời giúp trẻ hóa làn da, mang lại cho các quý ông làn da tươi sáng, căng mịn.\n" +
                                    "\n" +
                                    "\n" +
                                    "\n" +
                                    "Công dụng của Serum dưỡng ẩm, mờ vết nhăn và phục hồi Losionerie HA B5 Moisturizing And Restoring Serum với chiết xuất thiên nhiên cho nam:\n" +
                                    "\n" +
                                    "1) Dưỡng Ẩm Vượt Trội\n" +
                                    "\n" +
                                    "- Thành phần chứa HA và các chiết xuất tự nhiên giúp cấp ẩm sâu cho làn da, giữ cho da luôn mềm mại, mịn màng và khỏe mạnh.\n" +
                                    "\n" +
                                    "- Bảng thành phần vượt trội với HA, Hydrolyzed Collagen, Pseudoalteromonas ferment extract, Squalene, chiết xuất và hàm lượng cao từ thiên nhiên Sâm Ngọc Linh, Cúc La Mã, Dưa Leo, Diếp Cá\n" +
                                    "\n" +
                                    "2) Tăng Sinh Collagen và Mờ Nếp Nhăn: \n" +
                                    "\n" +
                                    "- Serum HA B5 kích thích quá trình tăng sinh collagen tự nhiên, giúp da căng bóng, mờ nếp nhăn và trẻ trung hơn.\n" +
                                    "\n" +
                                    "3) Da Tràn Đầy Sức Sống: \n" +
                                    "\n" +
                                    "- Công thức đặc biệt giúp làn da trở nên tràn đầy sức sống, tái tạo tế bào, giảm viêm và làm giảm tình trạng da mất nước.\n" +
                                    "\n" +
                                    "4) An Toàn và Tinh Khiết: \n" +
                                    "\n" +
                                    "- Cam kết không chứa paraben, cồn, sulfate và silicone, đảm bảo da được chăm sóc một cách an toàn và tinh khiết nhất.",
                            category1, sub2
                    ),

                    new Product(
                            "Serum giảm mụn làm dịu da cho nam Men Stay Simplicity Calm Skin Relief Facial Serum 30ml",
                            "https://down-vn.img.susercontent.com/file/vn-11134207-7ra0g-m6ru7b0e838866@resize_w900_nl.webp",
                            new BigDecimal("225000"),
                            "THÀNH PHẦN CHÍNH & CƠ CHẾ HOẠT ĐỘNG\n" +
                                    "\n" +
                                    "Sản phẩm serum giảm mụn & làm dịu da cho nam Men Stay Simplicity sử dụng chiết xuất thiên nhiên lành tính, an toàn cho nhiều làn da nam giới, kể cả da nhạy cảm.\n" +
                                    "\n" +
                                    "- Kết hợp từ Terpineol-4, Salix Alba (Willow) Bark Extract, Salicylic Acid cùng hoạt chất vàng Zinc PCA mang tới công dụng X3: Ngừa mụn, làm dịu trực tiếp các điểm mụn, giảm đỏ, sưng rát, kiềm dầu nhờn. \n" +
                                    "\n" +
                                    "- BHA nồng độ 1%: Tấn công sâu vào lỗ chân lông, làm bong lớp sừng hóa gây bít tắc, làm sạch bụi bẩn, bã nhờn. Để làm sạch mụn ẩn sâu bên trong da, BHA 1% có cơ chế đẩy mụn*.\n" +
                                    "\n" +
                                    "- Zinc PCA: Bình thường hoá quá trình bài tiết bã nhờn, hạn chế gia tăng vi khuẩn gây mụn trứng cá. Khô cồi mụn nhanh.\n" +
                                    "\n" +
                                    "- Glycerin: Dưỡng ẩm giúp da không bị khô.\n" +
                                    "\n" +
                                    " \n" +
                                    "\n" +
                                    "(*) Đẩy mụn: Hiện tượng bình thường khi dùng BHA. Thường diễn ra trong 2-8 tuần ở các vị trí nhiều mụn ẩn, mụn đầu đen.\n" +
                                    "\n" +
                                    "HƯỚNG DẪN SỬ DỤNG SERUM GIẢM MỤN & LÀM DỊU DA CHO NAM MEN STAY SIMPLICITY\n" +
                                    "\n" +
                                    "Với mục đích giảm mụn: Chấm 1-2 giọt serum lên vùng da mụn đã được làm sạch và để khô. \n" +
                                    "\n" +
                                    "- Da mụn nhẹ, mụn đầu đen, mụn trứng cá, mụn đầu trắng: Dùng 2 lần/ ngày vào sáng và tối trước khi đi ngủ.\n" +
                                    "\n" +
                                    "- Da mụn viêm, viêm có mủ: Dùng 2-3 lần/ ngày, chấm trực tiếp vào các nốt mụn.\n" +
                                    "\n" +
                                    "- Da sau mụn: Duy trì 1 lần/ ngày vào buổi tối khi mụn đã giảm.\n" +
                                    "\n" +
                                    "Đặc biệt, kết hợp dùng serum giảm mụn & làm dịu da cùng sữa rửa mặt sạch dầu & ngừa mụn, kem dưỡng ẩm đa năng 5 in 1 sẽ đạt hiệu quả tốt hơn.\n" +
                                    "\n" +
                                    " \n" +
                                    "\n" +
                                    "Với mục đích tẩy tế bào chết: Bôi đều 1-2 giọt serum lên toàn bộ nền da mặt đã được làm sạch và để khô. Dùng 2-3 lần mỗi tuần. Phù hợp da ít mụn hoặc sạch mụn.\n" +
                                    "\n" +
                                    " \n" +
                                    "\n" +
                                    "LƯU Ý\n" +
                                    "\n" +
                                    "Người dùng hoạt chất (AHA, BHA, Niacinamide,...) lần đầu cần đặc biệt lưu ý: Sử dụng lượng ít trên một vùng da nhỏ, 1 lần/ ngày và cách ngày để da làm quen với hoạt chất. Tăng dần lượng dùng, số lần dùng, vùng da sử dụng như phần “Hướng dẫn sử dụng” tùy theo mức độ làm quen của da sau khoảng 1 tuần sử dụng.\n" +
                                    "\n" +
                                    "\n" +
                                    "\n" +
                                    "THÔNG TIN SẢN PHẨM\n" +
                                    "\n" +
                                    "- Tên sản phẩm: Serum giảm mụn & làm dịu da cho nam Men Stay Simplicity Calm Skin Relief Facial Serum 30ml\n" +
                                    "\n" +
                                    "- Thương hiệu: Men Stay Simplicity thuộc Công ty Cổ phần Parsley\n" +
                                    "\n" +
                                    "- Xuất xứ thương hiệu: Việt Nam\n" +
                                    "\n" +
                                    "- Nơi sản xuất: Việt Nam\n" +
                                    "\n" +
                                    "- Hạn sử dụng: 3 năm kể từ ngày sản xuất\n" +
                                    "\n" +
                                    "- Ngày sản xuất: Xem chi tiết trên bao bì\n" +
                                    "\n" +
                                    "- Hướng dẫn bảo quản: Để sản phẩm nơi thoáng mát, tránh ánh nắng trực tiếp\n" +
                                    "\n" +
                                    " \n" +
                                    "\n" +
                                    "NGUYÊN TẮC THÂN THIỆN\n" +
                                    "\n" +
                                    "- Không sử dụng những thành phần hoá học mạnh, gây kích ứng\n" +
                                    "\n" +
                                    "- Không chứa Paraben\n" +
                                    "\n" +
                                    "- Không chứa hương liệu nhân tạo.",
                            category1, sub2
                    ),

                    new Product(
                            "LAIKOU Bộ sản phẩm Chăm sóc da Vitamin C 5 món giúp làm sáng da, mở thâm",
                            "https://down-vn.img.susercontent.com/file/vn-11134207-7r98o-lnl4982dksml66@resize_w900_nl.webp",
                            new BigDecimal("117000"),
                            "Bộ 5 sản phẩm chăm sóc da vitamin C/LAIKOU Vitamin C skincare set\n" +
                                    "\n" +
                                    "\n" +
                                    "\n" +
                                    "Thời hạn sử dụng: 5 năm\n" +
                                    "\n" +
                                    "Thành phần chính: Chiết xuất Vitamin C và Citrus Tangerina (Tangerine)\n" +
                                    "\n" +
                                    "Tác dụng: Làm sáng da/ Giữ ẩm/ Làm mờ nếp nhăn\n" +
                                    "\n" +
                                    "Sử dụng chăm sóc da hàng ngày\n" +
                                    "\n" +
                                    "\n" +
                                    "\n" +
                                    "1. Sữa rửa mặt: lấy một ít sữa rửa mặt tạo bọt trên tay sau đó thoa lên mặt và massage nhẹ nhàng mặt, sau đó rửa sạch với nước.\n" +
                                    "\n" +
                                    "2. Toner: Thoa đều lên toàn bộ khuôn mặt và vỗ nhẹ cho đến khi nó được hấp thụ.\n" +
                                    "\n" +
                                    "3. Serum: Nhỏ 2-4 giọt serum vào lòng bàn tay, sau đó thoa đều lên mặt.\n" +
                                    "\n" +
                                    "4. Kem dưỡng mắt: Thoa dọc theo vùng mắt và massage nhẹ nhàng cho đến khi được hấp thụ.\n" +
                                    "\n" +
                                    "5. Kem dưỡng: Thoa kem dưỡng da mặt lên toàn bộ khuôn mặt và massage nhẹ nhàng cho đến khi nó được hấp thụ hoàn toàn.\n" +
                                    "\n" +
                                    "6. kem chống nắng: Kết cấu tươi mát và không nhờn, có thể nhanh chóng hình thành một lớp màng bảo vệ trên bề mặt da và ngăn ngừa hiệu quả tình trạng cháy nắng\n" +
                                    "\n" +
                                    "\n" +
                                    "\n" +
                                    "-Lưu trữ: Để tránh tiếp xúc trực tiếp với ánh nắng mặt trời, vui lòng bảo quản sản phẩm ở nơi khô ráo và thoáng mát.\n" +
                                    "\n" +
                                    "-Thận trọng: Da nhạy cảm nên được test thử trên da tay trước khi sử dụng. Nếu bạn cảm thấy không thoải mái, hãy ngừng sử dụng ngay lập tức.",
                            category1, sub2
                    ),

                    new Product(
                            "FOCALSKIN Serum Dưỡng Trắng Da Mờ Thâm Mụn Gấp Đôi Vitamin C + Niacinamide B3 + Alpha Arbutin 30ml",
                            "https://down-vn.img.susercontent.com/file/vn-11134207-7ra0g-m7ao32i5ycxo97@resize_w900_nl.webp",
                            new BigDecimal("141000"),
                            "FOCALSKIN Serum Dưỡng Trắng Da Mờ Thâm Mụn Gấp Đôi Vitamin C + Niacinamide B3 +  Alpha Arbutin Dưỡng Ẩm Mờ Nám 30ml\n" +
                                    "\n" +
                                    "\n" +
                                    "\n" +
                                    "CÔNG THỨC “VÀNG”\n" +
                                    "\n" +
                                    "- Dưỡng trắng chuyên sâu nhờ công thức “vàng” Niacinamide (Vitamin B3) + Alpha Arbutin: hỗ trợ kiểm soát và ức chế việc hình thành hắc sắc tố Melanin được nhân đôi. Khi kết hợp với Tranexamic Acid và Vitamin C sẽ càng đẩy mạnh công dụng dưỡng trắng, tạo thành một công thức “vàng” có hiệu quả làm trắng gấp 10 lần Serum Vitamin C thông thường.\n" +
                                    "\n" +
                                    "- Niacinamide (Vitamin B3) thể tinh khiết giúp làm mờ thâm mụn, mẩn đỏ hiệu quả. Đồng thời giảm tiết dầu thừa, bã nhờn trên da, từ đó hỗ trợ ngăn ngừa mụn đầu đen, mụn đầu trắng và thu nhỏ lỗ chân lông.\n" +
                                    "\n" +
                                    "- Alpha Arbutin hỗ trợ ức chế sự hình thành hắc sắc tố Melanin tối màu từ gốc tế bào. Làm mờ các đốm nâu cũ và hạn chế hình thành đốm nâu mới.\n" +
                                    "\n" +
                                    "- Dẫn xuất Vitamin C thế hệ mới 3-O-Ethyl Ascorbic Acid (EAA): tính ổn định cao, không dễ oxy hóa. Hỗ trợ mang lại làn da tươi tắn, giảm những tổn thương do ánh nắng mặt trời và stress ảnh hướng đến da.\n" +
                                    "\n" +
                                    "- Tranexamic Acid: làm sáng da, mờ đốm nâu, ngăn ngừa hình thành các đốm nâu mới. Khi được kết hợp cùng những hợp chất trên sẽ đẩy mạnh khả năng thâm nhập vào trong da, giúp da hấp thụ dưỡng chất tốt hơn, đồng thời làm tăng hiệu quả làm trắng sáng.\n" +
                                    "\n" +
                                    "- Nước hoa hồng Damascna: có hàm lượng chất chống Oxy hóa dồi dào, giúp làn da tươi khỏe, săn chắc và ẩm mịn.\n" +
                                    "\n" +
                                    "\n" +
                                    "\n" +
                                    "ĐẶC ĐIỂM NỔI BẬT\n" +
                                    "\n" +
                                    "\n" +
                                    "\n" +
                                    "- KHÔNG CỒN - KHÔNG DẦU KHOÁNG - KHÔNG PARABEN - KHÔNG SULFATE.\n" +
                                    "\n" +
                                    "- Thành phần lành tính, có chiết xuất thực vật phù hợp cho mọi loại da kể cả da nhạy cảm\n" +
                                    "\n" +
                                    "- Kết hợp các hoạt chất dưỡng sáng một cách cân bằng, an toàn và khoa học.\n" +
                                    "\n" +
                                    "- Công thức “vàng” được nghiên cứu và phát triển tại Pháp. Tỷ lệ thành phần cân bằng và khoa học, đủ để phát huy tác dụng và bổ trợ công dụng dưỡng sáng mà vẫn đảm bảo giảm thiểu tình trạng kích ứng.\n" +
                                    "\n" +
                                    "- Kết cấu mỏng nhẹ, thấm nhanh vào da, giúp làn da thoáng mát không nhờn rít.\n" +
                                    "\n" +
                                    "- Sản phẩm có đầy đủ giấy chứng nhận về nguồn gốc thành phần, công dụng sản phẩm và độ an toàn cho người dùng.\n" +
                                    "\n" +
                                    "\n" +
                                    "\n" +
                                    "HƯỚNG DẪN SỬ DỤNG\n" +
                                    "\n" +
                                    "\n" +
                                    "\n" +
                                    "Bước 1: Rửa sạch mặt với sữa rửa mặt.\n" +
                                    "\n" +
                                    "Bước 2: Lấy một lượng toner phù hợp thoa toàn mặt.\n" +
                                    "\n" +
                                    "Bước 3: Cho vài giọt serum lên mặt, thoa đều và massage nhẹ nhàng để dưỡng chất thấm vào da\n" +
                                    "\n" +
                                    "Bước 4: Dùng kem dưỡng để khóa ẩm\n" +
                                    "\n" +
                                    "Bước 5: Thoa kem chống nắng (bước này chỉ thực hiện khi bạn chăm sóc da vào ban ngày).\n" +
                                    "\n" +
                                    "\n" +
                                    "\n" +
                                    "LƯU Ý\n" +
                                    "\n" +
                                    "\n" +
                                    "\n" +
                                    "- Nên sử dụng sản phẩm trên nền da đã được làm sạch bụi bẩn, makeup.\n" +
                                    "\n" +
                                    "- Vui lòng bảo quản sản phẩm ở nơi thoáng mát, tránh ánh nắng trực tiếp và nhiệt độ cao.\n" +
                                    "\n" +
                                    "\n" +
                                    "\n" +
                                    "HẠN SỬ DỤNG\n" +
                                    "\n" +
                                    "\n" +
                                    "\n" +
                                    "HSD được in trên bao bì, ngày sản xuất cách HSD 36 tháng.\n" +
                                    "\n" +
                                    "Sau khi mở nắp, quý khách nên sử dụng sản phẩm trong vòng 12 tháng.",
                            category1, sub2
                    ),

                    new Product(
                            "Serum Glycolic Melasyl 8% [Melasyl+Glycolic+Niacinamide] dưỡng sáng da, mờ thâm mụn & nám Loreal Paris",
                            "https://down-vn.img.susercontent.com/file/vn-11134201-7ra0g-m7bq535x52ybd8@resize_w900_nl.webp",
                            new BigDecimal("329000"),
                            "• Serum dưỡng sáng Glycolic-Bright MỚI với thành phần đột phá sáng da MelasylTM từ viện nghiên cứu L’oreal Paris – hiệu quả hơn 5 hoạt chất sáng da phổ biến, cùng phức hợp hoạt chất 8% [Melasyl+Glycolic+Niacinamide] giúp mang đến khả năng vượt trội GIẢM 77% THÂM MỤN & NÁM*.  \n" +
                                    "\n" +
                                    "Sản phẩm thích hợp cho mọi loại da, kể cả làn da nhạy cảm \n" +
                                    "\n" +
                                    " \n" +
                                    "\n" +
                                    "• VÌ SAO BẠN SẼ THÍCH? \n" +
                                    "\n" +
                                    "Trải qua hơn 18 năm nghiên cứu, sàng lọc từ hơn 100,000 phân tử, viện nghiên cứu L’oreal Paris đã tìm ra một thành phần đột phá sáng da MelasylTM với 27 bằng sáng chế, nay có trong serum dưỡng sáng Glycolic-Bright MỚI – hiệu quả hơn 5 hoạt chất sáng da phổ biến \n" +
                                    "\n" +
                                    "Serum Glycolic-Bright Melasyl Mới với công thức phức hợp hoạt chất 8% [Melasyl + Glycolic + Niacinamide] giúp mang đến khả năng toàn diện GIẢM 77% THÂM MỤN & NÁM*. \n" +
                                    "\n" +
                                    "*Kiểm nghiệm trên 176 đốm nâu, 88 phụ nữ trong vòng 8 tuần sử dụng \n" +
                                    "\n" +
                                    " • Thành phần chính:\n" +
                                    "\n" +
                                    "8% [Melasyl + Glycolic + Niacinamide]: ngăn chặn hắc sắc tố xuất hiện, làm mờ thâm nám.\n" +
                                    "\n" +
                                    "Chứa 5 hoạt chất: Vitamin C 7%, PHE Resorcinol 0.5%, Niacinamide 4%, TXA 1%, Arbutine 7%: dưỡng sáng da, làm mờ các loại thâm nám và đốm nâu lâu năm.\n" +
                                    "\n" +
                                    "• Thành phần đầy đủ:\n" +
                                    "\n" +
                                    "Aqua / Water, Glycolic Acid, Hydroxyethylpiperazine Ethane Sulfonic Acid, Glycerin, Sodium Hydroxide, Citric Acid, Pentylene Glycol, Ascorbyl Glucoside, Panthenol, Peg-40 Hydrogenated Castor Oil, Ppg-26-Buteth-26, Tocopherol, Bis-Peg-18 Methyl Ether Dimethyl Silane, Benzyl Alcohol, Hexyl Cinnamal, Limonene, Linalool, Salicylic Acid, Parfum / Fragrance\n" +
                                    "\n" +
                                    "• Bảo quản:\n" +
                                    "\n" +
                                    "Nơi khô ráo thoáng mát.\n" +
                                    "\n" +
                                    "Tránh ánh nắng trực tiếp, nơi có nhiệt độ cao hoặc ẩm ướt.\n" +
                                    "\n" +
                                    "Đậy nắp kín sau khi sử dụng.\n" +
                                    "\n" +
                                    "• ƯU ĐIỂM NỔI BẬT \n" +
                                    "\n" +
                                    "Hiệu quả sáng da rõ rệt \n" +
                                    "\n" +
                                    "Mờ thâm mụn & sạm da \n" +
                                    "\n" +
                                    "Mờ nhiều loại thâm nám, kể cả các đốm nâu lâu năm \n" +
                                    "\n" +
                                    "Hiệu quả cho mọi tông da châu á \n" +
                                    "\n" +
                                    "Hiệu quả cho mọi loại da, kể cả da nhạy cảm \n" +
                                    "\n" +
                                    " \n" +
                                    "\n" +
                                    "• HIỆU QUẢ SỬ DỤNG  \n" +
                                    "\n" +
                                    "Hiệu quả sử dụng đã chứng minh, sản phẩm giúp giảm 77% thâm mụn & nám, làn da đều màu và trông sáng, rạng rỡ hơn từ sau 8 tuần. \n" +
                                    "\n" +
                                    "(*) Theo đánh giá hiệu quả sau khi sử dụng trên 1000 người phụ nữ châu Á, 18~35 tuổi, nhiều loại da. Tuy nhiên, tùy theo cơ địa và các khuyết điểm trên da của từng trường hợp người dùng mà hiệu quả có thể thay đổi nhưng không đáng kể.   \n" +
                                    "\n" +
                                    " \n" +
                                    "\n" +
                                    "• HƯỚNG DẪN SỬ DỤNG \n" +
                                    "\n" +
                                    "Dùng hàng ngày vào sáng và tối, trước bước kem dưỡng ẩm. Nên dùng kèm Kem dưỡng GLYCOLIC-BRIGHT để đạt hiệu quả tốt nhất. Tránh tiếp xúc vào vùng da quanh mắt. \n" +
                                    "\n" +
                                    "Bạn nên sử dụng thêm kem chống nắng UV Defender Invisible Fluid trước khi ra đường để làn da được bảo vệ tối ưu \n" +
                                    "\n" +
                                    "Xuất xứ thương hiệu: Pháp  \n" +
                                    "\n" +
                                    "Xuất xứ: Indonesia \n" +
                                    "\n" +
                                    "HSD: 3 năm kể từ ngày sản xuất  \n" +
                                    "\n" +
                                    "NSX: Xem trên bao bì \n" +
                                    "\n" +
                                    "• THÔNG TIN THƯƠNG HIỆU\n" +
                                    "\n" +
                                    "Hơn 100 năm thành lập, L’Oréal là tập đoàn chuyên về mỹ phẩm và chăm sóc sắc đẹp lớn nhất thế giới. L’Oréal Paris đã có mặt tại hơn 120 quốc gia với các dòng sản phẩm về chăm sóc tóc, chăm sóc da và trang điểm dành cho đại chúng. Được xây dựng trên nền tảng khoa học, áp dụng những phát minh công nghệ mới nhất, các sản phẩm L’Oréal Paris có chất lượng cao cấp, đa dạng, dễ sử dụng, với mức giá phù hợp cho tất cả mọi người, đáp ứng nhiều nhu cầu làm đẹp.\n" +
                                    "\n" +
                                    "*L’Oréal Paris là nhãn hiệu mỹ phẩm hàng đầu tại Châu Âu được sản xuất tại nhiều nhà máy trên toàn thế giới như Trung Quốc, Mỹ, Indonesia… Dù được sản xuất ở đâu, các sản phẩm đều tuân theo quy trình kiểm soát chất lượng nghiêm ngặt và đồng đều của L’Oréal Toàn Cầu. Các sản phẩm chính hãng đều có tem nhãn tiếng Việt phía sau và nhập khẩu trực tiếp từ công ty TNHH L’Oréal Việt Nam nên các bạn hoàn toàn yên tâm.",
                            category1, sub2
                    ),

                    //KEM DƯỠNG ẨM

                    new Product(
                            "GMEELAN KEM LƯỜI BIỂN GLUTA TRẮNG 30g SPF20 WHITENING LAZY CREAM",
                            "https://down-vn.img.susercontent.com/file/cn-11134207-7ras8-m5v8le64yi0rb9@resize_w900_nl.webp",
                            new BigDecimal("116000"),
                            "\uD83D\uDC97Tìm kiếm toàn cầu GMEELAN để giải mã bí mật làm trắng da\n" +
                                    "\n" +
                                    " - Miluomu, Còn được gọi là cỏ phượng hoàng Nam Phi, còn được gọi là \"cỏ tái sinh\", mọc trên cao nguyên Nam Phi cổ xưa và bí ẩn, nó chứa đựng sức mạnh bản thân. Phục hồi mạnh mẽ, chỉ cần 1 giọt nước là có thể phục hồi sức sống không bị héo\n" +
                                    "\n" +
                                    "\n" +
                                    "\n" +
                                    ". Thông tin sản phẩm\n" +
                                    "\n" +
                                    "[Tên sản phẩm] [Kem làm trắng da dành cho người lười biếng Glutathione\n" +
                                    "\n" +
                                    "[Dung lượng sản phẩm] 30g\n" +
                                    "\n" +
                                    "[Công dụng của sản phẩm] Làm trắng, sáng, dưỡng ẩm\n" +
                                    "\n" +
                                    "[Đối tượng sử dụng] Dùng được cho nhiều loại da khác nhau, đặc biệt là da cần làm trắng và dưỡng ẩm\n" +
                                    "\n" +
                                    "\n" +
                                    "\n" +
                                    "\uD83D\uDC4FLợi ích:\n" +
                                    "\n" +
                                    "1 \uFE0F ⃣ trang điểm trong 10 giây, lớp trang điểm tạo cảm giác tự nhiên, kéo dài 8 giờ\n" +
                                    "\n" +
                                    "2 \uFE0F ⃣ làm trắng sau 3 giây, trắng da tự nhiên, không trắng giả Làm trắng nhanh trong 7 ngày, tạm biệt da mặt xỉn màu\n" +
                                    "\n" +
                                    "4 \uFE0F ⃣ Kem chống nắng SPF20, PA + +, chống sạm da do bức xạ tia cực tím\n" +
                                    "\n" +
                                    "\n" +
                                    "\n" +
                                    "\uD83D\uDCA5Thành phần nổi tiếng:\n" +
                                    "\n" +
                                    "* Thành phần làm trắng gấp 5 lần\n" +
                                    "\n" +
                                    " Làm trắng da chuyên nghiệp từ gốc đến biểu bì, làm trắng da trong 7 ngày.\n" +
                                    "\n" +
                                    " \n" +
                                    "\n" +
                                    "* Thành phần dinh dưỡng kép\n" +
                                    "\n" +
                                    "- - Chiết xuất Miluomu Châu Phi, ceramide NP Hàn Quốc, dưỡng ẩm và dưỡng ẩm, nhanh chóng thẩm thấu vào da, khóa ẩm và củng cố hàng rào bảo vệ da, mang lại làn da mềm mại và tươi sáng hơn.\n" +
                                    "\n" +
                                    " \n" +
                                    "\n" +
                                    "* Chiết xuất hương thơm kép\n" +
                                    "\n" +
                                    "- - Chiết xuất từ bưởi, chiết xuất từ lá bạc hà, giúp đàn hồi và làm mềm da, chống oxy hóa, kháng khuẩn và chống viêm, cải thiện mùi hôi, cho làn da tươi trẻ và mềm mại.\n" +
                                    "\n" +
                                    "\n" +
                                    "\n" +
                                    "\uD83D\uDCE2Trong trường hợp sử dụng:\n" +
                                    "\n" +
                                    "· Trước khi hẹn hò, không có thời gian trang điểm\n" +
                                    "\n" +
                                    "Khi trang điểm, trang điểm giả trắng, phấn trôi và không tự nhiên\n" +
                                    "\n" +
                                    "Da dầu và lớp trang điểm tan chảy hàng ngày, khuôn mặt trở thành gương phản chiếu\n" +
                                    "\n" +
                                    "\n" +
                                    "\n" +
                                    "\uD83D\uDC49Thích hợp cho mọi loại da:\n" +
                                    "\n" +
                                    "✔Không có cồn\n" +
                                    "\n" +
                                    "✔Không chứa Paraben\n" +
                                    "\n" +
                                    "✔Không có dầu khoáng\n" +
                                    "\n" +
                                    "✔Không có chất tạo màu\n" +
                                    "\n" +
                                    "✔Thuần chay, thân thiện\n" +
                                    "\n" +
                                    "\n" +
                                    "\n" +
                                    "[\uD83D\uDCA5Cách sử dụng] Sau khi rửa mặt sạch, thực hiện các bước dưỡng da cơ bản, lấy một lượng vừa đủ thoa đều lên mặt, thoa đều; Chờ vài giây để lớp trang điểm Trắng và trong suốt tự nhiên.\n" +
                                    "\n" +
                                    " \n" +
                                    "\n" +
                                    "[\uD83D\uDCE2Những điều cần chú ý]\n" +
                                    "\n" +
                                    "1 \uFE0F ⃣ vui lòng không thoa lên vùng da bị tổn thương như gãy, bỏng, phát ban, mụn mủ, sắc tố bất thường, v.v.\n" +
                                    "\n" +
                                    "2 \uFE0F ⃣ sản phẩm này mềm mại nhưng không loại bỏ phản ứng dị ứng cho từng người dùng. Nên thử trên một vùng nhỏ sau tai và bên trong cánh tay trước khi sử dụng, nếu cảm thấy khó chịu vui lòng ngừng sử dụng ngay lập tức.\n" +
                                    "\n" +
                                    "3 \uFE0F ⃣ nếu chẳng may dính vào mắt, rửa sạch bằng nhiều nước sạch ngay lập tức.",
                            category1, sub3
                    ),

                    new Product(
                            "Gmeelan KEM LƯỜI PHỤC HỒI DURVILLEA POLYPEPTIDE, đại dương tuyết Nam Cực 30g",
                            "https://down-vn.img.susercontent.com/file/cn-11134207-7ras8-m6di3a5gd7ln10@resize_w900_nl.webp",
                            new BigDecimal("176000"),
                            "Bạn có làn da nhạy cảm, không muốn để mặt mộc nhưng lại không dám trang điểm? Sáng tôi dậy muộn, vội vã đi làm\n" +
                                    "\n" +
                                    "đi làm hơn nữa ngày, cần phải nhanh chóng trang điểm lại\n" +
                                    "\n" +
                                    "sắp trễ cuộc hẹn, không kịp trang điểm\n" +
                                    "\n" +
                                    "da tôi rất nhạy cảm và tôi cũng không dám sử dụng mỹ phẩm\n" +
                                    "\n" +
                                    "đi công tác và du lịch, mang theo rất nhiều chai lọ\n" +
                                    "\n" +
                                    "\n" +
                                    "\n" +
                                    "công cụ thần kỳ cho người có làn da nhạy cảm, dễ dàng trang điểm mà không gây gánh nặng,\n" +
                                    "\n" +
                                    "ứng dụng 3S, làm sáng da đều\n" +
                                    "\n" +
                                    "phân tử sửa chữa 8X, chống lại tổn thương da\n" +
                                    "\n" +
                                    "phân tử làm trắng 8X, làm trắng sâu 24h* \n" +
                                    "\n" +
                                    "\n" +
                                    "\n" +
                                    "Kết quả thực tế khác nhau tùy theo từng người\n" +
                                    "\n" +
                                    "\n" +
                                    "\n" +
                                    "Công thức ban đầu của GMEELAN \n" +
                                    "\n" +
                                    "gồm các thành phần tự nhiên toàn cầu + các thành phần nghiên cứu khoa học nổi tiếng + công nghệ tiên tiến quốc tế \n" +
                                    "\n" +
                                    "\n" +
                                    "\n" +
                                    "tảo tuyết cực\n" +
                                    "\n" +
                                    "phục hồi vàng và các cơ da bị tổn thương một cách hiểu quả\n" +
                                    "\n" +
                                    "tổng hợp polypeptide tetrapeptide\n" +
                                    "\n" +
                                    "làm dịu đa chiều \n" +
                                    "\n" +
                                    "Công nghệ quấn của Hàn Quốc \n" +
                                    "\n" +
                                    "làm sáng và cải thiện tông màu da không đồng đều * Kết quả thực tế khác nhau từ người này sang người khác\n" +
                                    "\n" +
                                    "\n" +
                                    "\n" +
                                    "GMEELAN \n" +
                                    "\n" +
                                    "khám phá thế giới để giữ cho làn da không bị xỉn màu.\n" +
                                    "\n" +
                                    "\n" +
                                    "\n" +
                                    "Khám phá tuyết và đại dương ở Nam Cực.\n" +
                                    "\n" +
                                    "dòng sản phẩm Tảo Tuyết \n" +
                                    "\n" +
                                    "\n" +
                                    "\n" +
                                    "Dòng Tảo Tuyết chọn lọc loại tảo tuyết quý giá từ tuyết và đại dương ở Nam Cực, một loại tảo vùng cực. Nó đã phải chịu nhiệt độ khắc nghiệt và tia cực tím mạnh quanh năm, điều này không những không ảnh hưởng đến sự phát triển của nó mà còn giúp nó có khả năng chống chịu căng thẳng mạnh mẽ và có khả năng sửa chữa hiệu quả.Chất diệp lục tế bào và carotenoids chứa trong nó không chỉ có thể bảo vệ và kích hoạt tế bào da, Nó cũng có thể tăng cường cơ chế bảo vệ của da và sửa chữa hiệu quả hàng rào bảo vệ da bị tổn thương.\n" +
                                    "\n" +
                                    "\n" +
                                    "\n" +
                                    "Báo cáo thử nghiệm của tổ chức có thẩm quyền \n" +
                                    "\n" +
                                    "GMEELAN \n" +
                                    "\n" +
                                    "làm trắng sâu 24h \n" +
                                    "\n" +
                                    "--------------------------------- \n" +
                                    "\n" +
                                    "Làm trắng, tinh tế, dưỡng ẩm \n" +
                                    "\n" +
                                    "---- ---- --------------------------------------- \n" +
                                    "\n" +
                                    "Hiệu quả cuối cùng của việc sử dụng thay đổi từ tùy từng người và sẽ tùy thuộc vào làn da. Tùy vào mức độ nghiêm trọng của vấn đề.",
                            category1, sub3
                    ),

                    new Product(
                            "Kem dưỡng ẩm cho da khoẻ mạnh 5X Ceramide Gel dưỡng ẩm SKINTIFIC 30g",
                            "https://down-vn.img.susercontent.com/file/vn-11134207-7r98o-lt6cw4h05fb861@resize_w900_nl.webp",
                            new BigDecimal("169000"),
                            "\uD83D\uDD25\uD83D\uDD25kem dưỡng ẩm cho da khoẻ mạnh 5X Ceramide Gel dưỡng ẩm SKINTIFIC 30g\uD83D\uDD25\uD83D\uDD25\n" +
                                    "\n" +
                                    "Gel dưỡng ẩm kết hợp Ceramide, Hyaluronic Acid, Centella Asiatica giúp cải thiện các vấn đề về hàng rào bảo vệ da bị tổn thương như mụn, m.ẩn đỏ, da sần, da khô một cách nhanh chóng nhưng vẫn an toàn cho hàng rào bảo vệ da. Với công nghệ 5X Ceramide, là sự kết hợp của 5 loại Ceramide giúp dưỡng ẩm sâu và giữ các lớp da khoẻ mạnh. 5X Ceramide này giúp cải thiện hàng rào bảo vệ da bằng cách giữ ẩm và tránh các nhân tố gây hại bên ngoài.\n" +
                                    "\n" +
                                    "Khối lượng: 30g\n" +
                                    "\n" +
                                    " \n" +
                                    "\n" +
                                    "Công dụng:\n" +
                                    "\n" +
                                    "- Cải thiện các vấn đề về hàng rào bảo vệ da như mụn trứng cá, m.ẩn đỏ, da khô và da sần sùi\n" +
                                    "\n" +
                                    "- Dưỡng ẩm cho da\n" +
                                    "\n" +
                                    "- Kiểm soát dầu cho da\n" +
                                    "\n" +
                                    "- Cải thiện hàng rào bảo vệ da\n" +
                                    "\n" +
                                    "- Làm da dịu đi và mềm mịn\n" +
                                    "\n" +
                                    "Hiệu quả sản phẩm phụ thuộc vào tình trạng da và cơ địa của mỗi người\n" +
                                    "\n" +
                                    " \n" +
                                    "\n" +
                                    "Cách sử dụng:\n" +
                                    "\n" +
                                    "- Sử dụng sau khi làm sạch da\n" +
                                    "\n" +
                                    "- Thoa một lượng phù hợp lên da mặt, mát xa đều; có thể dùng cả cho vùng cổ\n" +
                                    "\n" +
                                    "- Sử dụng ngày 1-2 lần vào sáng, tối; tránh vùng mắt và các vết thương hở\n" +
                                    "\n" +
                                    " \n" +
                                    "\n" +
                                    "Thành phần nổi bật:\n" +
                                    "\n" +
                                    "5X Ceramide: Sự kết hợp của 5 loại Ceramide giúp cải thiện và tạo lớp màng bảo vệ da cho da không bị mất độ ẩm\n" +
                                    "\n" +
                                    "Hyaluronic Acid: Cấp nước nhanh cho da và cải thiện các tế bào da\n" +
                                    "\n" +
                                    "Centella Asiatica: Cải thiện và giúp vấn đề vi.êm da dịu đi\n" +
                                    "\n" +
                                    "Marine-Collagen: Giữ độ ẩm và độ mềm mại cho da\n" +
                                    "\n" +
                                    " \n" +
                                    "\n" +
                                    "Dành cho tuổi 13 trở lên\n" +
                                    "\n" +
                                    "Hạn sử dụng: 3 năm (xem trên bao bì)\n" +
                                    "\n" +
                                    "Bao bì có thể thay đổi theo từng lô hàng\n" +
                                    "\n" +
                                    "Xuất xứ thương hiệu: Canada\n" +
                                    "\n" +
                                    "Nơi sản xuất: Trung Quốc\n" +
                                    "\n" +
                                    "Bảo quản nơi khô ráo, thoáng mát, tránh ánh nắng trực tiếp.",
                            category1, sub3
                    ),

                    new Product(
                            "Kem dưỡng ẩm cấp nước Neutrogena® Hydro Boost Hyaluronic Acid Water Gel (50g)",
                            "https://down-vn.img.susercontent.com/file/vn-11134201-7ras8-m33bncidb00ef3@resize_w900_nl.webp",
                            new BigDecimal("277000"),
                            "Kem dưỡng ẩm cấp nước Neutrogena® Hydro Boost Hyaluronic Acid Water Gel (50g) giúp KHÓA ẨM đến 72H & TĂNG CƯỜNG SỨC SỐNG cho LÀN DA - Được phát triển bởi Chuyên Gia Da Liễu\n" +
                                    "\n" +
                                    "\n" +
                                    "\n" +
                                    "TĂNG 5X ĐỘ ẨM tức thì nhờ phức hợp ĐỘC QUYỀN NMF - Tăng cường cơ chế giữ ẩm tự nhiên của da: \n" +
                                    "\n" +
                                    "• HYALURONIC ACID: Cấp ẩm tức thì & Khóa ẩm cho làn da căng mọng dài lâu\n" +
                                    "\n" +
                                    "• AMINO ACID: Hỗ trợ hàng rào bảo vệ da, ngăn thất thoát độ ẩm\n" +
                                    "\n" +
                                    "• CHẤT ĐIỆN GIẢI:  Giúp làn da hấp thu dưỡng chất tối ưu\n" +
                                    "\n" +
                                    "(*) NMF: Natural Moisturizing Factor\n" +
                                    "\n" +
                                    "\n" +
                                    "\n" +
                                    "HÀNG RÀO BẢO VỆ DA KHỎE HƠN 80% - DA CĂNG MƯỚT ĐẦY SỨC SỐNG\n" +
                                    "\n" +
                                    "• 97% đồng ý DA CĂNG MƯỚT tức thì\n" +
                                    "\n" +
                                    "• 81% đồng ý DA KHỎE HƠN từ lần dùng đầu tiên\n" +
                                    "\n" +
                                    "\n" +
                                    "\n" +
                                    "KẾT CẤU DẠNG GEL MÁT LÀNH:\n" +
                                    "\n" +
                                    "• Thấm nhanh - Không nhờn rít - Không gây mụn\n" +
                                    "\n" +
                                    "• Phù hợp với làn da & khí hậu Việt Nam\n" +
                                    "\n" +
                                    "\n" +
                                    "\n" +
                                    "CÔNG THỨC DỊU LÀNH VỚI CẢ LÀN DA NHẠY CẢM: \n" +
                                    "\n" +
                                    "• KHÔNG CỒN KHÔ - PHTHALATES - PHẨM MÀU\n" +
                                    "\n" +
                                    "\n" +
                                    "\n" +
                                    "HƯỚNG DẪN SỬ DỤNG: \n" +
                                    "\n" +
                                    "• Bước 1: Làm sạch tay và rửa mặt với sữa rửa mặt Neutrogena \n" +
                                    "\n" +
                                    "• Bước 2: Lấy ra tay một lượng sản phẩm vừa đủ và thoa đều trên lòng bàn tay.\n" +
                                    "\n" +
                                    "• Bước 3: Vỗ nhẹ lên bề mặt da cho đến khi thẩm thấu hoàn toàn. Nên kết hợp với Serum Neutrogena Hydro Boost Niacinamide để đảm bảo hiệu quả tối ưu. \n" +
                                    "\n" +
                                    "\n" +
                                    "\n" +
                                    "CÁCH BẢO QUẢN:\n" +
                                    "\n" +
                                    "Tránh ánh sáng trực tiếp, nơi có nhiệt độ cao hoặc ẩm ướt. Để xa tầm tay trẻ em. Không sử dụng cho vùng da tổn thương. Ngưng sử dụng ngay khi có biểu hiện kích ứng và hỏi ý kiến bác sĩ da liễu.\n" +
                                    "\n" +
                                    "\n" +
                                    "\n" +
                                    "HSD: 3 năm kể từ ngày sản xuất\n" +
                                    "\n" +
                                    "\n" +
                                    "\n" +
                                    "NSX: Xem trên bao bì sản phẩm\n" +
                                    "\n" +
                                    "\n" +
                                    "\n" +
                                    "Xuất xứ thương hiệu: Hoa Kỳ\n" +
                                    "\n" +
                                    "\n" +
                                    "\n" +
                                    "Nơi sản xuất: Hàn Quốc\n" +
                                    "\n" +
                                    "\n" +
                                    "\n" +
                                    "Thành phần: In trên bao bì.",
                            category1, sub3
                    ),

                    new Product(
                            "Kem Dưỡng Ẩm Redwin Vitamin E Cream 300g Úc , Giúp Dưỡng Da Mặt Và Body Hết Khô, Nứt Nẻ , Mềm Mịn",
                            "https://down-vn.img.susercontent.com/file/vn-11134201-7ra0g-m77tsrx37gxi8e@resize_w900_nl.webp",
                            new BigDecimal("95000"),
                            "Kem Dưỡng Ẩm Redwin Vitamin E Cream 300g Úc , Giúp Dưỡng Da Mặt Và Body Hết Khô, Nứt Nẻ , Mềm Mịn\n" +
                                    "Trọng lượng: Hũ 300g\n" +
                                    "\n" +
                                    "Công dụng của Kem Dưỡng Ẩm Redwin Vitamin E Cream 300g Úc\n" +
                                    "– Dưỡng ẩm cho da\n" +
                                    "– Kem Dưỡng Ẩm Redwin Vitamin E Cream 300g Úc Làm giảm tình trạng khô ráp, sần sùi\n" +
                                    "– Kem Dưỡng Ẩm Redwin Vitamin E Cream 300g Úc Làm mềm mịn da, phục hồi vùng da ở khuỷu tay, đầu gối, gót chân\n" +
                                    "– Kem vitamin E Cream duy trì độ đàn hồi, căng mượt cho da\n" +
                                    "– Giảm sự xuất hiện nếp nhăn, nếp gấp, lão hóa\n" +
                                    "– Thu hẹp lỗ chân lông\n" +
                                    "– Làm sáng da, mờ vết thâm sạm\n" +
                                    "– Phục hồi da tổn thương, thâm sẹo, mụn\n" +
                                    "– Chống oxy hóa, làm giảm thiểu tác động từ môi trường, UV\n" +
                                    "– Giảm nguy cơ dị ứng da Mềm Mịn\n" +
                                    "– Kem dưỡng ẩm Redwin Vitamin E Cream làm chậm quá trình lão hóa Mềm Mịn\n" +
                                    "\n" +
                                    "Cách sử dụngKem Dưỡng Ẩm Redwin Vitamin E Cream 300g Úc \n" +
                                    "– Làm sạch da (mặt và body)\n" +
                                    "– Bôi kem lên da, massage nhẹ nhàng cho kem thẩm thấu hết.\n" +
                                    "– Dùng được cho mặt và body nhé!\n" +
                                    "– Lưu ý, bảo quản nơi khô ráo, tránh nhiệt cao.",
                            category1, sub3
                    ),

                    new Product(
                            "Kem Diếp Cá Organic Luxmom dưỡng ẩm, mờ thâm, dưỡng trắng, giảm nám, giảm mụn",
                            "https://down-vn.img.susercontent.com/file/vn-11134207-7ras8-m2urv79r8kj4d1@resize_w900_nl.webp",
                            new BigDecimal("169000"),
                            "Kem Diếp Cá Organic Luxmom dưỡng ẩm, mờ thâm, dưỡng trắng, giảm nám, giảm mụn\n" +
                                    "\n" +
                                    "\n" +
                                    "\n" +
                                    "\uD83D\uDC49THÔNG TIN CHI TIẾT:\n" +
                                    "\n" +
                                    "Kem diếp cá Luxmom \n" +
                                    "\n" +
                                    "✅ THÀNH PHẦN:\n" +
                                    "\n" +
                                    "•  Chiết xuất diếp cá: Làm mát, làm dịu da, giảm mụn trứng cá, mụn ẩn, mụn sưng đỏ rõ rệt.\n" +
                                    "\n" +
                                    "•  Chiết xuất dừa sáp, lá trà, hoa sen: Phục hồi thương tổn da sau mụn, tái tạo da sáng đều màu, giảm thâm và không cho hình thành sẹo trên da.\n" +
                                    "\n" +
                                    "•  Vitamin E: chống oxy hóa cho sản phẩm, dưỡng da mịn màng, mềm mại..\n" +
                                    "\n" +
                                    "\n" +
                                    "\n" +
                                    "✅ CÔNG DỤNG:\n" +
                                    "\n" +
                                    "•  Thải độc, giảm mụn mờ thâm nám.\n" +
                                    "\n" +
                                    "•  Hấp thu bã nhờn và bụi bẩn sâu trong lỗ chân lông.\n" +
                                    "\n" +
                                    "•  Làm dịu và giữ ấm cho da nhạy cảm.\n" +
                                    "\n" +
                                    "•  Cải thiện kết cấu da, làm mềm mịn da.\n" +
                                    "\n" +
                                    "•  Làm đều màu da, giúp da căng bóng, khỏe mạnh.\n" +
                                    "\n" +
                                    "•  Dạng kem mềm mịn, dùng không bị khô căng như các loại kem thông thường.\n" +
                                    "\n" +
                                    "\n" +
                                    "\n" +
                                    "✅ HƯỚNG DẪN SỬ DỤNG :\n" +
                                    "\n" +
                                    "•  Rửa sạch mặt.\n" +
                                    "\n" +
                                    "•  Lấy một lượng vừa đủ kem diếp cá thoa đều lên mặt.\n" +
                                    "\n" +
                                    "•  Để 20-30p rồi rửa mặt với  nước.\n" +
                                    "\n" +
                                    "•  Dùng đều đặn hàng ngày, đặt biệt trước khi ngủ để có kết quả tốt nhất.\n" +
                                    "\n" +
                                    "\n" +
                                    "\n" +
                                    "\n" +
                                    "\n" +
                                    "❌ LUXMOM XIN CAM KẾT:\n" +
                                    "\n" +
                                    "1. Trợ giá phí vận chuyển toàn quốc, nhận hàng thanh toán\n" +
                                    "\n" +
                                    "2. Hàng luôn có sẵn, đóng gói cẩn thận trước khi giao đi\n" +
                                    "\n" +
                                    "3. Hỗ trợ đổi hàng khi không đúng hoặc sản phẩm bị lỗi\n" +
                                    "\n" +
                                    "4. Hỗ trợ 24/24, tư vấn nhiệt tình trước và sau khi bán hàng.",
                            category1, sub3
                    ),

                    new Product(
                            "Kem dưỡng ẩm SCINIC The Simple Relief 80ml SCINIC the simple relief moisturizing cream",
                            "https://down-vn.img.susercontent.com/file/sg-11134207-7rces-lsuq1iwpln3ecf@resize_w900_nl.webp",
                            new BigDecimal("186000"),
                            "Kem dưỡng ẩm làm dịu có tính axit nhẹ\n" +
                                    "\n" +
                                    "Giữ nó đơn giản cho da nhạy cảm\n" +
                                    "\n" +
                                    "\n" +
                                    "\n" +
                                    "Kem dưỡng ẩm làm dịu có tính axit mang lại cảm giác sảng khoái và dưỡng ẩm cho làn da nhạy cảm thiếu ẩm.\n" +
                                    "\n" +
                                    "\n" +
                                    "\n" +
                                    "Chỉ chứa các thành phần thiết yếu để giảm thiểu gánh nặng\n" +
                                    "\n" +
                                    "Giảm kích ứng với chăm sóc axit nhẹ\n" +
                                    "\n" +
                                    "Các bước đơn giản để giảm gánh nặng cho da\n" +
                                    "\n" +
                                    "\n" +
                                    "\n" +
                                    "Đối với da nhạy cảm, hãy đơn giản hóa nó hơn một chút\n" +
                                    "\n" +
                                    "\n" +
                                    "\n" +
                                    "Dung dịch nhẹ có tính axit nhẹ\n" +
                                    "\n" +
                                    "\n" +
                                    "\n" +
                                    "An ủi làn da nhạy cảm đã bị kích ứng và nhạy cảm!\n" +
                                    "\n" +
                                    "Kem dưỡng ẩm nhẹ có tính axit nhẹ\n" +
                                    "\n" +
                                    "\n" +
                                    "\n" +
                                    "Với kết cấu dạng gel nhẹ, độ nhớt thấp, để lại một kết thúc tươi mát và mịn màng mà không gây bết dính ngay cả khi thoa nhiều lần\n" +
                                    "\n" +
                                    "\n" +
                                    "\n" +
                                    "Làm mát làm dịu với một lượng ẩm và tươi mát ngay khi chạm vào da, làm dịu làn da nhạy cảm\n" +
                                    "\n" +
                                    "\n" +
                                    "\n" +
                                    "Cách sử dụng Kem dưỡng ẩm giảm nhẹ đơn giản\n" +
                                    "\n" +
                                    "\n" +
                                    "\n" +
                                    "Làm dịu làm dịu da nhạy cảm dưới mặt nạ\n" +
                                    "\n" +
                                    "Làm dịu làm dịu da bị kích ứng bởi môi trường nóng ẩm dưới mặt nạ\n" +
                                    "\n" +
                                    "\n" +
                                    "\n" +
                                    "100% vegan ĐẸP\n" +
                                    "\n" +
                                    "\n" +
                                    "\n" +
                                    "Được chứng nhận bởi EVE VEGAN từ Pháp\n" +
                                    "\n" +
                                    "Sản phẩm được chứng nhận 100% thuần chay không bao gồm các thành phần có nguồn gốc động vật để đề cao giá trị tôn trọng cuộc sống.\n" +
                                    "\n" +
                                    "\n" +
                                    "\n" +
                                    "Chiết xuất Madecassoside & Centella Asiatica\n" +
                                    "\n" +
                                    "Giúp làm dịu da và giữ cho da khỏe mạnh\n" +
                                    "\n" +
                                    "\n" +
                                    "\n" +
                                    "Chiết xuất thân cây xương rồng Opuntia\n" +
                                    "\n" +
                                    "Cung cấp độ ẩm và làm dịu để giữ cho làn da thoải mái.",
                            category1, sub3
                    ),

                    new Product(
                            "Set sản phẩm chăm sóc da LAIKOU gồm kem dưỡng da 25g + serum sáng da 17ml chiết xuất hoa anh đào",
                            "https://down-vn.img.susercontent.com/file/my-11134201-23020-26i10mwfgnnv1a@resize_w900_nl.webp",
                            new BigDecimal("127000"),
                            "Thời gian giao hàng ước tính cho sản phẩm này là 7-9 ngày\n" +
                                    "\n" +
                                    "  \n" +
                                    "\n" +
                                    "  Kem dưỡng ẩm kiểu hoa anh đào Nhật Bản LAIKOU với axit Hyaluronic chống lão hóa 25g + Serum LAIKOU kiểu Nhật với tinh chất hoa anh đào làm trắng 17ml\n" +
                                    "\n" +
                                    "  \n" +
                                    "\n" +
                                    "  ★★★ Giới thiệu về cửa hàng ★★★\n" +
                                    "\n" +
                                    "  Chào mừng bạn đến với cửa hàng LAIKOU chính hãng, chúng tôi luôn tin rằng những sản phẩm chất lượng có thể mang đến cho bạn trải nghiệm tốt, mong bạn có một khởi đầu tốt đẹp mọi lúc. Ngày.\n" +
                                    "\n" +
                                    "  \n" +
                                    "\n" +
                                    "  \uD83D\uDC95Cửa hàng LAIKOU chính hãng\uD83D\uDC95Hỗ trợ bán buôn\uD83D\uDC95 Mang lại cho bạn giá tốt nhất!!! \uD83D\uDC95\n" +
                                    "\n" +
                                    "  \n" +
                                    "\n" +
                                    "  ✅Có 25g huyết thanh anh đào\n" +
                                    "\n" +
                                    "  Thương hiệu: LAIKOU\n" +
                                    "\n" +
                                    "  Khối lượng tịnh: 25g\n" +
                                    "\n" +
                                    "  Xuất xứ: Trung Quốc\n" +
                                    "\n" +
                                    "  Loại da phù hợp: mọi loại da, đặc biệt là da khô\n" +
                                    "\n" +
                                    "  Thời hạn sử dụng: 3 năm\n" +
                                    "\n" +
                                    "  Thành phần chính: Chiết xuất hoa anh đào, ceramide, axit hyaluronic, glycerin, v.v.\n" +
                                    "\n" +
                                    "  Cách sử dụng: Nhỏ vài giọt serum lên mặt, xoa bóp cho đến khi thẩm thấu. và sau đó thoa kem dưỡng da mặt.\n" +
                                    "\n" +
                                    "  \n" +
                                    "\n" +
                                    "  ✅ Tác dụng của huyết thanh anh đào 17ml:\n" +
                                    "\n" +
                                    "  1. Nâng màu da và săn chắc da\n" +
                                    "\n" +
                                    "  2. Dưỡng ẩm và làm sáng màu da,\n" +
                                    "\n" +
                                    "  3. Phục hồi và nuôi dưỡng làn da, hydrat hóa\n" +
                                    "\n" +
                                    "  4. Làm sạch sâu, dưỡng ẩm\n" +
                                    "\n" +
                                    "  5. Mịn màng và tinh tế, rạng rỡ và màu mỡ \n" +
                                    "\n" +
                                    "  6. Da hấp thụ nhanh chóng\n" +
                                    "\n" +
                                    "  \n" +
                                    "\n" +
                                    "  \uD83D\uDCE2Huyết thanh anh đào\n" +
                                    "\n" +
                                    "  Chiết xuất anh đào có thể dưỡng ẩm sâu và khóa ẩm. Cho làn da mỏng manh được dưỡng ẩm, mịn màng, loại bỏ các tác nhân có hại cho da và làm sáng da.",
                            category1, sub3
                    ),

                    //KEM CHỐNG NẮNG

                    new Product(
                            "GMEELAN Chiba Rose Kem chống nắng 30g SPF50+ PA++++ Alpha-arbutin Hàn Quốc trắng da",
                            "https://down-vn.img.susercontent.com/file/cn-11134207-7ras8-m6hx6hmboj6kb5@resize_w900_nl.webp",
                            new BigDecimal("165000"),
                            "GMEELAN - Chiba Rose Kem chống nắng\n" +
                                    "\n" +
                                    "GMEELAN tìm kiếm toàn cầu để giải mã bí mật làm trắng da\n" +
                                    "\n" +
                                    "1、Tại sao bạn chọn chúng tôi:\n" +
                                    "\n" +
                                    "Dung tích: 30g\n" +
                                    "\n" +
                                    "SPF: 50+ PA++++\n" +
                                    "\n" +
                                    "Hiệu quả sản phẩm: chống nắng, phục hồi và dưỡng trắng chuyên sâu.\n" +
                                    "\n" +
                                    "Loại da: Tất cả loại da\n" +
                                    "\n" +
                                    "2、Tại sao bạn chọn chúng tôi:\n" +
                                    "\n" +
                                    "SPF50+ PA++++ Bảo vệ thực sự, không bết dính\n" +
                                    "\n" +
                                    "Kem chống nắng hiệu quả cao, mỏng nhẹ và không gây bóng nhờn.\n" +
                                    "\n" +
                                    "Rose centifolia và arbutin để làm dịu, phục hồi và dưỡng trắng chuyên sâu.\n" +
                                    "\n" +
                                    "3、Các bước sử dụng:\n" +
                                    "\n" +
                                    " Lấy 2-3 pump kem chống nắng ra tay và dùng ngón tay chấm đều lên mặt, cổ và cơ thể.\n" +
                                    "\n" +
                                    "Thoa đều kem chống nắng theo chuyển động tròn theo cùng một hướng.\n" +
                                    "\n" +
                                    "Sau 30 giây là có thể trang điểm.\n" +
                                    "\n" +
                                    "LỜI KHUYÊN: Nếu bạn ở ngoài trời trong thời gian dài, hãy thoa lại sau mỗi 2 giờ.Thoa lại thường xuyên để duy trì sự bảo vệ, đặc biệt là sau khi đổ mồ hôi,bơi lội hoặc lau bằng khăn.\n" +
                                    "\n" +
                                    "4、Q&A\n" +
                                    "\n" +
                                    "Q1. Da dầu, da mụn và da nhạy cảm có dùng được không?\n" +
                                    "\n" +
                                    "Được. Chúng tôi không thêm các thành phần như cồn, chất bảo quản truyền thống và kích thích tố vào sản phẩm của mình và nó có thể được sử dụng cho mọi loại da.\n" +
                                    "\n" +
                                    "Q2. Thời gian bảo vệ của kem chống nắng là bao lâu?\n" +
                                    "\n" +
                                    "Thời gian bảo vệ trong nhà là 8 tiếng, còn nếu ở ngoài trời lâu thì cứ 2-3 tiếng bạn cần thoa lại một lần.\n" +
                                    "\n" +
                                    "Q3. Tôi có cần tẩy trang sau khi sử dụng không?\n" +
                                    "\n" +
                                    "Bạn không cần phải tẩy trang. Bạn có thể rửa sạch bằng sữa rửa mặt.Gmeelan.",
                            category1, sub4
                    ),

                    new Product(
                            "Sữa Chống Nắng Phổ Rộng Vô Hình Thoáng Da, Kháng Mọi Tác Động UV Invisible Resist",
                            "https://down-vn.img.susercontent.com/file/vn-11134201-7ra0g-m7bq54afge7w70@resize_w900_nl.webp",
                            new BigDecimal("283000"),
                            "1. Sữa Chống Nắng Phổ Rộng UV Defender Invisible Resist SPF 50+ PA ++++ cản nắng bảo vệ da tối đa với 2 lớp màng bảo vệ (Màng lọc Mexoryl SX và Mexoryl XL) và công nghệ Netlock độc quyền giúp cản tia UVA và UVB cả ngày dài. Kết cấu dạng sữa vô hình thoáng da, bền bỉ kháng mọi tác động trước Nước, Mồ Hôi, Nhiệt, Ma sát, Cát và Ô nhiễm. \n" +
                                    "\n" +
                                    "\n" +
                                    "\n" +
                                    "●  VÌ SAO BẠN SẼ THÍCH? \n" +
                                    "\n" +
                                    "Chống nắng màng lọc khủng thường dày bí da? Chống nắng mỏng nhẹ thường dùng liệu bảo vệ tối ưu?\n" +
                                    "\n" +
                                    "Chọn chống nắng: chọn mỏng nhẹ hay bảo vệ tối ưu? Không cần đắn đo nữa vì bạn có tất cả trong một!\n" +
                                    "\n" +
                                    "Giới thiệu Sữa Chống Nắng Phổ Rộng UV Defender Invisible Resist Diện Mạo Mới Từ L’Oréal Paris, Chuyên Gia Khoa Học Chống Nắng với hơn 80 Năm Nghiên Cứu. Với phát minh độc quyền NETLOCK, màng chắn bức xạ triệu điểm trong kết cấu thoáng nhẹ vô hình trên da, bền bỉ thách thức 7 cấp độ kiểm tra khắc nghiệt (Thoáng Da, Chà Xát, Nhiệt, Mồ Hôi, Nước, Khói Bụi, UV Camera).\n" +
                                    "\n" +
                                    "●  Thành phần chính: \n" +
                                    "\n" +
                                    "Kem chống nắng L’Oreal Paris UV Defender Invisible Resist chứa 6 màng lọc gồm Octisaltate, Uvinul T150, Tinosorb S, Avobenzone, Mexoryl XL, Mexoryl SX với chỉ số chống nắng SPF50+ PA++++\n" +
                                    "\n" +
                                    "●  ƯU ĐIỂM NỔI BẬT \n" +
                                    "\n" +
                                    "Được kiểm nghiệm và chứng minh hiệu quả trên da châu Á, bền bỉ thách thức mọi điều kiện:\n" +
                                    "\n" +
                                    "2 TIẾNG BỀN BỈ TRONG ĐIỀU KIỆN PHÒNG XÔNG HƠI NÓNG ẨM (35-40 ĐỘ C)\n" +
                                    "\n" +
                                    "80 PHÚT BỀN BỈ TRONG ĐIỀU KIỆN DƯỚI NƯỚC, ĐỔ MỒ HÔI NHIỀU\n" +
                                    "\n" +
                                    "● Không bóng nhờn\n" +
                                    "\n" +
                                    "● Không nhờn rít\n" +
                                    "\n" +
                                    "● Không gây bít tắt lỗ chân lông\n" +
                                    "\n" +
                                    "● Phù hợp cho mọi loại da\n" +
                                    "\n" +
                                    "\n" +
                                    "\n" +
                                    "HƯỚNG DẪN SỬ DỤNG \n" +
                                    "\n" +
                                    "● Phù hợp với mọi loại da. \n" +
                                    "\n" +
                                    "● Dùng 1 lượng kem vừa đủ và chia đều trên mặt và cổ, sau đó thoa đều nhẹ nhàng khắp mặt và cổ. \n" +
                                    "\n" +
                                    "● Sử dụng vào ban ngày, trước khi ra nắng 30 phút, sau các bước dưỡng da thông thường, và trước các bước trang điểm tiếp theo (nếu có)\n" +
                                    "\n" +
                                    "+ Hướng dẫn bảo quản: Nơi khô ráo, thoáng mát. Tránh ánh nắng trực tiếp, nơi có nhiệt độ cao hoặc ẩm ướt. Đậy nắp kín sau khi sử dụng.\n" +
                                    "\n" +
                                    "2. Nước tẩy trang cấp ẩm căng mịn da Hyaluronic Acid 1.5% 400ml\n" +
                                    "\n" +
                                    "Với sự kết hợp không chỉ 1 mà đến 2 loại Hyaluronic Acid ưu việt sẽ mang đến giải pháp chăm sóc da hiệu quả, cho làn da căng mịn và sáng da tức thì. Với Revitalift da sẽ có sự thay đổi rõ rệt, mang đến vẻ ngoài rạng rỡ cho bạn. \n" +
                                    "\n" +
                                    "- Thích hợp sử dụng cho mọi loại da, đặc biệt là da khô hoặc hỗn hợp thiên khô\n" +
                                    "\n" +
                                    "ĐẶC ĐIỂM NỔI BẬT: \n" +
                                    "\n" +
                                    "● Thành phần không chỉ chứa 1 mà đến 2 loại Hyaluronic Acid: \n" +
                                    "\n" +
                                    "● Macro [HA]: Cấp ẩm tối đa cho bề mặt da căng mịn tức thì \n" +
                                    "\n" +
                                    "● Micro [HA]: Thẩm thấu sâu giúp căng đầy nếp nhăn và sáng da từ sâu bên trong.\n" +
                                    "\n" +
                                    "Thành phần chính: Aqua / Water, Hexylene Glycol, Glycerin, Rosa Gallica Flower Extract, Sorbitol, Poloxamer 184, Disodium Cocoamphodiacetate, Disodium Edta, Propylene Glycol, BHT , Polyaminopropyl Biguanide.\n" +
                                    "\n" +
                                    "THÔNG TIN THƯƠNG HIỆU \n" +
                                    "\n" +
                                    "Hơn 100 năm thành lập, L’Oréal là tập đoàn chuyên về mỹ phẩm và chăm sóc sắc đẹp lớn nhất thế giới. L’Oréal Paris đã có mặt tại hơn 120 quốc gia với các dòng sản phẩm về chăm sóc tóc, chăm sóc da và trang điểm dành cho đại chúng. Được xây dựng trên nền tảng khoa học, áp dụng những phát minh công nghệ mới nhất, các sản phẩm L’Oréal Paris có chất lượng cao cấp, đa dạng, dễ sử dụng, với mức giá phù hợp cho tất cả mọi người, đáp ứng nhiều nhu cầu làm đẹp. *L’Oréal Paris là nhãn hiệu mỹ phẩm hàng đầu tại Châu Âu được sản xuất tại nhiều nhà máy trên toàn thế giới như Trung Quốc, Mỹ, Indonesia… Dù được sản xuất ở đâu, các sản phẩm đều tuân theo quy trình kiểm soát chất lượng nghiêm ngặt và đồng đều của L’Oréal Toàn Cầu. Các sản phẩm chính hãng đều có tem nhãn tiếng Việt phía sau và nhập khẩu trực tiếp từ công ty TNHH L’Oréal Việt Nam nên các bạn hoàn toàn yên tâm về chất lượng sản phẩm. \n" +
                                    "\n" +
                                    "Xuất xứ: Indonesia\n" +
                                    "\n" +
                                    "HSD: 3 năm kể từ ngày sản xuất.",
                            category1, sub4
                    ),

                    new Product(
                            "Kem Chống Nắng Nâng Tone Thiên Nhiên Thấm Nhanh An Toàn Cho Mọi Loại Da Khô Dầu Hây Hây SPF 40, PA ++ Cỏ Mềm 60g",
                            "https://down-vn.img.susercontent.com/file/vn-11134207-7ra0g-m7c24j8ntuuu31@resize_w900_nl.webp",
                            new BigDecimal("260000"),
                            "HƯỚNG DẪN SỬ DỤNG:\n" +
                                    "\n" +
                                    "\n" +
                                    "\n" +
                                    "Sau khi rửa mặt và dưỡng ẩm, thoa đều kem kem chống nắng lên mặt và cổ. Dùng trước các bước trang điểm và luôn tẩy trang vào cuối ngày.\n" +
                                    "\n" +
                                    "\n" +
                                    "\n" +
                                    "Hạn dùng: 24 tháng. Mở nắp:12 tháng\n" +
                                    "\n" +
                                    "\n" +
                                    "\n" +
                                    "Khối lượng: 60g\n" +
                                    "\n" +
                                    "\n" +
                                    "\n" +
                                    "Số CBMP: 8680/20/CBMP-HN\n" +
                                    "\n" +
                                    "\n" +
                                    "\n" +
                                    "Bảo quản: Nơi khô mát. Tránh nắng nóng và nguồn nhiệt.\n" +
                                    "\n" +
                                    "\n" +
                                    "\n" +
                                    "Đối tượng sử dụng: Mọi người bao gồm cả trẻ em > 6 tháng tuổi (đặc biệt những làn da nhạy cảm)\n" +
                                    "\n" +
                                    "\n" +
                                    "\n" +
                                    "--------------------------------\n" +
                                    "\n" +
                                    "- Thương hiệu: Cỏ Mềm\n" +
                                    "\n" +
                                    "- Xuất xứ thương hiệu: Việt Nam\n" +
                                    "\n" +
                                    "- Sản xuất tại: Việt Nam.",
                            category1, sub4
                    ),

                    new Product(
                            "Kem chống nắng SCINIC enjoy foundation skip tone up SPF50 + PA + + + + 50g SCINIC enjoy foundation skip tone up suncream",
                            "https://down-vn.img.susercontent.com/file/sg-11134207-7rcd7-ls17nm7oppqv5a@resize_w900_nl.webp",
                            new BigDecimal("132000"),
                            "Kem nền SCINIC Enjoy Skip Tone Up Sunscreen SPF 50 + PA + + + + 50g\n" +
                                    "\n" +
                                    "Mỹ phẩm ba chức năng chống tia cực tím, làm trắng và cải thiện nếp nhăn\n" +
                                    "\n" +
                                    "Kem chống nắng nâng tông tự nhiên giúp làn da của bạn trông đẹp tự nhiên mà không có bất kỳ vết thâm nào\n" +
                                    "\n" +
                                    "Khả năng chống tia cực tím là nhất định, với tông màu be tự nhiên cho hiệu ứng điều chỉnh tông màu da và kết cấu\n" +
                                    "\n" +
                                    "\n" +
                                    "\n" +
                                    "Kem chống nắng Moist Tone Up\n" +
                                    "\n" +
                                    "Giàu độ ẩm, với tông màu be tự nhiên\n" +
                                    "\n" +
                                    "Nâng tông phù hợp với da\n" +
                                    "\n" +
                                    "Kem chống nắng nâng tông bám chặt vào da như của bạn\n" +
                                    "\n" +
                                    "\n" +
                                    "\n" +
                                    "100% vegan ĐẸP\n" +
                                    "\n" +
                                    "Được chứng nhận thuần chay EVE, không bao gồm các thành phần có nguồn gốc động vật\n" +
                                    "\n" +
                                    "\n" +
                                    "\n" +
                                    "Cảm thấy nhẹ nhàng trên da như thể không áp dụng\n" +
                                    "\n" +
                                    "Nâng tông tự nhiên với hiệu ứng hiệu chỉnh kết cấu mượt mà\n" +
                                    "\n" +
                                    "\n" +
                                    "\n" +
                                    "Dưỡng ẩm và kết dính mỏng để lên tông màu be hồng đào tự nhiên\n" +
                                    "\n" +
                                    "\n" +
                                    "\n" +
                                    "Phù hợp với màu da của tôi\n" +
                                    "\n" +
                                    "Bỏ qua kem nền để tự chăm sóc nâng tông độ ẩm\n" +
                                    "\n" +
                                    "\n" +
                                    "\n" +
                                    "Bảo tồn độ trong suốt tự nhiên của da\n" +
                                    "\n" +
                                    "Hoàn thành nhẹ nhàng mà không cần kem nền\n" +
                                    "\n" +
                                    "Nâng tông tự nhiên đạt được trong một lớp duy nhất\n" +
                                    "\n" +
                                    "\n" +
                                    "\n" +
                                    "Khả năng chống tia cực tím đáng tin cậy được xác nhận thông qua các thử nghiệm ứng dụng của con người.",
                            category1, sub4
                    ),

                    new Product(
                            "Sữa chống nắng phổ rộng mỏng nhẹ bảo vệ da và dưỡng sáng mờ thâm nám",
                            "https://down-vn.img.susercontent.com/file/vn-11134201-7ra0g-m7bmw4fb0cxi8e@resize_w900_nl.webp",
                            new BigDecimal("292000"),
                            "ƯU ĐIỂM NỔI BẬT \n" +
                                    "\n" +
                                    "Được kiểm nghiệm và chứng minh hiệu quả trên da châu Á\n" +
                                    "\n" +
                                    "Không bóng nhờn\n" +
                                    "\n" +
                                    "Không nhờn rít\n" +
                                    "\n" +
                                    "Không gây bít tắt lỗ chân lông\n" +
                                    "\n" +
                                    "Phù hợp cho da nhạy cảm\n" +
                                    "\n" +
                                    "\n" +
                                    "\n" +
                                    "HIỆU QUẢ SỬ DỤNG  \n" +
                                    "\n" +
                                    "Trong 12 tuần sử dụng:\n" +
                                    "\n" +
                                    "Giảm 53% thâm nám và đốm nâu\n" +
                                    "\n" +
                                    "Tăng 45% da đều màu và rạng rỡ hơn\n" +
                                    "\n" +
                                    "Giảm 90% Thâm mụn và nám khi kết hợp sử dụng cùng Serum Glycolic Melasyl 8%\n" +
                                    "\n" +
                                    "Kiêm nghiệm lâm sàng trên 78 phụ nữ sử dụng sản phẩm trong 12 tuần\n" +
                                    "\n" +
                                    "HƯỚNG DẪN SỬ DỤNG \n" +
                                    "\n" +
                                    "Dùng 1 lượng kem vừa đủ và chia đều trên mặt và cổ, sau đó thoa đều nhẹ nhàng khắp mặt và cổ. \n" +
                                    "\n" +
                                    "Sử dụng vào ban ngày, trước khi ra nắng 30 phút, sau các bước dưỡng da thông thường, và trước các bước trang điểm tiếp theo (nếu có).\n" +
                                    "\n" +
                                    "Hiệu quả hơn khi kết hợp sử dụng với Serum Glycolic Melasyl 8% [Melasyl+Glycolic+Niacinamide] để dưỡng sáng và mờ thâm nám.\n" +
                                    "\n" +
                                    "HƯỚNG DẪN BẢO QUẢN\n" +
                                    "\n" +
                                    "Bảo quản nơi khô ráo, thoáng mát, tránh ánh nắng trực tiếp hoặc nơi có nhiệt độ cao / ẩm ướt.\n" +
                                    "\n" +
                                    "THÔNG TIN THƯƠNG HIỆU \n" +
                                    "\n" +
                                    "Hơn 100 năm thành lập, L’Oréal là tập đoàn chuyên về mỹ phẩm và chăm sóc sắc đẹp lớn nhất thế giới. L’Oréal Paris đã có mặt tại hơn 120 quốc gia với các dòng sản phẩm về chăm sóc tóc, chăm sóc da và trang điểm dành cho đại chúng.",
                            category1, sub4
                    ),

            new Product(
                    "Scinic Enjoy Kem Chống Nắng Dòng SPF 50+PA++++ SCINICEnjoy sunscreens",
                    "https://down-vn.img.susercontent.com/file/sg-11134207-7rep8-m2g4n380p7li2e@resize_w900_nl.webp",
                    new BigDecimal("195000"),
                    "Thưởng THỨC SUPER MILD SUN ESSENCE SPF 50% / PA + + + +\n" +
                            "\n" +
                            "\n" +
                            "\n" +
                            "Kiểm tra cải thiện độ bám của lớp trang điểm đã hoàn thành\n" +
                            "\n" +
                            "\n" +
                            "\n" +
                            "Đã hoàn thành thử nghiệm duy trì độ ẩm trong 8 giờ\n" +
                            "\n" +
                            "\n" +
                            "\n" +
                            "Nếu bạn đang tìm kiếm một loại kem chống nắng cung cấp lớp nền dưỡng ẩm và mịn màng cho da\n" +
                            "\n" +
                            "“Không còn kem chống nắng dễ bị mòn!\n" +
                            "\n" +
                            "\n" +
                            "\n" +
                            "Tự tin trước mặt trời\n" +
                            "\n" +
                            "Phun sương ẩm hấp thụ nhanh chóng!\n" +
                            "\n" +
                            "\"Khóa ẩm #sun Tinh chất giúp tăng tuổi thọ lớp trang điểm. \"\n" +
                            "\n" +
                            "\n" +
                            "\n" +
                            "\"Giảm bóng và tăng độ ẩm để có vẻ ngoài ngậm nước hơn.\"\n" +
                            "\n" +
                            "Kem chống nắng dưỡng ẩm đáng tin cậy và đáng tin cậy. \"\n" +
                            "\n" +
                            "\n" +
                            "\n" +
                            "\"Giữ ẩm 8 giờ.\"\n" +
                            "\n" +
                            "Khả năng tương thích trang điểm là tốt.\n" +
                            "\n" +
                            "Ứng dụng mượt mà.\n" +
                            "\n" +
                            "\n" +
                            "\n" +
                            "Bảo vệ đồng thời chống lại tia UV và khô da. \"\n" +
                            "\n" +
                            "Kem chống nắng dưỡng ẩm và mịn màng. \"\n" +
                            "\n" +
                            "Phun sương giữ ẩm cho da trong 8 giờ đồng thời ngăn chặn tia UV.",
                    category1, sub4
            ),

                    new Product(
                            "[Torriden Chính hãng] Kem chống nắng nâng tone da BALANCEFUL CICA với SPF 50+ PA++++, 60ml, Sun Cream",
                            "https://down-vn.img.susercontent.com/file/sg-11134207-7rfhf-m4eh21pxt2qj4b@resize_w900_nl.webp",
                            new BigDecimal("385000"),
                            "Kem chống nắng rau má nâng tông BALANCEFUL,\n" +
                                    "\n" +
                                    "đánh bay nỗi lo về tia UV, tận hưởng ánh nắng mặt trời.\n" +
                                    "\n" +
                                    "\n" +
                                    "\n" +
                                    "\uD83D\uDFE2 Đặc điểm chính\n" +
                                    "\n" +
                                    "\uD83C\uDF40 Kem chống nắng nâng tông da chống nắng 3 trong 1!\n" +
                                    "\n" +
                                    "\uD83C\uDF40 Điều chỉnh những vết mẩn đỏ trong thư\n" +
                                    "\n" +
                                    "\uD83C\uDF40 Chống nắng mạnh mẽ nhờ thành phần SPF50+, PA++++\n" +
                                    "\n" +
                                    "\uD83C\uDF40 Dành cho làn da nhạy cãm quanh năm \n" +
                                    "\n" +
                                    "\n" +
                                    "\n" +
                                    "\uD83D\uDFE2 Dành cho da\n" +
                                    "\n" +
                                    "Còn sản phẩm chống tia UV, sản phẩm chống nhăn và sáng trắng làn da\n" +
                                    "\n" +
                                    "\n" +
                                    "\n" +
                                    "\uD83D\uDFE2 Hiệu quả\n" +
                                    "\n" +
                                    "\uD83C\uDF40Thành phần 5D CICA\n" +
                                    "\n" +
                                    "\uD83C\uDF40Hiệu chỉnh tông da màu xanh\n" +
                                    "\n" +
                                    "\uD83C\uDF40An toàn cho cả làn dạy nhảm\n" +
                                    "\n" +
                                    "\n" +
                                    "\n" +
                                    "\uD83D\uDFE2 Hướng dẫn sử dụng\n" +
                                    "\n" +
                                    "Bước 1. Sau các bước dưỡng da, thoa một lượng kem vừa đủ lên vùng da dễ bị bắt nắng như trán, sóng mũi, quanh mắt, gò má trước\n" +
                                    "\n" +
                                    "Bước 2. Vỗ nhẹ nhàng để kem hấp thụ đều vào da\n" +
                                    "\n" +
                                    "\n" +
                                    "\n" +
                                    "\uD83D\uDFE2 Mẹo khi dùng!\n" +
                                    "\n" +
                                    "\uD83C\uDF40 Giải pháp hàng ngày giúp hiệu chỉnh tông màu da tự nhiên\n" +
                                    "\n" +
                                    "\uD83C\uDF40 Có thể dùng để thay kem lót trang điểm (Không cần dùng Foundation)\n" +
                                    "\n" +
                                    "\uD83C\uDF40 Nên dùng ở bước cuối cùng của quy trình dưỡng da và trước khi đánh kem nền foundation.",
                            category1, sub4
                    ),

                    new Product(
                            "Kem chống nắng hoa anh đào sử dụng cho mặt và toàn thân LAIKOU Sakura chống thấm nước SPF50 PA+++ 50g",
                            "https://down-vn.img.susercontent.com/file/vn-11134207-7ras8-m1xq689frtmnfb@resize_w900_nl.webp",
                            new BigDecimal("110000"),
                            "Kem chống nắng toàn thân LAIKOU Sakura chống thấm nước SPF50 PA+++50g\n" +
                                    "\n" +
                                    "Thời hạn sử dụng: 3 năm\n" +
                                    "Thành phần chính: Chiết xuất hoa Prunus Lannesiana\n" +
                                    "Công dụng:\n" +
                                    "-Bảo vệ da khỏi tác hại của ánh sáng mặt trời\n" +
                                    "-Chặn các tia cực tím\n" +
                                    "-Chụp lại UVA & UVB\n" +
                                    "-Bảo vệ da khỏi môi trường ô nhiễm\n" +
                                    "\n" +
                                    "Cách sử dụng:\n" +
                                    "Thoa đều một lượng kem chống nắng thích hợp lên mặt, cổ, cánh tay và chân trước khi trang điểm hoặc đi ra ngoài, mát xa nhẹ nhàng cho đến khi nó được hấp thụ.\n" +
                                    "Bảo quản: Để tránh tiếp xúc trực tiếp với ánh nắng mặt trời, vui lòng bảo quản sản phẩm ở nơi khô ráo, thoáng mát.\n" +
                                    "Thận trọng: Da nhạy cảm nên được thử trên da tay trước khi sử dụng. Nếu bạn cảm thấy không thoải mái, hãy ngừng sử dụng ngay lập tức.",
                            category1, sub4
                    ),

                    //SỮA TẮM DƯỠNG ẨM

                    new Product(
                            "Sữa tắm Susoft hương nước hoa Light Wishes, Golden Night, Sweet Love 800ml",
                            "https://down-vn.img.susercontent.com/file/vn-11134207-7ra0g-m7b1uchtvtkmc0@resize_w900_nl.webp",
                            new BigDecimal("127000"),
                            "\uD83C\uDF35 THÔNG TIN SẢN PHẨM\n" +
                                    "\n" +
                                    "- Thương hiệu: Susoft\n" +
                                    "\n" +
                                    "- Dung tích: 800ml\n" +
                                    "\n" +
                                    "- Hạn sử dụng: 3 năm từ ngày sản xuất\n" +
                                    "\n" +
                                    "- Ngày sản xuất: xem trên bao bì\n" +
                                    "\n" +
                                    "- Xuất xứ: Việt Nam.",
                            category2, sub5
                    ),

                    new Product(
                            "Sữa tắm dưỡng trắng cánh hoa hồng Damask Weilaiya Shower Gel làm sạch và sáng da toàn thân 450ml",
                            "https://down-vn.img.susercontent.com/file/vn-11134207-7ra0g-m79a9woamm0s28@resize_w900_nl.webp",
                            new BigDecimal("364000"),
                            "CÔNG DỤNG SỮA TẮM TRẮNG DA CÁNH HOA HỒNG DAMASK WEILAIYA\n" +
                                    "\n" +
                                    "- Sữa tắm trắng da Weilaiya với công nghệ độc quyền bảo quản cánh hoa hồng tươi Damask từ Bulgaria cùng 3 tầng hương nước hoa, giống mùi hương Elie Saab.\n" +
                                    "\n" +
                                    "- Sữa tắm dưỡng da hoa hồng Damask Weilaiya có kết cấu thẩm thấu sâu, dưỡng ẩm cho làn da căng mướt, mịn màng, thúc đẩy da sản sinh collagen giúp da trắng hồng tự nhiên.\n" +
                                    "\n" +
                                    "- Sữa tắm dưỡng trắng toàn thân Weilaiya phù hợp cho mọi loại da, kể cả da nhạy cảm.",
                            category2, sub5
                    ),

                    new Product(
                            "Sữa tắm trắng da dưỡng ẩm tẩy da chết GRACE AND GLOW Body Wash 400ml",
                            "https://down-vn.img.susercontent.com/file/vn-11134207-7r98o-lladyx2o1igmec@resize_w900_nl.webp",
                            new BigDecimal("95000"),
                            "1. Sữa tắm hương nước hoa Grace and Glow dưỡng ẩm sáng da Black Opium  \n" +
                                    "\n" +
                                    "Sữa tắm với hương thơm sang trọng của nước hoa Black Opium được bảo chế như một loại xà phòng tắm có thể làm sáng da, cho da mềm mại và ẩm mượt hơn.\n" +
                                    "\n" +
                                    "\n" +
                                    "\n" +
                                    "Thành phần gồm có:\n" +
                                    "\n" +
                                    "Niacinamide\n" +
                                    "\n" +
                                    "Làm sáng da toàn thân\n" +
                                    "\n" +
                                    "Duy trì độ ẩm cho da cơ thể\n" +
                                    "\n" +
                                    "Làm sáng da tăng sắc tố\n" +
                                    "\n" +
                                    "Ngăn ngừa mụn trên cơ thể\n" +
                                    "\n" +
                                    "Bảo vệ cơ thể khỏi ô nhiễm, ánh nắng và độc tố\n" +
                                    "\n" +
                                    "\n" +
                                    "\n" +
                                    "Glutathione\n" +
                                    "\n" +
                                    "Có chức năng như một tác nhân làm sáng da toàn thân\n" +
                                    "\n" +
                                    "Cải thiện độ đàn hồi của da.",
                            category2, sub5
                    ),

                    new Product(
                            "Combo dưỡng trắng da body sữa tắm, sữa dưỡng thể Five Grains Niacinamide, Alpha-Arbutin 500ml",
                            "https://down-vn.img.susercontent.com/file/vn-11134207-7ra0g-m6q9m4svt8pkd7@resize_w900_nl.webp",
                            new BigDecimal("229000"),
                            "*SỮA TẮM DƯỠNG TRẮNG NIACINAMIDE 500ML\n" +
                                    "\n" +
                                    "Dung tích 500ml\n" +
                                    "\n" +
                                    "Công dụng: \n" +
                                    "\n" +
                                    "- Dưỡng ẩm, làm sạch\n" +
                                    "\n" +
                                    "- Nuôi dưỡng làn da trắng sáng tự nhiên \n" +
                                    "\n" +
                                    "- Hương thơm dễ chịu bền lâu\n" +
                                    "\n" +
                                    "Lớp bọt tinh tế đáp ứng hương thơm làm đẹp, mang lại làn da ẩm mượt và làm sạch; chứa nhiều tinh chất dưỡng da chiết xuất từ \u200B\u200Bthực vật, nhẹ nhàng làm sạch da và tỏa hương thơm dễ chịu sau khi tắm. Chứa công thức Bio Active được chiết xuất từ 9 thành phần thiên nhiên an toàn, lành tính cho mọi làn da.\n" +
                                    "\n" +
                                    "Sữa tắm không dùng cho trẻ sơ sinh.\n" +
                                    "\n" +
                                    "Hướng dẫn sử dụng: Cho sữa tắm vào lòng bàn tay hoặc bông tắm, tạo bọt rồi mát-xa đều khắp cơ thể. Sau đó tắm lại với nước sạch.\n" +
                                    "\n" +
                                    "Xuất xứ: P.R.C\n" +
                                    "\n" +
                                    "Dung tích: 500ml. \n",
                            category2, sub5
                    ),

                    new Product(
                            "Sữa Tắm Dược Liệu Lherbs Hương Thư Giãn Giúp Dưỡng Ẩm, Mềm Mại Da, Sạch Bã Nhờn Và Cải Thiện Mụn",
                            "https://down-vn.img.susercontent.com/file/vn-11134207-7ras8-m0wrzlaugdv1af@resize_w900_nl.webp",
                            new BigDecimal("75000"),
                            "CÔNG DỤNG\n" +
                                    "\n" +
                                    "- Làm sạch da và bã nhờn.\n" +
                                    "\n" +
                                    "- Các chiết xuất thảo mộc giúp dưỡng ẩm da, giúp da mềm mại, hồng hào tươi nhuận.\n" +
                                    "\n" +
                                    "- Gel tắm thảo mộc an toàn giúp cải thiện các vấn đề về da như rôm sảy, mẩn ngứa, trứng cá trên cơ thể và làm dịu các vết côn trùng cắn.\n" +
                                    "\n" +
                                    "- Hương thư giãn với thành phần chủ yếu của hương liệu tự nhiên và tinh dầu thiên nhiên sẽ đem lại sự thư giãn, thoải mái.\n" +
                                    "\n" +
                                    "\n" +
                                    "\n" +
                                    "HƯỚNG DẪN SỬ DỤNG\n" +
                                    "\n" +
                                    "- Cho một lượng vừa đủ sản phẩm ra tay hoặc bông tắm -> làm ướt và chà xát tạo bọt trước khi massage đều khắp cơ thể.\n" +
                                    "\n" +
                                    "- Xả sạch bằng nước ấm.\n" +
                                    "\n" +
                                    "- Xả lần cuối với nước mát hơn để da săn chắc. m|n màng. Có thể sử dụng hằng ngày.",
                            category2, sub5
                    ),

                    new Product(
                            "Sữa tắm dưỡng da thiên nhiên Enchanteur Naturelle hương hoa Lavender/ Iris/ Rose 510g - Live",
                            "https://down-vn.img.susercontent.com/file/sg-11134201-7rd51-m6rn7rbq5v2qea@resize_w900_nl.webp",
                            new BigDecimal("145000"),
                            "SẢN PHẨM VỚI CÁC THÀNH PHẦN VÀ CÔNG DỤNG:\n" +
                                    "\n" +
                                    "- Sữa tắm dưỡng da Enchanteur Naturelle hương hoa Lavender/ Iris 510gr ứng dụng công nghệ Micellar đầu tiên tại Việt Nam, thanh lọc da dịu nhẹ, giúp mật ong thấm sâu nuôi dưỡng da tốt hơn.\n" +
                                    "\n" +
                                    "- Thành phần mật ong Acacia thiên nhiên từ Pháp giúp nuôi dưỡng làn da, tăng cường độ ẩm.\n" +
                                    "\n" +
                                    "- Hương hoa lavender từ Pháp mang lại cảm giác thư giãn tuyệt vời.\n" +
                                    "\n" +
                                    "- 0% Paraben, Silicone.",
                            category2, sub5
                    ),

                    new Product(
                            "Sữa Tắm LASHE SUPERFOOD Dưỡng Da Sáng Mịn / Dưỡng Ẩm Chuyên Sâu / Dưỡng Da Tươi Trẻ / Dưỡng Da Căng Bóng 610G",
                            "https://down-vn.img.susercontent.com/file/vn-11134201-7ra0g-m795p0hfiwl2dc@resize_w900_nl.webp",
                            new BigDecimal("142000"),
                            "1. Sữa tắm Lashe Superfood Dưỡng Da Sáng Mịn chứa Niacinamide và chiết xuất Kỷ Tử, Dầu Hạnh Nhân 610g\n" +
                                    "\n" +
                                    "Tác động môi trường như thời tiết, ánh nắng, khói bụi...khiến da trở nên khô sạm, xỉn màu. LASHE SUPERFOOD cung cấp dưỡng chất cho da khi tắm với chiết xuất từ nguyên liệu tự nhiên, bổ sung NIACINAMIDE và công nghệ X-VITA, giúp dưỡng da hiệu quả, cho da sáng mịn đầy sức sống.\n" +
                                    "\n" +
                                    "ĐẶC ĐIỂM NỔI BẬT\n" +
                                    "\n" +
                                    "- Chứa NIACINAMIDE được biết giúp dưỡng sáng da hiệu quả, đều màu da.\n" +
                                    "\n" +
                                    "- Thành phần từ SUPERFOOD: chiết xuất Kỷ Tử giàu Vitamin C và Dầu Hạnh Nhân giàu Vitamin E\n" +
                                    "\n" +
                                    "+ Vitamin C: hạn chế sự chuyển hóa melanin, giúp dưỡng sáng da\n" +
                                    "\n" +
                                    "+ Vitamin E: giúp cải thiện tính đàn hồi của da, giúp da mịn màng. \n" +
                                    "\n" +
                                    "- Công nghệ X-VITA chuyên biệt cho da.\n" +
                                    "\n" +
                                    "Cung cấp dưỡng chất cho da mịn màng ngời sáng, xóa tan nỗi lo da xỉn màu.\n" +
                                    "\n" +
                                    "HIỆU QUẢ SỬ DỤNG\n" +
                                    "\n" +
                                    "- 3x sức mạnh sáng da\n" +
                                    "\n" +
                                    "**Với 3 thành phần sáng da.",
                            category2, sub5
                    ),

                    new Product(
                            "Sữa tắm dưỡng da nước hoa cao cấp Vi Jully thơm và dưỡng da mềm mịn",
                            "https://down-vn.img.susercontent.com/file/vn-11134207-7r98o-ly3x45h3jjyb55@resize_w900_nl.webp",
                            new BigDecimal("120000"),
                            "“Hạnh phúc tỏa ra như hương thơm của hoa và mang những điều tốt đẹp cho bạn!”\n" +
                                    "\n" +
                                    "\n" +
                                    "\n" +
                                    "Xuất phát từ góc nhìn đó, VIJULLY đã tích cực tìm kiếm và phát triển dòng sản phẩm mới với mong muốn mang đến cho khách hàng “mùi hương của hạnh phúc” - để khi đầu mũi của bạn chạm vào hương thơm, cơ thể sẽ từ từ được thả lỏng, thư giãn và đắm chìm trong mùi hương nhẹ nhàng ấy.\n" +
                                    "\n" +
                                    "\n" +
                                    "\n" +
                                    "BST Sữa tắm nước hoa Heureux by VIJULLY là dòng sản phẩm được nghiên cứu kỹ lưỡng, cẩn thận dựa trên cơ địa của người Châu Á nói chung và Việt Nam nói riêng. Phù hợp với thời tiết nhiệt đới, với những nốt hương nước hoa từ dịu dàng, thanh mát đến nồng ấm và thích hợp với mọi lứa tuổi.\n" +
                                    "\n" +
                                    "\n" +
                                    "\n" +
                                    "Bên cạnh đó, BST Sữa tắm nước hoa Heureux by VIJULLY còn chứa các thành phần lành tính từ thiên nhiên như: chiết xuất dâu tằm, tảo biển, tảo nâu, táo, nho, dầu hoa hướng dương,... cùng điều kiện tiên quyết là nói KHÔNG với: #Silicon, #Paraben, #Cồn - tất cả cộng hưởng cho ra đời một sản phẩm: An toàn - Lành tính - Chất lượng. Ngoài việc làm sạch, BST Sữa tắm nước hoa Heureux by VIJULLY còn giúp tăng cường hàng rào giữ ẩm cho da, tẩy tế bào chết nhẹ nhàng và làm săn chắc da,...",
                            category2, sub5
                    ),

                    //TẨY TẾ BÀO CHẾT BODY

                    new Product(
                            "Tẩy Tế Bào Chết Body Scrub Cà Phê Organic - Mắc Ca 235g MACALAND Dưỡng Ẩm, Chăm Da Sáng Mịn",
                            "https://down-vn.img.susercontent.com/file/vn-11134207-7r98o-lzadrrca51l920@resize_w900_nl.webp",
                            new BigDecimal("209000"),
                            "Macaland là thương hiệu mỹ phẩm Việt đang trên hành trình ứng dụng Dầu Mắc Ca cùng các thành phần thiên nhiên từ nguồn nông sản Việt, kết hợp quy trình sản xuất công nghệ tiến tiến vào các sản phẩm phục hồi hư tổn.\n" +
                                    "Lần này, Macaland triển khai khai thác vùng nguyên liệu Cà phê đạt chuẩn Organic ứng dụng vào mỹ phẩm. Tẩy tế bào chết toàn thân kết hợp từ Bột Mắc Ca, Dầu Mắc Ca và Cà Phê Organic với hy vọng lan tỏa nhận thức về ưu điểm của mỹ phẩm organic. Đồng thời sản phẩm giúp nông dân địa phương gia tăng thu nhập và thúc đẩy chuyển đổi nông nghiệp bền vững.",
                            category2, sub6
                    ),

                    new Product(
                            "Tẩy tế bào chết toàn thân Lelnia Aloe Tẩy tế bào chết Làm sạch sâu",
                            "https://down-vn.img.susercontent.com/file/sg-11134201-7ra0i-m581cqvcmfzfb1@resize_w900_nl.webp",
                            new BigDecimal("27000"),
                            "1. Tẩy da chết nhẹ nhàng, không có hạt để ngăn ngừa làm sạch quá mức\n" +
                                    "2. Nhẹ nhàng làm tan lớp biểu bì cũ mà không làm tổn thương da\n" +
                                    "3. Kết cấu Gel làm mới, tan chảy ngay khi bạn thoa và không nhờn\n" +
                                    "4. Làm sạch và làm sáng da, hút bụi bẩn trong lỗ chân lông và thúc đẩy sự hấp thụ của các sản phẩm chăm sóc da sau đó.\n" +
                                    "5. Làm sạch lớp biểu bì lão hóa và loại bỏ bụi bẩn và dầu thừa\n" +
                                    "6. Cải thiện làn da thô ráp, làm mềm và dưỡng ẩm, bổ sung và khóa ẩm, giúp da sạch và ẩm.",
                            category2, sub6
                    ),

                    new Product(
                            "Tẩy da chết cơ thể cà phê Đắk Lắk Cocoon cho làn da mềm mại và rạng rỡ 200ml Coffee Body Polish",
                            "https://down-vn.img.susercontent.com/file/vn-11134207-7r98o-ltrigxkjo4qy27@resize_w900_nl.webp",
                            new BigDecimal("90000"),
                            "Cơ thể chúng ta hằng ngày vẫn đang đào thải hàng tỉ tế bào chết, chúng được lưu lại trên da, kết thành mảng cùng bụi bẩn, gây bít tắc lỗ chân lông, có thể khiến da nổi mụn. Vậy việc loại bỏ những lớp da chết ấy là điều cần thiết khi chăm sóc da.\n" +
                                    "\n" +
                                    "Thành phần chính\n" +
                                    "Cà phê Đăk Lăk\n" +
                                    "Cà phê có tác dụng chống oxi hóa, Caffein trong bã cà phê có tác dụng lưu thông máu, ngăn chặn quá trình lão hóa. \n" +
                                    "\n" +
                                    "Bơ ca cao\n" +
                                    "Có khả năng giữ ẩm tuyệt vời, chống những vết rạn, làm mềm da khô và chống nhăn da.\n" +
                                    "\n" +
                                    "Công dụng\n" +
                                    "• Làm bỏ da chết toàn thân\n" +
                                    "\n" +
                                    "• Mang lại làn da mịn màng ngay sau khi sử dụng\n" +
                                    "\n" +
                                    "• Giúp da sáng mịn, đều màu.\n" +
                                    "\n" +
                                    "\n" +
                                    "Ưu điểm\n" +
                                    "• Không sử dụng vi hạt nhựa\n" +
                                    "\n" +
                                    "Thành phần đầy đủ\n" +
                                    "Aqua/Water, Coffea Arabica (coffee) Seed Powder, Cetearyl Alcohol, Cocos Nucifera (coconut) Oil, Cocamidopropyl Betaine, Glyceryl Stearate, C15-19 Alkane, Glycerin, Ceteareth-20, Ceteareth-12, Theobroma Cacao (Cocoa) Seed Butter, Butyrospermum Parkii (shea) butter, Cetyl Palmitate, Glycine Soja (soybean) Sterols, Phospholipids, Crosspolymer, Tocopheryl Acetate, Xanthan gum, Phenoxyethanol, Sodium Hydroxide, BHT, Ethylhexylglycerin, Trisodium Ethylenediamine Disuccinate.\n" +
                                    " \n" +
                                    "Hướng dẫn sử dụng\n" +
                                    "Thoa một lượng sản phẩm lên da ướt. Mát-xa nhẹ nhàng từ cổ đến chân, sau đó tắm sạch lại với nước. Dùng 2-3 lần một tuần để đạt kết quả tốt nhất.\n" +
                                    "\n" +
                                    "Xuất xứ: Việt Nam\n" +
                                    "Dung tích: 200ml\n" +
                                    "Hạn sử dụng: 3 năm kể từ NSX.",
                            category2, sub6
                    ),

                    new Product(
                            "Tẩy Tế Bào Chết Da Đầu Rootoo Giảm Gàu Nhờn Kháng Nấm Ngừa Bết Rụng Tóc (150g/300g)",
                            "https://down-vn.img.susercontent.com/file/vn-11134207-7ra0g-m76a3lq6yfdk7f@resize_w900_nl.webp",
                            new BigDecimal("124000"),
                            "[LƯU Ý 1: QUÀ TẶNG ÁP DỤNG CHO ĐƠN HÀNG MUA PHÂN LOẠI 150G/300G, PHÂN LOẠI 50G ĐỂ KHÁCH MUA TRẢI NGHIỆM THỬ SP]\n" +
                                    "\n" +
                                    "[LƯU Ý 2: QUÝ KHÁCH VUI LÒNG CHECK KỸ GIỎ HÀNG, THÊM QUÀ TẶNG TRƯỚC KHI CHỐT ĐƠN]\n" +
                                    "\n" +
                                    "Tẩy Tế Bào Chết Da Đầu với sự kết hợp tinh tế từ các loại dầu và tinh dầu tự nhiên như: Dầu jojoba, Dầu macca, Dầu argan, Tinh dầu hoa bưởi, Tinh dầu chanh sần, Tinh dầu bạc hà,...cùng các chiết xuất thảo dược như: Chiết xuất cỏ mần trầu, Chiết xuất cà phê, Chiết xuất gừng,... giúp làm sạch sâu và loại bỏ các tạp chất trên da đầu. Đồng thời bảo vệ da đầu một cách hiệu quả, giúp cân bằng độ pH trên da đầu, thúc đẩy sự phục hồi và nâng cao hiệu quả của các sản phẩm chăm sóc tóc khác.\n" +
                                    "\n" +
                                    "\n" +
                                    "\n" +
                                    "1. THÔNG TIN SẢN PHẨM:\n" +
                                    "\n" +
                                    "- Tên sản phẩm: Tẩy Tế Bào Chết Da Đầu Rootoo Thao Dược (BEST SELLER - ĐỘC QUYỀN)\n" +
                                    "\n" +
                                    "- Dạng sản phẩm: dạng hũ có nắp vặn tiện lợi\n" +
                                    "\n" +
                                    "- Mùi hương: hương thơm dịu nhẹ với mùi thảo dược tự nhiên\n" +
                                    "\n" +
                                    "- Khối lượng: 150g/300g\n" +
                                    "\n" +
                                    "- Loại da đầu phù hợp: da đầu gàu và dầu nhờn\n" +
                                    "\n" +
                                    "- Hạn sử dụng: 2 năm kể từ ngày sản xuất - 1 năm kể từ ngày mở nắp.",
                            category2, sub6
                    ),

                    new Product(
                            "Tẩy tế bào chết muối hồng Himalaya Eumony làm sạch sâu, dưỡng ẩm, sáng da đều màu, hương nước hoa",
                            "https://down-vn.img.susercontent.com/file/vn-11134207-7r98o-ltufo52lijnub7@resize_w900_nl.webp",
                            new BigDecimal("139000"),
                            "Trong quy trình chăm sóc da hàng ngày, việc tẩy tế bào chết không chỉ đơn thuần là một bước, mà là trọng điểm quan trọng giữa việc giữ cho làn da của bạn sạch sẽ và làm mới nó. Là bí quyết không thể thiếu để giữ cho làn da luôn trẻ trung, rạng rỡ và đầy sức sống.\n" +
                                    "\n" +
                                    "\n" +
                                    "\n" +
                                    "Hãy khám phá sản phẩm Tẩy tế bào chết muối hồng Himalaya SoftSmooth Body Srub Eumony hương nước hoa - một giải pháp hiệu quả và an toàn để giúp làn da của bạn thở phấn khích và tràn đầy sức sống mỗi ngày.\n" +
                                    "\n" +
                                    "\n" +
                                    "\n" +
                                    "THÔNG TIN SẢN PHẨM:\n" +
                                    "\n" +
                                    "- Tên sản phẩm: Tẩy tế bào chết muối hồng Himalaya SoftSmooth Body Srub Eumony hương nước hoa\n" +
                                    "\n" +
                                    "- Dung tích: 300g\n" +
                                    "\n" +
                                    "- Hạn sử dụng: 36 tháng\n" +
                                    "\n" +
                                    "- Sản xuất tại: Việt Nam\n" +
                                    "\n" +
                                    "\n" +
                                    "\n" +
                                    "CÔNG DỤNG:\n" +
                                    "\n" +
                                    "- Tẩy tế bào chết cơ thể giúp làm sạch nhẹ nhàng cho da, làm sạch tế bào da chết, làm sạch bụi bẩn bã nhờn trên da, hỗ trợ giảm mụn lưng, dưỡng ẩm da, giúp da mềm mại và mịn màng.",
                            category2, sub6
                    ),

                    new Product(
                            "Tẩy tế bào chết body - Cám Gạo làm sáng da, dưỡng ẩm, ngăn ngừa lão hóa SHSO Beauty 200g - NPC PHAR",
                            "https://down-vn.img.susercontent.com/file/vn-11134207-7ras8-m4poqkp0ee7k1a@resize_w900_nl.webp",
                            new BigDecimal("92500"),
                            "“Cám gạo” có kết cấu hạt siêu mịn giúp tẩy sạch tế bào chết trên da một cách nhẹ nhàng, dưỡng ẩm sâu và mang lại cho bạn làn da sáng mịn ngay lần đầu sử dụng mà không gây tổn thương hay bào mòn da.\n" +
                                    "\n" +
                                    "\n" +
                                    "\n" +
                                    "I. THÔNG TIN SẢN PHẨM:\n" +
                                    "\n" +
                                    "- Thành phần chính: Dầu cám gạo, Niacinamide (vitamin B3), Vitamin B5, Muối biển, Đường non Hàn Quốc, Vitamin E,Tế bào gốc từ lá Tía tô\n" +
                                    "\n" +
                                    "- Dung tích: 250 gram\n" +
                                    "\n" +
                                    "- Mùi hương: gạo tinh khiết từ thiên nhiên\n" +
                                    "\n" +
                                    "- Hạn dùng: 3 năm. Mở nắp: 9 tháng\n" +
                                    "\n" +
                                    "\n" +
                                    "\n" +
                                    "II. ĐẶC ĐIỂM NỔI BẬT:\n" +
                                    "\n" +
                                    "- Sản phẩm được sản xuất theo công nghệ \"Water Less\" không sử dụng nước nên mỗi khách hàng sử dụng sản phẩm là đang chung tay góp phần bảo vệ môi trường và bảo vệ trái đất\n" +
                                    "III. CÔNG DỤNG:\n" +
                                    "\n" +
                                    "- Giúp dễ dàng lấy đi tế bào chết trên da. thông thoáng lỗ chân lông. \n" +
                                    "\n" +
                                    "- Làm sạch lỗ chân lông, ngăn ngừa viêm tắc, giảm mụn lưng đem lại làn da sáng khỏe, mịn mượt phù hợp với với những ai đang bị tình trạng viêm tắc nang lông.\n" +
                                    "\n" +
                                    "- Bổ sung các dưỡng chất cho da, tái tạo da và xóa mờ vết thâm\n" +
                                    "\n" +
                                    "- Giúp ngăn chặn tình trạng da sần vỏ cam trên cơ thể.\n" +
                                    "\n" +
                                    "- Hỗ trợ làm sạch mụn lưng, mụn mông, viêm lỗ chân lông\n" +
                                    "\n" +
                                    "- Tăng cường khả năng giữ ẩm da, làm mềm da, giúp ngăn ngừa các dấu hiệu lão hóa cho làn da luôn sáng mịn đều màu và tươi trẻ.",
                            category2, sub6
                    ),

                    new Product(
                            "Tẩy da chết Body Bơ Tươi BESILKI 3in1 sáng mịn, ẩm mượt 170ml, 280ml",
                            "https://down-vn.img.susercontent.com/file/vn-11134201-7ra0g-m79amlhw5vlf66@resize_w900_nl.webp",
                            new BigDecimal("113000"),
                            "Tẩy tế bào chết Besilki từ chiết xuất quả Bơ giàu các loại dầu tự nhiên, các loại Vitamin E & C giúp tăng cường độ ẩm, tái tạo da, cho da sáng mịn và ẩm mượt tức thì.\n" +
                                    "\n" +
                                    "Công nghệ siêu thẩm thấu Niosome đưa vitamin C thẩm thấu sâu vào các tầng biểu bì, mang lại hiệu quả sáng da gấp 10 lần (*).\n" +
                                    "\n" +
                                    "(*) so với vitamin C thông thường\n" +
                                    "\n" +
                                    "Bổ sung ngay sản phẩm vào chu trình chăm sóc để có làn da sáng chuẩn Spa tại nhà.\n" +
                                    "\n" +
                                    "\n" +
                                    "\n" +
                                    "Kết Hợp Tắm - Tẩy - Dưỡng trong 1 lần tẩy da chết:\n" +
                                    "\n" +
                                    "Làm sạch thay sữa tắm: Loại bỏ bụi bẩn, bã nhờn trên bề mặt da, không cần tốn nhiều bước.\n" +
                                    "\n" +
                                    "Tẩy tế bào chết: Công thức đặc biệt kết hợp Bơ nghiền nguyên trái và hạt tẩy thiên nhiên nghiền mịn giúp loại bỏ tế bào chết nhẹ nhàng, cấp nước và siêu dưỡng ẩm, cho da mềm mướt, căng mịn.\n" +
                                    "\n" +
                                    "\n" +
                                    "\n" +
                                    "Dưỡng da sáng mịn: Vitamin C với công nghệ Niosome, hiệu quả sáng da gấp 10 lần (*).\n" +
                                    "\n" +
                                    "\n" +
                                    "\n" +
                                    "Giải pháp tẩy da chết hiệu quả cho:\n" +
                                    "\n" +
                                    "Da khô bong tróc, thiếu nước, thiếu ẩm. \n" +
                                    "\n" +
                                    "Da sần sùi, thô ráp, tích tụ nhiều da chết.",
                            category2, sub6
                    ),

                    new Product(
                            "Tẩy tế bào chết toàn thân sáng da B3 BRIGHTENING SCRUB Grace and Glow 220g",
                            "https://down-vn.img.susercontent.com/file/vn-11134207-7r98o-lzaawhsmbhcx92@resize_w900_nl.webp",
                            new BigDecimal("122000"),
                            "Tẩy tế bào chết toàn thân sáng da B3 BRIGHTENING SCRUB Grace and Glow 220g\n" +
                                    "\n" +
                                    "1. Tẩy tế bào chết toàn thân bằng texture đất sét có mùi hương nước hoa Black Opium\n" +
                                    "\n" +
                                    "2. Chứa AHA và Niacinamide\n" +
                                    "\n" +
                                    "3. Có chứa các hạt scrub dễ dàng lấy đi tế bào chết\n" +
                                    "\n" +
                                    "\n" +
                                    "\n" +
                                    "Công dụng:\n" +
                                    "\n" +
                                    "1. Làm sạch cơ thể\n" +
                                    "\n" +
                                    "2. Lấy đi tế bào da chết\n" +
                                    "\n" +
                                    "3. Làm sáng da\n" +
                                    "\n" +
                                    "\n" +
                                    "\n" +
                                    "CÁCH SỬ DỤNG\n" +
                                    "\n" +
                                    "Lấy một lượng sản phẩm vừa đủ lên da khô hoặc ẩm. Massage nhẹ nhàng theo chuyển động tròn, đợi cho đến khi khô một nửa rồi chà nhẹ cho đến khi bụi bẩn được loại bỏ. Rửa sạch bằng nước. \n" +
                                    "\n" +
                                    "\n" +
                                    "\n" +
                                    "THÀNH PHẦN CHÍNH\n" +
                                    "\n" +
                                    "1. AHA\n" +
                                    "\n" +
                                    "2. Niacinamide\n" +
                                    "\n" +
                                    "Thành phần:\n" +
                                    "\n" +
                                    "Nước, glycerin, dextrin, kaolin, caprylic/capric triglyceride, glyceryl stearate, niacinamide, propanediol, disteardimonium hectorite, CI 77891, PEG-100 stearate, glyceryl stearate, hương liệu, phenoxyethanol, triethanolamine, cellulose, methylparaben, niacinamide, ethylhexylglycerin, triethoxycaprylylsilane, alumina, axit glycolic, axit ascorbic, glutathione, CI 73360, CI 77007.\n" +
                                    "\n" +
                                    "\n" +
                                    "\n" +
                                    "Khối lượng tịnh: 220gr.",
                            category2, sub6
                    ),

                    //TINH DẦU THƯ GIẢN

                    new Product(
                            "Tinh chất làm dịu thuần chay cô đặc Beyond Angel Deep Moisture Calming Ampoule 50ml",
                            "https://down-vn.img.susercontent.com/file/vn-11134201-7ras8-m1o0ayqn361f81@resize_w900_nl.webp",
                            new BigDecimal("250000"),
                            "THÔNG TIN SẢN PHẨM\n" +
                                    "\n" +
                                    "Đặc điểm nổi bật và thành phần\n" +
                                    "\n" +
                                    "1. Dưỡng ẩm và làm dịu da\n" +
                                    "\n" +
                                    "- Tri-sap Complex TM: Phức hợp nhựa cây chiết xuất từ bạch dương + tre + nho giàu acid amin và khoáng chất. Giúp tăng cường hàng rào độ ẩm cho da\n" +
                                    "\n" +
                                    "- True Eco Complex TM: Phức hợp 3 thành phần hữu cơ 100% không th.u.ố.c t.r.ừ s.â.u ( trà xanh Hàn Quốc + lá neem Ấn Độ + thanh hoa hoa vàng USA) có hiệu quả gấp 3 lần panthenol. Giúp cấp ẩm, làm dịu da\n" +
                                    "\n" +
                                    "- 5 loại HA vegan: tạo màng ẩm bên ngoài và cấp ẩm bên trong ( micro)\n" +
                                    "\n" +
                                    "- Panthenol: tiền vitamin B5 hoạt động như chất dưỡng ẩm tự nhiên cũng có hàng rào bảo vệ da giúp bảo vệ độ ẩm và làm dịu da\n" +
                                    "\n" +
                                    "2. T/ă/n/g c/ư/ờ/n/g làm dịu da: Relief CICA Complex TM\n" +
                                    "\n" +
                                    "- Chiết xuất cây Nga Sâm từ đảo Ulleung HQ có hiệu quả làm dịu da m/ạ/n/h m/ẽ, dư/ỡ/ng ẩ/m và săn chắc\n" +
                                    "\n" +
                                    "- Madecassoside ( chiết xuất rau má/ cica) giúp gia tăng bảo vệ, thúc đẩy tổng hợp collagen, tăng đàn hồi. Đồng thời làm dịu da bị k/í/c/h ứ/n/g bởi các yếu tố có hại bên ngoài.",
                            category2, sub7
                    ),

                    new Product(
                            "Tinh chất dưỡng trắng da 9 Wishes Miracle White Ampule Serum 25ml",
                            "https://down-vn.img.susercontent.com/file/vn-11134207-7r98o-lwsavdppm28r60@resize_w900_nl.webp",
                            new BigDecimal("228000"),
                            "Tinh chất dưỡng trắng da 9 Wishes Miracle White Ampule Serum 25ml là một dạng tinh chất dưỡng trắng da cô đặc đến từ hãng mỹ phẩm 9 Wishes. Sản phẩm với kết cấu nhẹ, dễ dàng thấm sâu vào da, nuôi dưỡng, phục hồi làn da mệt mỏi, xạm đen vì nắng và các tia UV. Với thành phần gồm các thành phần mang lại hiệu quả cao như Glutathione, Niacinamide và Allantoin có khả năng làm giảm số lượng và cường độ của đốm đen trên da. Sản phẩm mang lại làn da mềm mại, đủ ẩm và trắng sáng dần từ bên trong.\n" +
                                    "\n" +
                                    "\n" +
                                    "\n" +
                                    "THÔNG TIN CHUNG:\n" +
                                    "\n" +
                                    "- Xuất xứ: Hàn Quốc\n" +
                                    "\n" +
                                    "- Nơi sản xuất: Hàn Quốc\n" +
                                    "\n" +
                                    "- Dung tích: 25ml\n" +
                                    "\n" +
                                    "- HSD: 3 năm kể tử ngày sản xuất\n" +
                                    "\n" +
                                    "- Ngày sản xuất: In trên bao bì sản phẩm.",
                            category2, sub7
                    ),

                    new Product(
                            "Tinh chất chăm sóc lỗ chân lông hoàn hảo CELLMAZING, 30ml, Ampoule",
                            "https://down-vn.img.susercontent.com/file/sg-11134207-7rbnl-m5sikwadzrgg4a@resize_w900_nl.webp",
                            new BigDecimal("440000"),
                            "CELLMAZING Pore Perfecting Ampoule 30ml\n" +
                                    "\n" +
                                    "Light and moisturizing ampoule formula that absorbs quickly into skin without stickiness\n" +
                                    "\n" +
                                    "Tinh chất chăm sóc lỗ chân lông hoàn hảo CELLMAZING Pore Perfecting 30ml\n" +
                                    "\n" +
                                    "\n" +
                                    "\n" +
                                    "\uD83C\uDF80 Đặc điểm chính\n" +
                                    "\n" +
                                    "\uD83E\uDD0D Thành phần chứa Collagen 5D + các gốc Peptide\n" +
                                    "\n" +
                                    "\uD83E\uDD0D Thu nhỏ lỗ chân lông\n" +
                                    "\n" +
                                    "\uD83E\uDD0D Chăm sóc bã nhờn sâu trong lỗ chân lông và tế bào da chết \n" +
                                    "\n" +
                                    "\uD83E\uDD0D Cải thiện độ đàn hồi da, bổ sung độ ẩm cho da\n" +
                                    "\n" +
                                    "\n" +
                                    "\n" +
                                    "\uD83C\uDF80 Dành cho da\n" +
                                    "\n" +
                                    "\uD83E\uDD0D Lỗ chân lông sâu và to, tế bào da chết, bã nhờn, da khô, da thiếu đàn hồi\n" +
                                    "\n" +
                                    "\n" +
                                    "\n" +
                                    "\uD83C\uDF80 Hiệu quả\n" +
                                    "\n" +
                                    "\uD83E\uDD0D Tinh chất giải quyết hiệu quả 8 vấn đề thường gặp của lỗ chân lông da chỉ sau 2 tuần sử dụng\n" +
                                    "\n" +
                                    "\uD83E\uDD0D Se khít lỗ chân lông\n" +
                                    "\n" +
                                    "\uD83E\uDD0D Dưỡng ẩm và thúc đẩy độ đàn hồi lỗ chân lông, làm đầy những lỗ chân lông có độ sâu lớn.\n" +
                                    "\n" +
                                    "\uD83E\uDD0D Kết cấu dịu nhẹ, nhẹ nhàng nên có thể dùng hàng ngày mà không bết dính da.\n" +
                                    "\n" +
                                    "\uD83C\uDF80 Hướng dẫn sử dụng\n" +
                                    "\n" +
                                    "1. Nhỏ vài giọt tinh chất lên mặt và thoa đều nhẹ nhàng.\n" +
                                    "\n" +
                                    "2. Vỗ nhẹ để tinh chất thẩm thấu đều vào da.\n" +
                                    "\n" +
                                    "\n" +
                                    "\n" +
                                    "\uD83D\uDD14 Đối với những vùng da có độ đàn hồi lỗ chân lông kém thì nên dùng tinh chất kết hợp với kem làm săn chắc da Collagen.\n" +
                                    "\n" +
                                    "\n" +
                                    "\n" +
                                    "\uD83C\uDF80 Thành phần\n" +
                                    "\n" +
                                    "Water, Butylene Glycol, Glycerin, Caprylic/Capric Triglyceride, Niacinamide, 1,2-Hexanediol, Cetearyl Olivate, Cetyl Ethylhexanoate, Collagen Extract, Soluble Collagen, Collagen Amino Acids, Collagen, Hydrolyzed Collagen, Hexapeptide-2, Panthenol, Allantoin, Hydrolyzed Hyaluronic Acid, Sodium Hyaluronate, Hydroxyethyl Acrylate/Sodium Acryloyldimethyl Taurate Copolymer, Sodium Hyaluronate Crosspolymer, Potassium Hyaluronate, Hydroxypropyltrimonium Hyaluronate, Hyaluronic Acid, Sodium Acetylated Hyaluronate, Heptyl Undecylenate, Glyceryl Stearate, C10-18 Triglycerides, Acrylates/C10-30 Alkyl Acrylate Crosspolymer, Valine, Threonine, Proline, Isoleucine, Histidine, Methionine, Cysteine, Biotin, Pentylene Glycol, Glycine, Serine, Glutamic Acid, Aspartic Acid, Leucine, Alanine, Lysine, Arginine, Tyrosine, Phenylalanine, Adenosine, Sorbitan Olivate, Sorbitan Isostearate, Cetearyl Alcohol, Vinyl Dimethicone, Tromethamine, Glyceryl Acrylate/Acrylic Acid Copolymer, PVM/MA Copolymer, Xanthan Gum, Disodium EDTA, Ethylhexylglycerin\n" +
                                    "\n" +
                                    "- BAO BÌ BỀN VỮNG: Thân thiện với môi trường\n" +
                                    "\n" +
                                    "- CÔNG THỨC SẠCH: Chứng nhận Thuần chay \n" +
                                    "\n" +
                                    "- BẢO VỆ ĐỘNG VẬT: Không thử nghiệm trên động vật.",
                            category2, sub7
                    ),

                    new Product(
                            "DRCEUTICS Tinh Chất B5 Basic Hydration 5% DrCeutics Cho Da Dầu Mụn (30ml)",
                            "https://down-vn.img.susercontent.com/file/vn-11134207-7qukw-ljxod1bbhvw4f9@resize_w900_nl.webp",
                            new BigDecimal("133000"),
                            "• Thương hiệu: Dr Ceutics\n" +
                                    "\n" +
                                    "• Xuất xứ: Việt Nam\n" +
                                    "\n" +
                                    "• Dung tích: 30g, 100g, 150g\n" +
                                    "\n" +
                                    "Serum B5 Basic Hydration DrCeutics là tinh chất cấp ẩm có kết cấu mỏng nhẹ, khô thoáng và nhanh ráo trên da.\n" +
                                    "\n" +
                                    " \n" +
                                    "\n" +
                                    "CÔNG DỤNG:\n" +
                                    "\n" +
                                    "- Với Calcium Pantothenate 5% cung cấp độ ẩm và phục hồi da tối đa. \n" +
                                    "\n" +
                                    "- Làm dịu da, cấp ẩm.\n" +
                                    "\n" +
                                    "- Hỗ trợ quá trình chữa lành làn da mụn.\n" +
                                    "\n" +
                                    "- Tinh chất serum nhanh thấm, khô ráo không gây bí da.\n" +
                                    "\n" +
                                    " \n" +
                                    "\n" +
                                    "CÁCH SỬ DỤNG:\n" +
                                    "\n" +
                                    "- Làm sạch da với sữa rửa mặt\n" +
                                    "\n" +
                                    "- Cho Serum B5 Basic Hydration DrCeutics ra tay hoặc trực tiếp lên da mặt, mát xa nhẹ nhàng và vỗ nhẹ để tinh chất thấm nhanh vào da\n" +
                                    "\n" +
                                    "- Có thể sử dụng ngày 2 lần sáng và tối\n" +
                                    "\n" +
                                    "\n" +
                                    "\n" +
                                    "Hạn sử dụng: 3 năm từ ngày sản xuất (in trên hộp sản phẩm).",
                            category2, sub7
                    ),

                    new Product(
                            "Tinh Chất Chống Lão Hóa Dr. Pepti Exo Biome Ampoule 50ml",
                            "https://down-vn.img.susercontent.com/file/vn-11134207-7ras8-m5s0q48skegmf4@resize_w900_nl.webp",
                            new BigDecimal("390000"),
                            "1/ THÔNG TIN THƯƠNG HIỆU\n" +
                                    "\n" +
                                    "DR.PEPTI là thương hiệu mỹ phẩm chăm sóc da nổi tiếng đến từ Hàn Quốc, nổi tiếng với các dòng sản phẩm làm đẹp chứa PEPTIDE - nguyên liệu “vàng” trong quá trình giúp da trẻ hóa, chống lão hoá hàng đầu thế giới. Nhờ tác dụng nhanh chóng nhưng lành tính của thành phần này, các sản phẩm của DR.PEPTI được ưu tiên sử dụng trong nhiều liệu trình chăm sóc da chống lão hóa tại các spa Hàn Quốc.\n" +
                                    "\n" +
                                    "\n" +
                                    "\n" +
                                    "2. THÔNG TIN SẢN PHẨM\n" +
                                    "\n" +
                                    "2.1 Thông tin sản phẩm:\n" +
                                    "\n" +
                                    "Dr. Pepti Exo Biome Ampoule là một sản phẩm chăm sóc da tiên tiến, được thiết kế để cung cấp giải pháp chuyên sâu cho việc cân bằng da và tái tạo tế bào, giúp mang lại làn da trẻ trung, mềm mại và sáng bóng.\n" +
                                    "\n" +
                                    "\n" +
                                    "\n" +
                                    "2.2 Công dụng:\n" +
                                    "\n" +
                                    "Bảo vệ làn da khỏi môi trường bên ngoài và duy trì sự cân bằng cho làn da với công nghệ Exo-liposome.\n" +
                                    "\n" +
                                    "Phục hồi kết cấu và cải thiện tone da, giúp gương mặt trở nên trắng và đều màu.\n" +
                                    "\n" +
                                    "Với 2 loại peptide giúp da mịn màng và săn chắc tạo nên làn da khỏe mạnh, săn chắc.\n" +
                                    "\n" +
                                    "Kết cấu ampoule dạng sợi, giúp tinh chất thẩm thấu vào sâu bên trong tốt nhất.\n" +
                                    "\n" +
                                    "\n" +
                                    "\n" +
                                    "Thành phần:\n" +
                                    "\n" +
                                    "Peptide Cao Cấp: Sự hiện diện của peptide trong ampoule giúp kích thích sự sản xuất collagen và elastin, giúp da trở nên đàn hồi hơn và giảm nếp nhăn.\n" +
                                    "\n" +
                                    "Exo Biome Complex: Một hỗn hợp độc đáo của các vi khuẩn có lợi (probiotics) và các chất chống oxy hóa mạnh mẽ, giúp cân bằng sinh học cho da, hỗ trợ quá trình tái tạo tế bào và ngăn chặn tác động của tác nhân môi trường.\n" +
                                    "\n" +
                                    "Hyaluronic Acid: Làm dịu và dưỡng ẩm sâu, giúp da trở nên mềm mại, đàn hồi và giữ nước cho làn da khỏe mạnh.\n" +
                                    "\n" +
                                    "Glycerin: Là một chất dưỡng ẩm hiệu quả, giúp giữ nước cho da và làm cho da trở nên mềm mại và đàn hồi.\n" +
                                    "\n" +
                                    "Butylene Glycol: Là một chất làm ẩm và dung môi, giúp sản phẩm thấm sâu vào da.\n" +
                                    "\n" +
                                    "Glycereth-26: Một dạng được biến đổi của glycerin, có chức năng giữ nước cho da và làm dịu da.\n" +
                                    "\n" +
                                    "Niacinamide: Còn được gọi là vitamin B3, niacinamide có nhiều lợi ích cho da, bao gồm cải thiện sự đồng đều màu da, giảm mụn và làm giảm nếp nhăn.\n" +
                                    "\n" +
                                    "\n" +
                                    "\n" +
                                    "3/ HƯỚNG DẪN SỬ DỤNG\n" +
                                    "\n" +
                                    "Sử dụng sản phẩm sau khi tẩy trang, rửa mặt và toner.\n" +
                                    "\n" +
                                    "Lấy một lượng sản phẩm vừa đủ thoa lên toàn bộ gương mặt, massage nhẹ nhàng để tinh chất thẩm thấu.\n" +
                                    "\n" +
                                    "\n" +
                                    "\n" +
                                    "4/ BẢO QUẢN\n" +
                                    "\n" +
                                    "- Đậy nắp kĩ ngay sau khi sử dụng.\n" +
                                    "\n" +
                                    "- Bảo quản nơi khô ráo, thoáng mát. Tránh ánh nắng trực tiếp.\n" +
                                    "\n" +
                                    "- Để xa tầm tay trẻ em.",
                            category2, sub7
                    ),

                    new Product(
                            "Tinh chất Travel Size Skin1004 Madagascar Centella Tone Brightening Capsule Ampoule 30ml",
                            "https://down-vn.img.susercontent.com/file/vn-11134207-7r98o-ll3dtcxqg6h4ff@resize_w900_nl.webp",
                            new BigDecimal("126000"),
                            "Thương hiệu : Skin1004\n" +
                                    "\n" +
                                    "Xuất xứ : Hàn Quốc\n" +
                                    "\n" +
                                    "Dung tích : 30ml\n" +
                                    "\n" +
                                    "Ngày Sản Xuất: xem trên bao bì sản phẩm\n" +
                                    "\n" +
                                    "HSD: xem trên bao bì sản phẩm\n" +
                                    "\n" +
                                    "1) Tinh chất làm sáng da chuyên sâu\n" +
                                    "\n" +
                                    "  - Niacin Amide 4% (thành phần làm sáng da) + Tranexamic Acid 2%(làm đều màu và nâng tông da) + 3-O-Ethyl Ascorbic Acid(Dẫn xuất Vitamin C có tính ổn định cao)\n" +
                                    "\n" +
                                    "  - Tinh chất được nâng cấp với sự kết hợp của 3 thành phần làm sáng da\n" +
                                    "\n" +
                                    "  - Cải thiện làn da không đều màu, mờ các vết thâm do mụn\n" +
                                    "\n" +
                                    "\n" +
                                    "\n" +
                                    "2) MadeWhite, thành phần làm sáng da từ rau má Madagascar\n" +
                                    "\n" +
                                    "  - MadeWhite, thành phần làm sáng da có chứa Madecassoside từ rau má Madagascar\n" +
                                    "\n" +
                                    "  - Lượng Madewhite cao 20.000ppm được bào chế dưới dạng hạt để có độ ổn định và hiệu quả cao\n" +
                                    "\n" +
                                    "  - Có thể sử dụng cả ngày và đêm cho da nhạy cảm do loại Vitamin C có tính độ ổn định cao so với các thành phần làm sáng hiện có trên thị trường\n" +
                                    "\n" +
                                    "\n" +
                                    "\n" +
                                    "3) Chức năng làm sáng da và dịu da mạnh mẽ\n" +
                                    "\n" +
                                    "  - Với sản phẩm có chức năng làm sáng hiệu quả cao, chiết xuất rau má được tăng lên đến 90% để tăng cường khả năng chăm sóc và làm dịu da từ sâu bên trong\n" +
                                    "\n" +
                                    "  - Phục hồi da bằng cách làm dịu và củng cố hàng rào bảo vệ da\n" +
                                    "\n" +
                                    "\n" +
                                    "\n" +
                                    "4) Công thức tinh chất dưỡng ẩm không gây bết dính\n" +
                                    "\n" +
                                    " - Tinh chất dạng lỏng chứa các hạt làm trắng MadeWhite\n" +
                                    "\n" +
                                    " - Cho phép thoa nhiều lớp trên da mà không gây bết dính\n" +
                                    "\n" +
                                    " - Tinh chất dạng lỏng tươi mát, dưỡng ẩm sâu, không gây cảm giác khô căng sau khi sử dụng\n" +
                                    "\n" +
                                    "\n" +
                                    "\n" +
                                    "5) Không chất tạo màu, tạo mùi\n" +
                                    "\n" +
                                    "  - Công thức không sử dụng chất tạo mùi và chất tạo màu để tránh gây kích ứng da.",
                            category2, sub7
                    ),

                    new Product(
                            "Tinh Chất Làm Sáng Da, Mờ Đốm Nâu LEVEL UP 10 Days Dark-Spots Intelligence - Losionerie",
                            "https://down-vn.img.susercontent.com/file/vn-11134207-7r98o-lytk0ar6y5k189@resize_w900_nl.webp",
                            new BigDecimal("52000"),
                            "Tinh Chất Làm Sáng Da, Mờ Đốm Nâu LEVEL UP 10 Days Dark-Spots Intelligence\n" +
                                    "\n" +
                                    "==== +1 Intelligence cho làn da của bạn ====\n" +
                                    "\n" +
                                    "\n" +
                                    "\n" +
                                    "Dưỡng sáng và cải thiện đốm nâu trên da trong 10 ngày với bộ đôi thành phần từ Albatin & Alplha Arbutin, kết hợp Vitamin C với nồng độ an toàn cho da, không gây kích ứng và dễ bảo quản.\n" +
                                    "\n" +
                                    "Tự tin trải nghiệm làn da tươi sáng, rạng rỡ và đều màu hơn trông thấy chỉ sau 2 tuần sử dụng.\n" +
                                    "\n" +
                                    "\n" +
                                    "\n" +
                                    "Thông tin thành phần:\n" +
                                    "\n" +
                                    "Công thức dưỡng sáng, mờ thâm ưu việt từ bộ đôi siêu thành phần Albatin & Alplha Arbutin được thực nghiệm lâm sàng mạnh mẽ:\n" +
                                    "\n" +
                                    "- Albatin: làm mờ các vết nám, đốm nâu, tàn nhang trên da mặt bằng cách phân tán hắc sắc tố\n" +
                                    "\n" +
                                    "- Alpha Arbutin: giúp ngăn ngừa sự hình thành đốm đen cho làn da luôn đều màu\n" +
                                    "\n" +
                                    "- Vitamin C (3-O-Ethyl Ascorbic Acid): hỗ trợ làm sáng & đều màu da\n" +
                                    "\n" +
                                    "- Hi-clera & Pentavitin: tăng cường dưỡng ẩm làn da hiệu quả.",
                            category2, sub7
                    ),

                    new Product(
                            "Tinh dầu ngăn ngừa và làm giảm mụn, sưng tấy Naruko trà tràm Tea Tree Purifying Essential Oil 10ml (Bản Đài)",
                            "https://down-vn.img.susercontent.com/file/e3fdf59d707eb8f15fcf0eb925ae55c0@resize_w900_nl.webp",
                            new BigDecimal("225000"),
                            "Naruko – Trà tràm – Tinh dầu\n" +
                                    "Tác dụng chính: giảm mụn, giúp da sạch dầu\n" +
                                    "\n" +
                                    "Công dụng: Tinh dầu trà tràm Naruko có tác dụng giảm sự sinh trưởng của mụn; cải thiện các vấn đề mụn xuất hiện trên da; làm sạch dầu trên các lỗ chân lông, giảm thiểu tổi đa khả năng mọc mụn; duy trì, cân bằng lượng dầu ổn định trên da; tái tạo làm mới da; giúp lỗ chân lông luôn thông thoáng.\n" +
                                    "\n" +
                                    "Thời hạn sử dụng: 3 năm kể từ ngày sản xuất\n" +
                                    "\n" +
                                    "Lưu ý: Sản phẩm không khuyến khích sử dụng ở vùng mắt và miệng, đề nghị quý khách lưu ý. Nếu không may đang sử dụng, sản phẩm bị dính vào mắt, đề nghị dùng một lượng lớn nước rửa thật sạch. Nếu như da bạn có hiện tượng dị ứng, nổi ngứa, lên mẩn đỏ… lập tức dừng sử dụng ngay. Khách hàng cũng nên hỏi ý kiến bác sỹ để nhận được lời khuyên hữu ích. Sản phẩm không được phép ăn. Đề nghị để xa tầm tay trẻ em, tránh các trường hợp không mong muốn xảy ra. Sản phẩm không sử dụng cho trẻ em dưới 3 tuổi.\n" +
                                    "\n" +
                                    "NSX – HSD: Xem trên bao bì\n" +
                                    "\n" +
                                    "Sản xuất bởi:  Công ty Beauty Essentials Limited, Taiwan Branch\n" +
                                    "\n" +
                                    "Xuất xứ : Đài Loan\n" +
                                    "\n" +
                                    "Sản phẩm phù hợp với: Tất cả mọi loại da, đặc biệt khuyên dùng trên các làn da dầu, da có lỗ chân lông to, thô, da bị mụn trứng cá, hoặc da dễ nổi mụn\n" +
                                    "\n" +
                                    "Hướng dẫn sử dụng:\n" +
                                    " Sau khi rửa mặt sạch và thực hiện các bước dưỡng da cơ bản, lấy sản phẩm bôi trực tiếp lên vùng da bị mụn, sử dụng kèm các sản phẩm khác trong bộ sản phẩm để đạt hiệu quả tốt hơn.\n" +
                                    "\n" +
                                    "Thương hiệu: Naruko   \n" +
                                    "Dung tích: 10ml\n" +
                                    "\n" +
                                    "Bao bì thay đổi theo từng đợt nhập hàng.\n" +
                                    "\n" +
                                    "*Sản phẩm không phải là thuốc.",
                            category2, sub7
                    ),

                    //DƯỠNG THỂ TRẮNG DA

                    new Product(
                            "Sữa Dưỡng Thể Sáng Da Dưỡng Ẩm Ngăn Ngừa Lão Hoá Cỏ Mềm 150ml",
                            "https://down-vn.img.susercontent.com/file/vn-11134207-7ras8-m31rbme8xjga81@resize_w900_nl.webp",
                            new BigDecimal("165000"),
                            "*** CÔNG DỤNG: \n" +
                                    "\n" +
                                    "-\tSữa dưỡng da toàn thân;\n" +
                                    "\n" +
                                    "-\t Giúp dưỡng ẩm da, làm mềm da, dưỡng sáng da, cho làn da mềm mịn, đều màu và tươi sáng hơn. Góp phần ngăn ngừa lão hóa da.\n" +
                                    "\n" +
                                    "-\tMềm mịn da. Dưỡng cả tay và nail. Sáng da dần lên, hiệu quả sau 4 tuần sử dụng\n" +
                                    "\n" +
                                    "-\tKhông gây mụn, không bít tắc lỗ chân lông. Không gây rậm lông\n" +
                                    "\n" +
                                    "--------------------\n" +
                                    "\n" +
                                    "***THÀNH PHẦN: Purified water (Nước tinh khiết), Glycerin, Niacinamide, Arachidyl Alcohol (and) Behenyl Alcohol (and) Arachidyl Glucoside, Hydrogenated Ethylhexyl Olivate (and) Hydrogenated Olive Oil Unsaponifiables, Caprylic/Capric Triglyceride, Helianthus Annuus (Sunflower) Seed Oil (Dầu Hướng dương), Butyrospermum parkii butter (Bơ Hạt mỡ) , Oryza sativa bran oil (Dầu Cám gạo), Sclerocarya Birrea Seed Oil (and) Tetradecane, Polyglyceryl-3 Distearate and Glyceryl Stearate Citrate, Hydroxyethyl Acrylate/Sodium Acryloyldimethyl Taurate Copolymer, Acrylates/C10-30 Alkyl Acrylate Crosspolymer, Benzyl alcohol (and) Ethylhexylglycerin (and) Tocopherol, Fragrance.",
                            category2, sub8
                    ),

                    new Product(
                            "Dưỡng Thể Olay B3 + Retinol, Olay Bright Ultra Whitening Bản Mới Nhất",
                            "https://down-vn.img.susercontent.com/file/vn-11134207-7r98o-luj27xpt1bmt84@resize_w900_nl.webp",
                            new BigDecimal("100000"),
                            "Cùng với  dòng Olay Retinol nổi đình nổi đám thì nay em Olay Super Bright B3 Ultra Whitening + Vitamin C thế hệ mới nhất chuyên sâu về phục hồi và làm trắng da x3 hiệu quả đã sẵn hàng để phục vụ các khách yêu.\n" +
                                    "\n" +
                                    "\n" +
                                    "\n" +
                                    " Ngoài thành phần B3 là thành phần dưỡng trắng nổi tiếng quá quen thuộc rồi, nay lại thêm Vitamin C nồng đô cao kết hợp sẽ nâng hiệu quả thẩm thấu, phát huy tác dụng triệt để. \n" +
                                    "\n" +
                                    "\n" +
                                    "\n" +
                                    "Theo thông tin từ hãng thì dòng này là dòng Whitening đã được cải tiến nên khả năng dưỡng trắng được đánh giá là nhanh hơn so với dòng Olay Retinol vốn đã được review rất nhiều. Và hiện thì Dòng này là dòng được các Chị em xứ Trung ưa chuộng hơn nhiều. Lượt mua và đánh giá về khả năng dưỡng trắng cao gấp 1.5 lần so với Dòng Olay Retinol.\n" +
                                    "\n" +
                                    "\n" +
                                    "\n" +
                                    "Điều đặc biệt là do là sản phẩm mới nên giá thành hiện vẫn đang còn mềm mại hơn nhiều thế nên nếu bạn kì vọng vào một sản phẩm có tác dụng nhanh hơn giá cả tốt hơn thì không thể bỏ qua dòng sản phẩm này nhé.\n" +
                                    "\n" +
                                    "THÀNH PHẦN VÀ CÔNG DỤNG\n" +
                                    "\n" +
                                    "-Chứa 5% Ninacinamide giúp da đều màu, ngừa thâm, giảm tác động của tia UV\n" +
                                    "\n" +
                                    "\n" +
                                    "\n" +
                                    "-Vitamin C hàm lượng cao với công nghệ mới giúp dưỡng trắng vượt bậc\n" +
                                    "\n" +
                                    "\n" +
                                    "\n" +
                                    "-Inositol 1 dạng của vitamin B8 có hiệu quả làm trắng da\n" +
                                    "\n" +
                                    "\n" +
                                    "\n" +
                                    "-Kết cấu kem olay nhanh thấm không gây bết dính da\n" +
                                    "\n" +
                                    "\n" +
                                    "\n" +
                                    "-Mùi thơm Vani Đào nhẹ nhàng không gây khó chịu khi sử dụng\n" +
                                    "\n" +
                                    "\n" +
                                    "\n" +
                                    "-Công thức collagen thúc đẩy tăng trưởng tự phát giúp da săn chắc\n" +
                                    "\n" +
                                    "HƯỚNG DẪN SỬ DỤNG:\n" +
                                    "\n" +
                                    "\n" +
                                    "\n" +
                                    "- Bước 1 : Làm sạch da với sữa tắm rồi sau đó lau khô bằng khăn sạch.\n" +
                                    "\n" +
                                    "\n" +
                                    "\n" +
                                    "- Bước 2 : Lấy một lượng sữa dưỡng thể olay b3  thể đủ dùng vào bàn tay . \n" +
                                    "\n" +
                                    "\n" +
                                    "\n" +
                                    "- Bước 3 : Xoa hai lòng tay vào với nhau trong vài giây để làm ấm, từ đó giúp tinh chất có trong sản phẩm thẩm thấu vào da tốt hơn.\n" +
                                    "\n" +
                                    "\n" +
                                    "\n" +
                                    "- Bước 4 : Thoa phần sữa dưỡng lên da đồng thời kết hợp với massage nhẹ nhàng trong vài phút.\n" +
                                    "\n" +
                                    "LƯU Ý:\n" +
                                    "- Sản phẩm có chứa hàm lượng B3+ (Niacinamide) cao hơn dòng cũ, có thể gây kích ứng đối với da nhạy cảm vì vậy nếu bạn chưa sử dụng thì nên mua tuýp nhỏ dùng thử trước.\n" +
                                    "\n" +
                                    "\n" +
                                    "\n" +
                                    "- Da sẽ trắng lên sau khoảng 14-28 ngày sử dụng đều đặn.\n" +
                                    "\n" +
                                    "\n" +
                                    "\n" +
                                    "- Sản phẩm không nuôi lông (tùy cơ địa nhưng % có nuôi lông không cao)\n" +
                                    "\n" +
                                    "\n" +
                                    "\n" +
                                    "- Nếu bạn làm việc văn phòng, không thường xuyên tiếp xúc với ánh nắng mặt trời thì chỉ cần che chắn khi ra ngoài, nếu bạn vận động làm việc ngoài trời và tiếp xúc nhiều với ánh nắng thì nên sử dụng kem chống nắng cho body để đạt hiệu quả dưỡng trắng tốt nhất.",
                            category2, sub8
                    ),

                    new Product(
                            "Sữa Dưỡng Thể Alpha Arbutin 3Plus + Collagen Tosowoong 500ml",
                            "https://down-vn.img.susercontent.com/file/vn-11134207-7ras8-m4a8qvjgab8wb5@resize_w900_nl.webp",
                            new BigDecimal("138000"),
                            "Dưỡng Trắng Da Alpha Arbutin Collagen Lotion 3++ 500ml với khả năng kích trắng dưỡng trắng da cao trên thị trường hiện nay, đồng thời mang lại cho khách hàng một làn da đẹp mịn màng trắng sáng hơn mỗi ngày, cho hiệu quả sử dụng vượt trội, với cấu trúc dịu nhẹ và hoàn toàn ko gây bết.\n" +
                                    "\n" +
                                    "Xuất xứ : Thái Lan\n" +
                                    "\n" +
                                    "Hạn sử dụng : 36 tháng\n" +
                                    "\n" +
                                    "\n" +
                                    "\n" +
                                    "- Thành phần chính (Ingredients): Alpha Arbutin , Glycerin , Dầu Khoáng , Stearic Acid, Collagen \n" +
                                    "\n" +
                                    "AQUA, MINERAL OIL. NIACINAMIDE, GLYCERINE, STEARIC ACID, CETYL ALCOHOL, PERSEA GRATISSIMA OIL, POLYSORBATE 60.PHENOXYETHANOL, ARBUTIN, BUTYROSPERMUM PARKII (SHEA BUTTER), HYDROLYZED COLLAGEN, PERFUME, METHYLPARABEN, PROPYLPARABEN, CARBOMER, TRIETHANOLAMINE. XANTHAN GUM\n" +
                                    "\n" +
                                    "\n" +
                                    "\n" +
                                    "CÁCH THỨC HOẠT ĐỘNG \n" +
                                    "\n" +
                                    "- Alpha Arbutin Body Cream chứa các hoạt chất Alpha Arbutin và Glutathione là hoạt chất dưỡng trắng hiệu quả và an toàn thông qua cơ chế ức chế quá trình chuyển hoá Tyrosine thành Melanocyte - chính là các hắc sắc tố khiến cho làn da bị sạm, nám, đồi mồi.\n" +
                                    "\n" +
                                    "\n" +
                                    "\n" +
                                    "- Dưỡng trắng bên trong và bảo vệ da bên ngoài là nguyên tắc vàng để sở hữu một làn da mịn màng.\n" +
                                    "\n" +
                                    "Do đó, Alpha Arbutin Collagen Lotion 3 Plus tăng cường các thành phần chống nắng giúp bảo vệ da từ bên ngoài, ngăn chặn các tia UVA và UVB tác động lên da.\n" +
                                    "\n" +
                                    "------------------------------------------\n" +
                                    "\n" +
                                    "II. Công Dụng Sản Phẩm\n" +
                                    "\n" +
                                    "- Dưỡng trắng da bằng cơ chế ức chế quá trình chuyển hoá Tyrosine thành Melanin.\n" +
                                    "\n" +
                                    "-  Tăng sự đàn hồi, ngăn ngừa, cải thiện lão hoá da.\n" +
                                    "\n" +
                                    "- Tạo lớp màng ngăn ngừa các gốc tự do phá hoại cho làn da.\n" +
                                    "\n" +
                                    "-  Ngăn chặn các tia UVA và UVB\n" +
                                    "\n" +
                                    "------------------------------------------\n" +
                                    "\n" +
                                    "III. Hướng Dẫn Sử Dụng:\n" +
                                    "\n" +
                                    "- Thoa kem 2 ngày 1 lần sáng và tối sau khi tắm\n" +
                                    "\n" +
                                    "- Có thể mix cùng viên kích trắng để tăng khả năng làm trắng da (3 viên kích trắng + 500ml dưỡng thể)\n" +
                                    "\n" +
                                    "* Lưu ý: Tùy theo cơ địa mỗi người mà dẫn đến tác dụng sản phẩm khác nhau.\n" +
                                    "\n" +
                                    "------------------------------------------\n" +
                                    "\n" +
                                    "CHÍNH SÁCH BẢO HÀNH - ĐỔI TRẢ\n" +
                                    "\n" +
                                    "- Cam kết 100% sản phẩm là hàng chính hãng\n" +
                                    "\n" +
                                    "- Đội ngũ tư vấn viên nhiệt tình, hỗ trợ giải đáp thắc mắc trong thời gian ngắn nhất\n" +
                                    "\n" +
                                    "- Hỗ trợ đổi trả theo quy định của Shopee với điều kiện:\n" +
                                    "\n" +
                                    "+ Hàng vẫn còn mới, chưa qua sử dụng\n" +
                                    "\n" +
                                    "+ Hàng bị lỗi hoặc hư hỏng do vận chuyển hoặc do nhà sản xuất\n" +
                                    "\n" +
                                    "+ Có video quay lại quá trình mở hộp và kiểm tra từng sản phẩm. Video rõ ràng, thấy được gói hàng còn nguyên vẹn, còn niêm phong.\n" +
                                    "\n" +
                                    "• Lưu ý: Nếu thiếu một trong các điều kiện trên, shop từ chối giải quyết khiếu nại. Thời gian khiếu nại tối đa 7 ngày từ lúc nhận được hàng.\n" +
                                    "\n" +
                                    "------------------------------------------\n" +
                                    "\n" +
                                    "CẢM ƠN BẠN ĐÃ LỰA CHỌN VÀ TIN DÙNG SẢN PHẨM CỦA SHOP!\n" +
                                    "\n" +
                                    "FOLLOW NGAY ĐỂ KHÔNG BỎ LỠ BẤT KÌ ƯU ĐÃI NÀO CỦA SHOP NHÉ!\n" +
                                    "\n" +
                                    "CHÚC BẠN CÓ NHỮNG GIÂY PHÚT MUA  SẮM VUI VẺ!\n" +
                                    "\n" +
                                    "------------------------------------------",
                            category2, sub8
                    ),

                    new Product(
                            "Sữa Dưỡng Thể Lotion Thuần Chay MUSEDAY Dưỡng Sáng, Mềm Mịn, Trắng Da, Chống Nắng Size 50 ml, 200ml",
                            "https://down-vn.img.susercontent.com/file/vn-11134207-7ras8-m4y9684puiqf94@resize_w900_nl.webp",
                            new BigDecimal("70000"),
                            "Cây cỏ sữa được biết đến là 1 loại nguyên liệu dưỡng da vô cùng hiệu quả ở vùng Tây Bắc. Cỏ sữa chứa hoạt chất có khả năng hạn chế quá trình tổng hợp sắc tố melanin, giúp da trở nên trắng sáng, đều màu. Theo đó, với công thức cải tiến 4in1 , Museday mang đến sản phẩm sữa dưỡng thể/ lotion giúp làm sáng da ngay tức thì, đồng thời dưỡng trắng sâu từ bên trong sau 28 ngày sử dụng. Ngoài khả năng cấp ẩm sâu, với chỉ số chống nắng SPF 50 và PA++++, sản phẩm cung cấp sự bảo vệ toàn diện cho da.\n" +
                                    "\n" +
                                    "\n" +
                                    "\n" +
                                    "Thành phần: Aqua, Glycerin, Cyclopentasiloxane, Persea Gratissima (Avocado) Oil, Panthenol, Niaciamide, Arbutin, Aloe Vera Callus Extract, Euphorbia thymifolia Linn Extract, Licorice Root Extract, Morus Alba Root (Mulberry) Extract, Terephthalylidene Dicamphor Sulfonic Acid, Titanium Dioxide, Zinc Dioxide, Polyacrylate Crosspolymer-6, Isoamyl Laurate, Isoamyl Cocoate, Tocophenol, Phenoxyethanol, Ethylhexylglycerin, Allatoin.\n" +
                                    "\n" +
                                    "\n" +
                                    "\n" +
                                    "Công dụng:\n" +
                                    "\n" +
                                    "- Make up, bật tone da tức thì\n" +
                                    "\n" +
                                    "- Hỗ trợ dưỡng trắng chuyên sau 28 ngày\n" +
                                    "\n" +
                                    "- Cung cấp độ ẩm\n" +
                                    "\n" +
                                    "- Chống nắng & bảo vệ da dưới ánh nắng mặt trời\n" +
                                    "\n" +
                                    "\n" +
                                    "\n" +
                                    "Hướng dẫn sử dụng: \n" +
                                    "\n" +
                                    "Lấy 1 lượng kem vừa đủ thoa đều trực tiếp lên toàn thân. Sử dụng đều mỗi ngày cho kết quả tốt nhất. Không nên tiếp xúc quá lâu với ánh nắng mặt trời ngay cả khi đã sử dụng sản phẩm.\n" +
                                    "\n" +
                                    "Sản phẩm phù hợp với loại da thường, da dầu, da hỗn hợp\n" +
                                    "\n" +
                                    "\n" +
                                    "\n" +
                                    "Chú ý: Sử dụng ngoài da, tránh tiếp xúc trực tiếp với mắt, tránh xa tầm tay trẻ em.\n" +
                                    "\n" +
                                    "\n" +
                                    "\n" +
                                    "Bảo quản: Để nơi khô ráo thoáng mát, tránh ánh nắng trực tiếp và nhiệt độ cao.\n" +
                                    "\n" +
                                    "\n" +
                                    "\n" +
                                    "NSX/ Số lô sản xuất: Xem trên bao bì \n" +
                                    "\n" +
                                    "Hạn sử dụng: 3 năm\n" +
                                    "\n" +
                                    "Dung tích: 50ml, 200ml \n" +
                                    "\n" +
                                    "\n" +
                                    "\n" +
                                    "Xuất xứ: Việt Nam.",
                            category2, sub8
                    ),

                    new Product(
                            "Sữa dưỡng thể sáng da Grace and Glow Black Opium Bright & Glow Body Serum 300ml",
                            "https://down-vn.img.susercontent.com/file/vn-11134207-7r98o-ll31w2hmjvtp83@resize_w900_nl.webp",
                            new BigDecimal("99000"),
                            "Sữa dưỡng thể hương nước hoa sáng da Black Opium Ultra Bright & Glow Solution Body Serum 300ML\n" +
                                    "\n" +
                                    "Sữa dưỡng thể có hương thơm từ nước hoa cao cấp Black Opium. Được bào chế như một loại serum cho body với Niacinamide có tác dụng chống oxy hóa cao như một tác nhân làm sáng, giữ ẩm cho da và Galactomyces giàu vitamin, axit amin giúp tăng cường, làm sáng và làm mịn da. Cho một làn da trắng sáng và khoẻ mạnh.\n" +
                                    "\n" +
                                    "\n" +
                                    "\n" +
                                    "Thành phần chính:\n" +
                                    "\n" +
                                    "1、Niacinamide\n" +
                                    "\n" +
                                    "Chống oxy hóa \n" +
                                    "\n" +
                                    "Làm sáng đều màu da\n" +
                                    "\n" +
                                    "Giữ cho làn da luôn ẩm mướt\n" +
                                    "\n" +
                                    "Tăng sắc tố giúp làm sáng da\n" +
                                    "\n" +
                                    "\n" +
                                    "\n" +
                                    "2、Galactomyces\n" +
                                    "\n" +
                                    "Giàu các vitamin và axit amin\n" +
                                    "\n" +
                                    "Tăng cường hàng rào bảo vệ da\n" +
                                    "\n" +
                                    "Làm sáng da toàn thân\n" +
                                    "\n" +
                                    "Giúp da mềm mượt hơn\n" +
                                    "\n" +
                                    "\n" +
                                    "\n" +
                                    "Công dụng:\n" +
                                    "\n" +
                                    "- Làm sáng da\n" +
                                    "\n" +
                                    "- Dưỡng ẩm \n" +
                                    "\n" +
                                    "- Tăng độ đàn hồi cho làn da\n" +
                                    "\n" +
                                    "- Lưu hương thơm nước hoa trên cơ thể đến 3-4 tiếng.\n" +
                                    "\n" +
                                    "\n" +
                                    "\n" +
                                    "Cách sử dụng: Lấy sữa dưỡng thể ra tay, nhẹ nhàng thoa đều khắp cơ thể để dưỡng chất thẩm thấu.\n" +
                                    "\n" +
                                    "Sử dụng ngày 2 lần, vào buổi sáng và buổi tối trước khi đi ngủ.\n" +
                                    "\n" +
                                    "Sản phẩm phát huy công dụng tốt nhất khi kết hợp với sữa tắm cùng loại của hãng Grace and Glow.\n" +
                                    "\n" +
                                    "\n" +
                                    "\n" +
                                    "THÀNH PHẦN：\n" +
                                    "\n" +
                                    "Water, glycerin, caprylic/capric triglyceride, cyclopentasiloxane, ci 77891, niacinamide, butylene glycol, panthenol, phenoxyethanol, carbomer, triethanolamine, chlorphenesin, sodium acrylate/sodium acryloyldimethyl taurate, copolymer, fragrance, isohexadecane, simmondsia chinensis (jojoba) seed oil, aluminum hydroxide, silica, polysorbate 80, triethoxycaprylylsilane, disodium edta, sorbitan oleate, butyrospermum parkii (shea) butter, sodium hyaluronate, glutathione, lactococcus ferment lysate, ellagic acid, ryoku-cha ekisu, hydrolyzed, soybean extract, morus nigra fruit extract, lactobacillus ferment, glycyrrhiza uralensis (licorice) root extract, pentylene glycol, 1,2-hexanediol, hydroxyacetophenone, lactic acid, sodium chloride, sodium benzoate.",
                            category2, sub8
                    ),

                    new Product(
                            "Dưỡng thể Alpha Arbutin Collagen Lotion 500ml",
                            "https://down-vn.img.susercontent.com/file/vn-11134207-7r98o-lwwaraycy57da9@resize_w900_nl.webp",
                            new BigDecimal("75000"),
                            "Thương Hiệu: Alpha Arbutin\n" +
                                    "\n" +
                                    "Xuất Xứ: Thái Lan\n" +
                                    "\n" +
                                    "Dung Tích: 500ml\n" +
                                    "\n" +
                                    "\n" +
                                    "\n" +
                                    "Công dụng:\n" +
                                    "\n" +
                                    "- Thành phần Alpha Arbutin hàm lượng cao 3x và tinh chất dưỡng trắng essence làm giảm đốm nâu, dưỡng da mền mại, trắng sáng \n" +
                                    "\n" +
                                    "- Collagen trong sữa dưỡng giúp da chống lại các tác nhân lão hóa và cải thiện, tăng độ đàn hồi cho da.\n" +
                                    "\n" +
                                    "- Tạo lớp màng ngăn ngừa các gốc tự do phá hoại cho làn da giúp hục hồi làn da bị hư tổn, đen sạm do cháy nắng cực kì hiệu quả.\n" +
                                    "\n" +
                                    "- Bổ sung độ ẩm, da không chỉ trắng sáng mà còn mềm mại, mịn màng , dưỡng trắng - ẩm - giảm thâm\n" +
                                    "\n" +
                                    "\n" +
                                    "\n" +
                                    "Thành phần:\n" +
                                    "\n" +
                                    "- Alpha Arbutin: hoạt chất dưỡng trắng, sáng da hiệu quả với cơ chế hoạt động an toàn và ít kích ứng hơn hydroquinone bằng cách ngăn sự hình thành của Melanin đồng thời phục hồi làn da nám, đốm nâu, không đều màu. \n" +
                                    "\n" +
                                    "- Collagen: hỗ trợ quá trình tái tạo làn da hư tổn trở nên khỏe mạnh, đàn hồi và săn chắc hơn. \n" +
                                    "\n" +
                                    "- Stearic Acid: làm dịu da và cũng có khả năng dưỡng ẩm da hiệu quả. \n" +
                                    "\n" +
                                    "\n" +
                                    "\n" +
                                    "Hướng dẫn sử dụng:\n" +
                                    "\n" +
                                    "Lấy 1 lượng kem vừa đủ thoa đều khắp cơ thể, sử dụng ngày 2 lần sáng và trước khi ngủ.",
                            category2, sub8
                    ),

                    new Product(
                            "Sữa dưỡng thể trắng da căng bóng Grace & Glow Rouge 540 Body Serum 300ml",
                            "https://down-vn.img.susercontent.com/file/vn-11134207-7r98o-ll30z34bevh902@resize_w900_nl.webp",
                            new BigDecimal("99000"),
                            "Sữa dưỡng thể trắng da căng bóng Grace & Glow Rouge 540 Body Serum \n" +
                                    "Sữa dưỡng thể sáng da căng bóng Grace & Glow Rouge 540 Body Serum có hương nước hoa hàng hiệu Rouge 540, chứa Niacinamide và Bakuchiol giúp duy trì độ ẩm để da không bị khô, cho da căng bóng và săn chắc, cho cơ thể thơm mát cả ngày dài\n" +
                                    "Cách sử dụng: Lấy sữa dưỡng thể ra tay, nhẹ nhàng thoa đều khắp cơ thể để dưỡng chất thẩm thấu.\n" +
                                    "Sử dụng ngày 2 lần, vào buổi sáng và buổi tối trước khi đi ngủ.\n" +
                                    "Sản phẩm phát huy công dụng tốt nhất khi kết hợp với sữa tắm cùng loại của hãng Grace and Glow.\n" +
                                    "Thành phần:\n" +
                                    "\n" +
                                    "Aqua, glycerin, caprylic/capric triglyceride, cyclopentasiloxane, CI 77891, fragrance, carbomer, sodium acrylate/sodium acryloyldimethyl taurate copolymer, phenoxyethanol, isohexadecane, panthenol, simmondsia chinensis (jojoba) seed oil, butyrospermum parkii (shea) butter, squalane, polysorbate 80, niacinamide, triethanolamine, chlorphenesin, hydroxyacetophenone, triethoxycaprylylsilane, sodium hyaluronate, disodium EDTA, sorbitan sesquioleate, bakuchiol\n" +
                                    "\n" +
                                    "Dung tích: 300ml.",
                            category2, sub8
                    ),

                    new Product(
                            "Combo Sữa Dưỡng Thể Thiên Nhiên Purité Hương Hoa Anh Đào 250ML + Tặng Sữa Tắm Purité Hoa Anh Đào 250ML",
                            "https://down-vn.img.susercontent.com/file/vn-11134201-7ra0g-m6ru0m4srdd347@resize_w900_nl.webp",
                            new BigDecimal("123000"),
                            "Sữa Dưỡng Thể Purité Sáng Mịn Hoa Anh Đào 250ml\n" +
                                    "Sữa Dưỡng Thể Purité Sáng Mịn Hoa Anh Đào với sự kết hợp hài hòa giữa tinh chất hoa anh đào, dầu olive Glycerine sẽ nhanh chóng thẩm thấu vào da, nuôi dưỡng làn da bạn từ sâu bên trong, đồng thời tác động làm hỗ trợ tái cấu trúc tế bào, giúp làn da bạn căng mịn, khỏe mạnh. Làn da bạn mỗi ngày sẽ thêm mềm mại và mượt mà hơn. Sản phẩm cho hương hoa anh đào ngọt ngào phảng phất trên da, không nồng mà thoang thoảng, xoa dịu mọi giác quan.\n" +
                                    "SẢN PHẨM VỚI CÁC THÀNH PHẦN VÀ CÔNG DỤNG:\n" +
                                    "\n" +
                                    "+ Mang lại cho bạn làn da đẹp tự nhiên với hương thơm Hoa anh đào phảng phất đầy quyến rũ đồng thời làm mềm và giữ ẩm cho da.\n" +
                                    "\n" +
                                    "+ Thành phần dầu Oliu giúp nuôi dưỡng làn da ẩm mịn từ bên trong.\n" +
                                    "LOẠI DA PHÙ HỢP:\n" +
                                    "\n" +
                                    "+ Phù hợp cho mọi loại da.\n" +
                                    "HƯỚNG DẪN SỬ DỤNG:\n" +
                                    "\n" +
                                    "+ Lấy một lượng sản phẩm vừa đủ và thoa đều lên cơ thể. Nên sử dụng ngay sau khi tắm, khi da vừa được lau khô và còn đang ẩm để sản phẩm được hấp thu tốt nhất.\n" +
                                    "HƯỚNG DẪN BẢO QUẢN:\n" +
                                    "\n" +
                                    "+ Bảo quản: nơi khô ráo thoáng mát.\n" +
                                    "\n" +
                                    "+ Không bảo quản nơi có nhiệt độ quá cao hoặc quá thấp, tránh ánh sáng trực tiếp.\n" +
                                    "HẠN SỬ DỤNG: \n" +
                                    "\n" +
                                    "+ 3 năm kể từ ngày sản xuất.\n" +
                                    "NGÀY SẢN XUẤT: \n" +
                                    "\n" +
                                    "+ Xem trên bao bì sản phẩm.\n" +
                                    "XUẤT XỨ:\n" +
                                    "\n" +
                                    "+ Việt Nam.\n" +
                                    "THÔNG TIN THƯƠNG HIỆU:\n" +
                                    "\n" +
                                    "+ Purité De Prôvence là thương hiệu chuyên về các sản phẩm làm đẹp và chăm sóc cơ thể nổi tiếng của nước Pháp. Lấy cảm hứng từ vẻ đẹp của vùng đất Provence kỳ diệu, Purité mang đến cho người dùng các sản phẩm được chiết xuất 100% từ những nguyên liệu thiên nhiên đặc trưng của mảnh đất Địa Trung Hải này như tinh dầu hoa hồng, hoa anh đào, hoa oải hương, dầu ô liu, dầu argan... Không chỉ làm việc miệt mài trong phòng thí nghiệm, các nhà khoa học của Purité còn làm việc trên cả những cánh đồng, để có thể đảm bảo từng nguyên liệu thảo mộc phát triển hoàn hảo.",
                            category2, sub8
                    ),

                    //MẶT NẠ

                    new Product(
                            "Mặt Nạ Đất Sét Geoskincare Làm Sạch Sâu, Se Khít Lỗ Chân Lông, Giảm Dầu Nhờn, Dưỡng Da Ẩm Mịn 100ml",
                            "https://down-vn.img.susercontent.com/file/cn-11134207-7ras8-m6qbun54fy0860@resize_w900_nl.webp",
                            new BigDecimal("254000"),
                            "Giới thiệu sản phẩm\n" +
                                    "\n" +
                                    "Mặt nạ bùn núi lửa Geoskincare 100ml giúp làm sạch lỗ chân lông, cấp ẩm và kiểm soát dầu nhờn. Dễ dàng rửa sạch mà không gây căng da, kết hợp với nhiều tinh chất từ thiên nhiên, mặt nạ giúp loại bỏ bụi bẩn trong khi vẫn giữ được độ ẩm và không gây khô da. Loại bỏ tình trạng da khô nứt nẻ, giúp da luôn mềm mịn và căng bóng.\n" +
                                    "Đặc điểm sản phẩm\n" +
                                    "\n" +
                                    "1. Mặt nạ đất sét núi lửa (Đen) chứa than hoạt tính giúp làm sạch và thu nhỏ lỗ chân lông, tẩy sạch mụn đầu đen và lớp trang điểm còn sót lại mà không làm khô da. Giúp da trông tươi mát, mịn màng hơn. \n" +
                                    "\n" +
                                    "- Thành phần chính: New Zealand Glacier Clay* + Than hoạt tính + Đất sét núi lửa + Kaolin.\n" +
                                    "\n" +
                                    "- Phù hợp cho các spa chăm sóc da, làm sạch da chuyên sâu.\n" +
                                    "2. Mặt nạ bùn núi lửa (Xanh Lá) giúp làm sạch sâu lỗ chân lông mà không gây kích ứng, kiểm soát dầu và cấp ẩm giúp da săn chắc hơn.\n" +
                                    "\n" +
                                    "- Thành phần chính: 5 lớp đất sét khả năng hấp thụ tự nhiên giúp loại bỏ tạp chất. 5 thành phần chiết xuất thực vật làm dịu làn da \"khó tính\". 5 thành phần dưỡng ẩm cung cấp độ ẩm, hỗ trợ làn da sáng khỏe.\n" +
                                    "\n" +
                                    "- Với lớp nền màu xanh ô liu phù hợp cho việc chăm sóc dưỡng ẩm hàng ngày.\n" +
                                    "3. Mặt nạ bùn băng (Xanh dương) với 2 loại đất sét giúp làm sạch sâu lỗ chân lông, kiềm dầu, dưỡng ẩm mà không gây căng da. Làm sạch mạnh mẽ và thanh lọc giúp làn da trở nên tươi sáng hơn. \n" +
                                    "\n" +
                                    "- Thành phần chính: New Zealand Glacier Clay + Kaolin + Đất sét núi lửa + Dầu hạt Jojoba + Zinc PCA + Niacinamide.\n" +
                                    "\n" +
                                    "- Với lớp nền màu vàng nhạt phù hợp cho việc chăm sóc da, làm sạch lỗ chân lông, kiểm soát dầu.\n" +
                                    "\n" +
                                    "*Đất sét Glacier của New Zealand hay còn gọi là Bùn sông băng New Zealand.\n" +
                                    "Thông tin sản phẩm\n" +
                                    "\n" +
                                    "- Thương hiệu: Geoskincare\n" +
                                    "\n" +
                                    "- Xuất xứ: Trung Quốc\n" +
                                    "\n" +
                                    "- Sản phẩm: mặt nạ bùn núi lửa\n" +
                                    "\n" +
                                    "- Phân loại: Đen, Xanh lá, Xanh dương\n" +
                                    "\n" +
                                    "- Dung tích: 100ml\n" +
                                    "\n" +
                                    "- Hạn sử dụng: 4 năm\n" +
                                    "\n" +
                                    "- Phù hợp với loại da: Mọi loại da\n" +
                                    "\n" +
                                    "- Công dụng: Làm sạch mụn đầu đen, sợi bả nhờn, kiểm soát dầu, cấp ẩm\n" +
                                    "\n" +
                                    "- Cách bảo quản: Để nơi khô ráo, thoáng mát\n" +
                                    "Chính sách mua hàng và đổi trả tại Geoskincare VN\n" +
                                    "\n" +
                                    "- Cam kết sản phẩm chính hãng, nguồn gốc xuất xứ rõ ràng\n" +
                                    "\n" +
                                    "- Nếu có bất kỳ câu hỏi nào về sản phẩm, vui lòng liên hệ với shop qua chat để được hỗ trợ.\n" +
                                    "\n" +
                                    "- Giao hàng trong vòng 36 giờ sau khi đặt đơn, nếu vào ngày nghỉ lễ sẽ bị trì hoãn 1 ngày.\n" +
                                    "\n" +
                                    "- Đổi trả sản phẩm trong vòng 15 ngày theo chính sách của Shopee. \n" +
                                    "\n" +
                                    "- Sản phẩm đổi trả phải ở tình trạng mới Chưa mở niêm phong và Chưa qua sử dụng, bao bì đầy đủ và phụ kiện quà tặng kèm theo (nếu có). \n" +
                                    "\n" +
                                    "(Trước khi yêu cầu đổi trả, vui lòng nhắn tin cho Shop qua Chat để được hỗ trợ nhanh nhất)\n" +
                                    "Lưu ý: Màu sắc của sản phẩm trên hình ảnh đăng tải có thể có sự chênh lệch nhỏ do độ phân giải màn hình và ánh sáng, vui lòng tham khảo màu sắc thực tế của sản phẩm.",
                            category3, sub9
                    ),

                    new Product(
                            "Mặt nạ đất sét MILAGANICS tràm trà BHA mask đất sét tràm trà hỗ trợ giảm mụn 60g",
                            "https://down-vn.img.susercontent.com/file/vn-11134207-7ras8-m3n6em13rlbc7a@resize_w900_nl.webp",
                            new BigDecimal("87300"),
                            "1. GIỚI THIỆU SẢN PHẨM\n" +
                                    "Sản phẩm mặt nạ Tràm Trà Milaganics với cơ chế hỗ trợ giảm mụn thông minh từ tinh dầu Tràm Trà, kết hợp cùng hoạt chất BHA sẽ ức chế sự sinh trưởng của vi khuẩn gây ra mụn, giúp xẹp các nốt mụn chỉ sau vài lần sử dụng. Sản phẩm có thêm tinh dầu Tràm Trà sẽ tác động đến lớp biểu bì, ngăn ngừa việc hình thành nhân mụn và hỗ trợ phục hồi vùng da bị thương tổn do mụn gây ra\n" +
                                    "2. THÀNH PHẦN \n" +
                                    "Tinh dầu tràm trà, Kaolin, Lá nha đam tươi, Chiết xuất cây phỉ, Chiết xuất hoa hồng, Glycerin, Chiết xuất củ cải đường, Dầu dừa, Dầu cám gạo\n" +
                                    "3. CÔNG DỤNG\n" +
                                    "- Hỗ trợ giảm mụn: Thành phần tinh dầu Tràm Trà có trong mặt nạ Tràm Trà sẽ loại bỏ các vi khuẩn gây mụn, ức chế viêm nhiễm từ đó làm teo các nốt mụn đỏ từ bên trong, đồng thời làm khô các nốt mụn mủ và đẩy nhân mụn ra ngoài, giúp giảm mụn nhanh chóng sau một thời gian sử dụng.\n" +
                                    "\n" +
                                    "- Se khít lỗ chân lông: Chiết xuất cây Phỉ, lá Nha Đam, Hoa Hồng và rễ Củ Cải Đường có tác dụng loại bỏ vi khuẩn và lớp bã nhờn ẩn trong lỗ chân lông, sau đó làm se khít lỗ chân lông.\n" +
                                    "\n" +
                                    "- Dưỡng da sáng mịn: Hợp chất dầu Dừa, dầu Cám Gạo với hàm lượng khoáng chất cao sẽ bổ sung dưỡng chất cùng độ ẩm cần thiết cho da, hỗ trợ khả năng làm sáng da, chống oxy hóa, giảm sự tác động của những gốc tự do, từ đó giúp da mặt tươi trẻ và mịn màng hơn.\n" +
                                    "\n" +
                                    "4. CAM KẾT CHẤT LƯỢNG\n" +
                                    "- Không chứa paraben\n" +
                                    "\n" +
                                    "- Không màu nhân tạo\n" +
                                    "\n" +
                                    "- Không chứa sulfate\n" +
                                    "5. HƯỚNG DẪN SỬ DỤNG\n" +
                                    "Rửa sạch mặt, sử dụng lượng sản phẩm vừa đủ thoa đều lên mặt, tránh vùng mắt, môi. Thư giãn từ 15-20 phút sau đó rửa lại với nước sạch. Sử dụng 3 lần/tuần để đạt hiệu quả tốt nhất.\n" +
                                    "6. LƯU Ý\n" +
                                    "Ngưng sử dụng nếu kích ứng với thành phần của sản phẩm.",
                            category3, sub9
                    ),

                    new Product(
                            "Combo 5 bộ mặt nạ bơ tươi Pơ Lang tái tạo, cấp ẩm, dưỡng da, giúp trẻ hóa làn da",
                            "https://down-vn.img.susercontent.com/file/vn-11134207-7ras8-m37mxslf2zlo1f@resize_w900_nl.webp",
                            new BigDecimal("75000"),
                            "Mặt nạ bột bơ tươi là sản phẩm được làm 100% từ thịt trái bơ tươi theo công nghê sấy thăng hoa. Thành phẩm sau khi chế biến vẫn giữ được sự nguyên chất, nguyên mùi vị, bột mịn và có màu xanh vàng. \n" +
                                    "\tBột bơ chứa nhiều vitamin và dưỡng chất, không gây kích ứng phù hợp với nhiều loại da kể cả da nhạy cảm. Mặt nạ bột bơ tươi không chỉ nuôi dưỡng làn da khỏe mạnh từ trong ra ngoài mà còn giúp hạn chế và làm chậm quá trình lão hóa để bạn luôn tự tin mỗi ngày.",
                            category3, sub9
                    ),

                    new Product(
                            "Mặt Nạ Bùn COLORKEY LUMINOUS Làm Sạch Da Không Gây Khô Da Khi Dùng 60g/hũ",
                            "https://down-vn.img.susercontent.com/file/vn-11134207-7ra0g-m7arh6lj714m3e@resize_w900_nl.webp",
                            new BigDecimal("134000"),
                            "Thông tin sản phẩm\t\n" +
                                    "\n" +
                                    "Thương hiệu: COLORKEY LUMINOUS\t\n" +
                                    "\n" +
                                    "Khối lượng tịnh 60g\n" +
                                    "\n" +
                                    "Hạn sử dụng: 3 năm\n" +
                                    "\n" +
                                    "Nơi sản xuất: Quảng Châu.\t\n" +
                                    "\n" +
                                    "Công dụng: Cấp ẩm cho da, hỗ trợ làm sáng, phục hồi da. \n" +
                                    "Hướng dẫn sử dụng:\t\n" +
                                    "\n" +
                                    "Bước 1: Làm sạch da mặt\n" +
                                    "\n" +
                                    "Bước 2: Lấy một lượng sản phẩm vừa đủ, thoa đều lên mặt \n" +
                                    "\n" +
                                    "Bước 3: Để trong vòng 10-15p rồi rửa lại với nước sạch. \n" +
                                    "Lưu ý\t\n" +
                                    "1. Kiểm tra tình trạng kích ứng của da bằng cách lấy một lượng nhỏ và bôi lên phía sau tai và theo dõi trong 24h.\n" +
                                    "\n" +
                                    "2.Ngưng sử dụng nếu có xuất hiện tình trạng kích ứng khi đắp.\n" +
                                    "\n" +
                                    "3. Mặt nạ bùn nên sử dụng 2-3 lần 1 tuần, không nên sử dụng liên tục.",
                            category3, sub9
                    ),

                    new Product(
                            "Mặt Nạ Dưỡng Trắng, Trẻ Hóa, Cấp Ẩm & Cân Bằng Da Vùng Kín, Vùng Chữ Y Cho Tẩy Lông..",
                            "https://down-vn.img.susercontent.com/file/vn-11134207-7ras8-m5td6s2ex9av98@resize_w900_nl.webp",
                            new BigDecimal("183000"),
                            "Mặt Nạ Dưỡng Trắng, Trẻ Hóa, Cấp Ẩm Và Cân Bằng Da Vùng Kín, Vùng Chữ Y phù hợp cho những trường hợp như: tẩy lông waxing vùng kín thường xuyên, ngồi lâu bắt chéo chân, sau khi sinh hay sau các kỳ kinh nguyệt, thường xuyên tham gia các hoạt động như lái xe máy hay đạp xe làm ảnh hưởng, gây kích ứng vùng kín.   \n" +
                                    "\n" +
                                    "* Giúp Làm Dịu Vùng Chữ Y\n" +
                                    "\n" +
                                    "* Chứa 6 Loại Peptide Làm Săn Chắc Da, Ngăn Ngừa Lão Hóa Vùng  Chữ Y \n" +
                                    "\n" +
                                    "*  9 Loại Hyaluronic Có Tác Dụng Dưỡng Ẩm\n" +
                                    "\n" +
                                    "* Hiệu Quả Làm Mát Dịu Vùng Chữ Y \n" +
                                    "\n" +
                                    "* Ngăn Ngừa Hiện Tượng Lông Mọc Ngược \n" +
                                    "\n" +
                                    "* Dùng Được Cho Cả Nam Và Nữ \n" +
                                    "\n" +
                                    "* Mặt NạTừ Vải Cotton 100% Nguyên Chất Mềm Mịn Chất Liệu Thân Thiện Với Môi Trường \n" +
                                    "\n" +
                                    "HDSD: \n" +
                                    "\n" +
                                    "Bước 1 Làm Sạch Mồ Hôi Và Các Chất Bẩn Ở Khu Vực Sẽ Dán Mặt Nạ \n" +
                                    "\n" +
                                    "Bước 2 Lấy Mặt Nạ Cấp Ẩm, Dưỡng Trắng Và Làm Dịu Vùng Chữ Y Blue Petal Y zone Diamond Calming Mask , \n" +
                                    "\n" +
                                    "Sau Đó Trải Miếng Dán Ra Sau Đó Đắp Lên Vùng Cần Sử Dụng  \"\n" +
                                    "\n" +
                                    "Bước 3 : Ấn Nhẹ Để Mặt Nạ Bám Đều Trên Da, Kéo Phần Dưới Mặt Để Nó Phủ Đều Lên Vị Trí Cần Thiết\n" +
                                    "\n" +
                                    "Sau 10-20 phút, Hãy Tháo Mặt Nạ Và Vỗ Nhẹ Lên Vùng Da Để Các Tinh Chất Được Thẩm Thấu Sâu Vào Bên Trong \n" +
                                    "\n" +
                                    "*Bạn Có Thể Cắt Đôi Sản Phẩm Theo Chiều Dọc Để Sử Dụng Lên Chân Hoặc Cánh Tay Giúp Làm Mát Và Làm Dịu \n" +
                                    "\n" +
                                    "*Nếu sử dụng Sau Khi Để Vào Tủ Lạnh, Bạn Có Thể Cảm Nhận Cảm Giác Mát Lạnh Hơn Khi Sử Dụng\n" +
                                    "\n" +
                                    "* Sản Phẩm Này Chỉ Sử Dụng Một Lần Và Không Thể Tái Sử Dụng Hãy Dùng Ngay Sau Khi Mở.",
                            category3, sub9
                    ),

                    new Product(
                            "Mặt Nạ Mắt BREYLEE Hỗ Trợ Trẻ Hóa, Giảm Nhăn, Làm Mờ Quầng Thâm Mắt (Hộp/60 miếng)",
                            "https://down-vn.img.susercontent.com/file/cn-11134207-7ras8-m52xfcdgxxh7ae@resize_w900_nl.webp",
                            new BigDecimal("108000"),
                            "Tên sản phẩm\n" +
                                    "MẶT NẠ MẮT BREYLEE CHIẾT XUẤT TỪ TRÁI THẠCH LỰU\n" +
                                    "\n" +
                                    "Thông tin chi tiết\n" +
                                    "Số lượng: 60 Miếng / 30 cặp\n" +
                                    "\n" +
                                    "Công dụng\n" +
                                    "Hiệu quả làm trắng và dưỡng ẩm cao, tạo ra làn da tươi mới và trắng sáng\n" +
                                    "Tinh chất trái thạch lựu đỏ và chống oxy hóa, hỗ trợ giảm quầng mắt, làm trắng da và làm sáng vùng da quanh mắt. Dưỡng da sâu với axit hyaluronic phân tử nhỏ hoạt tính cao, giúp vùng da quanh mắt luôn ẩm mượt và tươi sáng.\n" +
                                    "\n" +
                                    "Thành phần\n" +
                                    "NƯỚC, SORBITOL, GLYCERIN, BUTYLENE GLYCOL, CHIẾT XUẤT TỪ TẢO NÂU, SODIUM HYALURONATE, CHIẾT XUẤT TỪ TỪ RÊU AILEN (CARRAGEENAN), POTASSIUM CHLORIDE, CHIẾT XUẤT TỪ RAU MÁ, CHIẾT XUẤT TỪ TRÁI LỰU, YẾN MẠCH (AVENA SATIVA) β-GLUCAN、ARBUTIN、XANTHAN GUM、CHIẾT XUẤT TỪ LÁ / HOA NHUNG TUYẾT、HYDROXYPROPYL METHYLCELLULOSE、PENTYLENE GLYCOL、DIPOTASSIUM GLYCYRRHIZATE、METHYLPARABEN、CALCIUM CHLORIDE、MICA、1,2-HEXANEDIOL、CHLORPHENESIN、DISODIUM EDTA、ALLANTOIN、NƯỚC HOA.",
                            category3, sub9
                    ),

                    new Product(
                            "Mặt nạ giấy cấp ẩm chứa Hyaluronic Acid, 10 miếng, Jelly Mask",
                            "https://down-vn.img.susercontent.com/file/cn-11134207-7ras8-m6i1qkntfuncec@resize_w900_nl.webp",
                            new BigDecimal("89000"),
                            "Chi tiết sản phẩm Giới thiệu:\n" +
                                    "\n" +
                                    "1.Tên: Floweryland Axit Hyaluronic Centella Asiatica Bursting Water Mask Dưỡng ẩm Sửa chữa Làm dịu Mặt nạ thạch\n" +
                                    "\n" +
                                    "2.Hiệu quả: Axit Hyaluronic 8D, Dưỡng ẩm ba chiều, Dưỡng ẩm và Dưỡng ẩm\n" +
                                    "\n" +
                                    "3.Nội dung thực: 23ml / miếng\n" +
                                    "\n" +
                                    "4.Thời hạn sử dụng: 3 năm.",
                            category3, sub9
                    ),

                    new Product(
                            "Bộ 20 Mặt Nạ Ngủ Dạng Thạch 4ml Chứa Vitamin C Giúp Dưỡng Ẩm Và Làm Trắng Da",
                            "https://down-vn.img.susercontent.com/file/0428efd3d800d45c8eac7798d7a87a2a@resize_w900_nl.webp",
                            new BigDecimal("41000"),
                            "Sản phẩm - Mặt nạ ngủ làm trắng da dưỡng ẩm Vitamin C Good Night Jelly\n" +
                                    "\n" +
                                    "Dung tích “ 4ml pcs\n" +
                                    "\n" +
                                    "Thành phần - Collagen , natri hyaluronate, Nicotinamide. men bifid\n" +
                                    "\n" +
                                    "Thích hợp cho mọi loại da\n" +
                                    "Công dụng “ Chứa đầy đủ tinh chất dưỡng ẩm phức hợp collagen , chăm sóc và nuôi dưỡng làn da vào ban đêm , cho làn da ngủ ngon và cảm nhận vẻ đẹp , bổ sung nước đậm đặc , khóa nước giữ độ ẩm cho trạng thái tươi trẻ .\n" +
                                    "Hạn sử dụng 3 năm\n" +
                                    "\n" +
                                    "Hướng dẫn sử dụng “ Sau khi làm sạch và chăm sóc da cơ bản , hãy lấy hộp và xé nhãn\n" +
                                    "\n" +
                                    "Lấy mặt nạ ra và thoa đều lên mặt , nghỉ ngơi một lúc rồi đi ngủ .\n" +
                                    "Ghi chú \n" +
                                    "\n" +
                                    "Chỉ sử dụng ngoài da , tránh tiếp xúc với mắt và da bị tổn thương .\n" +
                                    "\n" +
                                    "Tránh xa trẻ sơ sinh và trẻ em .",
                            category3, sub9
                    ),

                    //TẨY TRANG

                    new Product(
                            "Nước Tẩy Trang Rootoo Thuần Tự Nhiên Sạch Sâu Không Cồn Cho Mọi Loại Da Không Kích Ứng(100ml)",
                            "https://down-vn.img.susercontent.com/file/vn-11134207-7ra0g-m76adwhcehiwaf@resize_w900_nl.webp",
                            new BigDecimal("84000"),
                            "Nước Tẩy Trang Rootoo với công thức dịu nhẹ và thành phần tự nhiên an toàn, lành tính giúp làm sạch sâu, loại bỏ bụi bẩn, bã nhờn và lớp trang điểm một cách nhẹ nhàng mà không gây kích ứng, khô căng da, kể cả làn da nhạy cảm.\n" +
                                    "\n" +
                                    "1. THÔNG TIN SẢN PHẨM:\n" +
                                    "\n" +
                                    "- Tên sản phẩm: Nước Tẩy Trang Rootoo\n" +
                                    "\n" +
                                    "- Dạng sản phẩm: chai dạng pump\n" +
                                    "\n" +
                                    "- Mùi hương: hương thơm dịu nhẹ với mùi thảo dược tự nhiên\n" +
                                    "\n" +
                                    "- Dung tích: 100ml\n" +
                                    "\n" +
                                    "- Loại da phù hợp: phù hợp cho mọi loại da, kể cả da nhạy cảm\n" +
                                    "\n" +
                                    "- Hạn sử dụng: 2 năm kể từ ngày sản xuất - 1 năm kể từ ngày mở nắp\n" +
                                    "\n" +
                                    "2. CÔNG DỤNG:\n" +
                                    "\n" +
                                    "- Làm sạch sâu lớp trang điểm, dầu thừa bã nhờn nhưng không gây khô và căng da\n" +
                                    "\n" +
                                    "- Không cay mắt.\n" +
                                    "\n" +
                                    "- Đặc biệt phù hợp với mọi loại da, không gây kích ứng.",
                            category3, sub10
                    ),

                    new Product(
                            "Nước tẩy trang rau má AISASEA 500ml dưỡng ẩm khuôn mặt môi mắt làm sạch sâu cho da nhạy cảm",
                            "https://down-vn.img.susercontent.com/file/cn-11134207-7r98o-loos2ezyktwsc3@resize_w900_nl.webp",
                            new BigDecimal("115000"),
                            "Nước tẩy trang rau má AISASEA 500ml chiết xuất thực vật tự nhiên dịu nhẹ dưỡng ẩm cho da nhạy cảm\n" +
                                    "\n" +
                                    "Thể tích thực: 500ml\n" +
                                    "\n" +
                                    "\uD83D\uDD34Chiết xuất từ 7 loại thực vật thiên nhiên, chăm sóc da nhẹ nhàng, tẩy trang an toàn, làm sạch nhẹ nhàng, không làm căng da, công nghệ phân tử nhỏ, thẩm thấu sâu, tẩy trang sạch, không Cồn, bảo vệ làn da nhạy cảm, tạo cảm giác sạch sẽ và mềm mại cho Da khi sử dụng, thoải mái và thân thiện với làn da.\n" +
                                    "\n" +
                                    "Loại bỏ không tốt, da có vấn đề? Lỗ chân lông to, nổi mụn, mẩn đỏ nhạy cảm. Cặn trang điểm, lỗ chân lông bị tắc?\n" +
                                    "\n" +
                                    "✔\uFE0FThẩm thấu các phân tử nhỏ + dưỡng ẩm nhẹ\n" +
                                    "\n" +
                                    "✔\uFE0FTrải nghiệm tẩy trang cấp độ Spa\n" +
                                    "\n" +
                                    "✔\uFE0FSử dụng cho mắt và môi\n" +
                                    "\n" +
                                    "✔\uFE0FTrang điểm hàng ngày dễ tẩy trang, vùng mắt và môi không dễ lưu lại\n" +
                                    "\n" +
                                    "⭕ Bảy loại dưỡng chất thực vật, tự nhiên và nhẹ nhàng để bảo vệ da!\n" +
                                    "\uD83D\uDCA7DƯỠNG ẨM VÀ NGẬM NƯỚC\n" +
                                    "\n" +
                                    "Chiết xuất rễ Rau má,\n" +
                                    "\n" +
                                    "Chiết xuất cám yến mạch (AVENA SATIVA),\n" +
                                    "\n" +
                                    "\uD83D\uDCA7Phục hồi và làm dịu\n" +
                                    "\n" +
                                    "Chiết xuất cây xương rồng (OPUNTIA DILLENII)\n" +
                                    "\n" +
                                    "Chiết xuất rễ OPHIOPOGON JAPONICUS (OPHIOPOGON JAPONICUS)\n" +
                                    "\n" +
                                    "Chiết xuất rễ SCUTELLARIA BAICALENSIS (SCUTELLARIA BAICALENSIS)\n" +
                                    "\n" +
                                    "\uD83D\uDCA7Kích hoạt trẻ hóa da\n" +
                                    "\n" +
                                    "Chiết xuất rễ hoa mẫu đơn (PAEONIA SUFFRUTICOSA)\n" +
                                    "\n" +
                                    "Chiết xuất rễ hoa mẫu đơn (PAEONIA ALBIFLORA)\n" +
                                    "\n" +
                                    "\uD83D\uDCD6 Thích hợp để tẩy trang cho:\n" +
                                    "\n" +
                                    "Trang điểm, chẳng hạn như kem nền dạng lỏng, mascara, son môi, v.v.\n" +
                                    "\n" +
                                    "Kem chống nắng, chẳng hạn như không thấm nước, không bong tróc\n" +
                                    "\n" +
                                    "Da nhạy cảm, chẳng hạn như mẩn đỏ, mụn trứng cá, mụn trứng cá, v.v.\n" +
                                    "\uD83D\uDCD6 Cách sử dụng: \n" +
                                    "Lấy một lượng vừa đủ sản phẩm này, đổ lên miếng bông và nhẹ nhàng lau sạch lớp trang điểm trên mặt theo hướng ra ngoài, lau nhiều lần cho đến khi sạch.",
                            category3, sub10
                    ),

                    new Product(
                            "Nước Tẩy Trang Carslan Làm Sạch Sâu Hiệu Quả 500ml",
                            "https://down-vn.img.susercontent.com/file/sg-11134201-22090-fl65in277zhvd6@resize_w900_nl.webp",
                            new BigDecimal("119000"),
                            "Thời gian giao hàng dự kiến cho sản phẩm này là từ 7-9 ngày\n" +
                                    "Cửa hàng chính hãng Carslan\n" +
                                    "\n" +
                                    "Ra đời năm 2001, tập trung vào nghiên cứu, phát triển và đổi mới, tạo ra những sản phẩm tốt với sự khéo léo\n" +
                                    "\n" +
                                    "Luôn duy trì sự nhạy bén về xu hướng thời trang quốc tế và văn hóa thời trang trẻ, đồng thời sử dụng thẩm mỹ quốc tế để xác định xu hướng trang điểm. Sử dụng chất lượng thế giới để xây dựng các sản phẩm danh tiếng\n" +
                                    "Lưu ý:\n" +
                                    "1. Do chênh lệch cài đặt ánh sáng và màn hình, màu sắc sản phẩm có thể hơi khác so với hình ảnh. Chúng tôi đảm bảo phong cách giống như trong hình ảnh. Cảm ơn bạn!\n" +
                                    "\n" +
                                    "2. Cách bảo quản: để nơi thoáng mát, tránh ánh nắng mặt trời.",
                            category3, sub10
                    ),

                    new Product(
                            "Kem tẩy trang FOCALLURE 10x 75g chiết xuất thực vật làm sạch sâu dưỡng ẩm không gây kích ứng",
                            "https://down-vn.img.susercontent.com/file/sg-11134201-22120-wrr9bkdfp7kvd2@resize_w900_nl.webp",
                            new BigDecimal("197000"),
                            "ocallure#Plantfactory Instant Purifying Deep Cleansing Balm, có thể tan chảy trong 1 giây, loại bỏ tất cả các lớp trang điểm trong 10 giây và không có cặn; cũng chứa 10x chiết xuất thực vật, tươi và ẩm, nhẹ nhàng và không gây kích ứng.\n" +
                                    "\n" +
                                    "[10 Giây Loại bỏ] Kết cấu kem, sẽ tan vào công thức dầu trong một giây khi tiếp xúc với da, nhũ hóa thành công thức sữa trong 1 giây với nước, nhanh chóng loại bỏ lớp trang điểm và làm sạch bụi bẩn còn sót lại trong 10 giây mà không để lại cặn\n" +
                                    "\n" +
                                    "[Làm Sạch sâu] Dầu dưỡng làm sạch này có khả năng làm sạch mạnh mẽ, có thể dễ dàng loại bỏ lớp trang điểm mắt và lớp trang điểm không thấm nước mà không để lại cặn bẩn \n" +
                                    "\n" +
                                    "[Không Gây kích ứng] Công thức giàu 10 chiết xuất thực vật tự nhiên, giúp duy trì và bảo vệ sức khỏe của hàng rào bảo vệ da. Nó an toàn, nhẹ nhàng và không gây kích ứng với hương thơm tươi mát\n" +
                                    "\n" +
                                    "[Làm Mới & Cấp ẩm] Dầu dưỡng làm sạch này được làm giàu với SIMMONDSIA CHINENSIS SEED OIL, HELIANTHUS ANNUUS SEED OIL, và GLYCINE MAX OIL, giúp giữ cho làn da mịn màng và ẩm mượt mà không làm bong tróc da. Độ ẩm tự nhiên, để lại nó tươi mát và mềm mại một cách dễ dàng\n" +
                                    "\n" +
                                    "[Tích Hợp \"Thìa\"] Được tích hợp \"thìa\" tích hợp chất liệu dễ lau chùi, giúp bạn lấy dầu dưỡng làm sạch trong khi vẫn giữ móng tay ra khỏi goop, ngoài ra, thiết kế ngăn tốt hơn để giữ cho móng tay của bạn không bị bết dính Giữ vệ sinh.",
                            category3, sub10
                    ),

                    new Product(
                            "Nước Tẩy Trang Bioderma Cho Da Dầu Mụn Và Da Nhạy Cảm, Sạch Sâu Lành Tính 500ML",
                            "https://down-vn.img.susercontent.com/file/vn-11134201-7ra0g-m6zlkvanbi9kc5@resize_w900_nl.webp",
                            new BigDecimal("115000"),
                            "Nước Tẩy Trang Bioderma Sensibio H2O Chính Hãng Cho Da Dầu Mụn Và Da Nhạy Cảm 500ml\n" +
                                    "\n" +
                                    "THÔNG TIN SẢN PHẨM:\n" +
                                    "\n" +
                                    "- Dung tích: 500ml\n" +
                                    "\n" +
                                    "- Xuất xứ thương hiệu: Pháp\n" +
                                    "\n" +
                                    "- Bao bi thay đổi tuỳ đợt nhập hàng\n" +
                                    "\n" +
                                    "- Hướng dẫn bảo quản: Nơi thoáng mát, tránh ánh nắng trực tiếp, đậy nắp kín sau khi sử dụng\n" +
                                    "\n" +
                                    "THÀNH PHẦN:\n" +
                                    "\n" +
                                    "- Phức hợp Fluidactiv có tác dụng điều hòa chất lượng bã nhờn, giảm tình trạng bít lỗ chân lông và hình thành mụn.\n" +
                                    "\n" +
                                    "- Sebium H2O thanh lọc, nhờ các thành phần như kẽm và đồng mang lại cho nó màu xanh đặc biệt. Ginkgo Biloba cải thiện chất lượng bã nhờn trên da\n" +
                                    "\n" +
                                    "- Với chiết xuất rong biển và sự kết hợp của các hoạt chất, D.A.F. phức tạp làm tăng khả năng chịu đựng của da trong khi kích thích sức đề kháng. Do đó, lớp biểu bì của bạn được bảo vệ tốt hơn chống lại các gốc tự do, ô nhiễm, chất gây dị ứng và các yếu tố xâm lược.",
                            category3, sub10
                    ),

                    new Product(
                            "Maybelline Eye & Lip Makeup Remover Nước tẩy trang mắt môi chai 40ml-150ml mall Trung yishifa",
                            "https://down-vn.img.susercontent.com/file/vn-11134207-7ras8-m0my0ra5uktpc8@resize_w900_nl.webp",
                            new BigDecimal("94000"),
                            "Chi tiết sản phẩm \n" +
                                    "Tên sản phẩm: Nước tẩy trang mắt và môi Maybelline\n" +
                                    "Cấu tạo: Gồm 2 lớp, 1 lớp dầu, 1 lớp nước\n" +
                                    "Dung tích: 150ml\n" +
                                    "Thương hiệu: Maybelline (Mỹ)\n" +
                                    "1. Thông tin sản phẩm\n" +
                                    "Nước Tẩy Trang Mắt Và Môi Maybelline là sản phẩm tẩy trang môi chuyên nghiệp của thương hiệu Maybelline. Nó được sử dụng cho vùng da quanh mắt và môi. Nó chứa tinh chất hoa hồng, có thể bảo vệ da, làm mềm da và tránh khô da sau khi tẩy trang.\n" +
                                    "2. Ưu điểm của nước tẩy trang mắt và môi Maybelline\n" +
                                    "Nước tẩy trang mắt và môi Maybelline hiện đã có mặt tại Skinfood World, với các tính năng nổi bật sau:\n" +
                                    "Tẩy trang chuyên nghiệp: Là sản phẩm tẩy trang mắt và môi hai lớp chuyên nghiệp, được trang bị dầu tẩy trang chuyên dụng và nước tẩy trang sâu.\n" +
                                    "Làm sạch da: Làm sạch mỹ phẩm mắt và môi một cách nhanh chóng và hiệu quả\n" +
                                    "Công thức an toàn: Chứa công thức dịu nhẹ, an toàn cho da và không gây kích ứng, kể cả da nhạy cảm\n" +
                                    "Mang lại cảm giác thoải mái: Tinh chất hoa hồng và chiết xuất Kawa có tác dụng tẩy trang và làm sạch da, nuôi dưỡng vùng da quanh mắt, lông mi, môi và lông mày một cách đặc biệt, mang lại sự thoải mái và mềm mại cho làn da\n" +
                                    "Làm sạch hiệu quả: Tẩy trang nhẹ nhàng, hiệu quả và nhanh chóng làm sạch lớp trang điểm mà không bị trôi.\n" +
                                    "Thích hợp cho mọi loại da, kể cả da nhạy cảm.\n" +
                                    "3. Ứng viên được đề xuất\n" +
                                    "Thích hợp cho mọi loại da, kể cả da nhạy cảm.\n" +
                                    "4. Cách bảo quản\n" +
                                    "Tránh ánh nắng trực tiếp\n" +
                                    "Để nơi khô ráo và thoáng mát\n" +
                                    "Sử dụng nắp sau để đậy nắp\n" +
                                    "5. Hướng dẫn sử dụng\n" +
                                    "Bước 1: Lắc kỹ để trộn đều dầu và nước tẩy trang.\n" +
                                    "Bước 2: Đổ một lượng vừa đủ nước tẩy trang vào miếng bông, chấm lên mắt và môi, giữ vài giây rồi lau nhẹ lớp trang điểm dọc theo lông mày và lông mi.\n" +
                                    "Bước 3: Thực hiện bước tiếp theo để làm sạch và chăm sóc da.",
                            category3, sub10
                    ),

                    new Product(
                            "Dầu tẩy trang hoa hồng cocoon 140ml (rose cleansing oil) sạch da, mềm mịn",
                            "https://down-vn.img.susercontent.com/file/vn-11134207-7r98o-ltxy89xaqpsvcd@resize_w900_nl.webp",
                            new BigDecimal("155000"),
                            "Dầu tẩy trang hoa hồng cocoon (rose cleansing oil) giúp làm sạch sâu lớp trang điểm, bụi bẩn và dầu thừa, dưỡng ẩm mà không để lại cảm giác nhờn rít khó chịu.\n" +
                                    "\n" +
                                    "Công dụng Dầu tẩy trang hoa hồng cocoon\n" +
                                    "- Làm sạch sâu lớp trang điểm, bụi bẩn và bã nhờn tích tụ trong lỗ chân lông\n" +
                                    "- Cung cấp độ ẩm, mang đến làn da sạch, mềm mịn mà không để lại cảm giác nhờn rít trên da.\n" +
                                    "\n" +
                                    "Thành phần chính Dầu tẩy trang hoa hồng cocoon\n" +
                                    "- Dầu hoa hồng : Giúp da săn chắc, ngăn ngừa lão hóa, cấp ẩm sâu cho làn da\n" +
                                    "- Vitamin E: Giúp dưỡng ẩm, làm mềm da và chống oxy hóa cho làn da.\n" +
                                    "\n" +
                                    "Thành phần đầy đủ Dầu tẩy trang hoa hồng cocoon\n" +
                                    "GLYCERIN, AQUA/WATER, PEG-7 GLYCERYL COCOATE, C15-19 ALKANE, GLYCERETH-26, POLYSORBATE 20, ROSA DAMASCENA FLOWER OIL, TOCOPHERYL ACETATE, CARAMEL\n" +
                                    "\n" +
                                    "Hướng dẫn sử dụng Dầu tẩy trang hoa hồng cocoon\n" +
                                    "Thoa sản phẩm lên da và mát-xa nhẹ nhàng để dầu hòa tan những bụi bẩn và lớp trang điểm trên bề mặt da. Rửa sạch lại với nước.\n" +
                                    "\n" +
                                    "Cam kết Dầu tẩy trang hoa hồng cocoon\n" +
                                    "- Không dầu khoáng\n" +
                                    "- Không thử nghiệm trên động vật\n" +
                                    "- Không paraben\n" +
                                    "- Đã được kiểm nghiệm bởi chuyên gia da liễu \n" +
                                    "Hạn sử dụng: 3 năm kể từ ngày sản xuất, in trên chai.\n" +
                                    "Mỡ nắp dùng trong 12 tháng.",
                            category3, sub10
                    ),

                    new Product(
                            "Nước tẩy trang Nature Republic Good Skin Cleansing Water 500ml",
                            "https://down-vn.img.susercontent.com/file/sg-11134201-22110-r3iklmg0xpjv1d@resize_w900_nl.webp",
                            new BigDecimal("135000"),
                            "Xuất xứ: Hàn Quốc      \n" +
                                    "Dung tích: 500ml\n" +
                                    "Thương hiệu: Nature Republic\n" +
                                    "\n" +
                                    "Sản phẩm gồm có 3 loại:\n" +
                                    "1.  Nước tẩy trang dành cho da tối màu, xỉn màu Good Skin AHA Ampoule Cleansing Water 500 ml\n" +
                                    "- Thành phần: \n" +
                                    "   + Chiết xuất Citric Acid (AHA)\n" +
                                    "   + Vỏ cây liễu\n" +
                                    "   + Công nghệ Micellar\n" +
                                    "\n" +
                                    "- Công dụng: \n" +
                                    "   + Làm sạch sâu các lớp trang điểm, dầu thừa và tạp chất trên da.\n" +
                                    "   + Loại bỏ tế bào chết, làm thông thoáng lỗ chân lông mang lại làn da sạch mịn.\n" +
                                    "\n" +
                                    "- Đối tượng sử dụng: \n" +
                                    "  + Mọi loại da\n" +
                                    "  + Da thô ráp, sần sùi.\n" +
                                    "  + Da tối, xỉn màu.\n" +
                                    "\n" +
                                    "2. Nước tẩy trang dành cho da dầu, da hỗn hợp, da mụn Good Skin Tea Tree Ampoule Cleansing Water 500ml\n" +
                                    "- Thành phần: \n" +
                                    "   + Chiết xuất Tràm trà\n" +
                                    "   + Vỏ cây Enantia Chlorantha\n" +
                                    "   + Công nghệ Micellar\n" +
                                    "\n" +
                                    "- Công dụng: \n" +
                                    "   + Làm sạch sâu các lớp trang điểm, dầu thừa và tạp chất trên da.\n" +
                                    "   + Giúp kiểm soát dầu từ đó giúp chăm sóc, cải thiện lỗ chân lông mang lại làn da sạch mịn.\n" +
                                    "\n" +
                                    "- Đối tượng sử dụng: \n" +
                                    "  + Da dầu, hỗn hợp.\n" +
                                    "  + Da mụn\n" +
                                    "\n" +
                                    "3.  Nước tẩy trang dành cho mọi loại da Good Skin Mineral Ampoule Cleansing Water 500 ml\n" +
                                    "- Thành phần: \n" +
                                    "   + Nước biển giàu các khoáng chất như canxi, magie…\n" +
                                    "   + Công nghệ Micellar\n" +
                                    "\n" +
                                    "- Công dụng: Làm sạch sâu các lớp trang điểm, dầu thừa và tạp chất nhưng vẫn giữ được độ ẩm tự nhiên cho da không bị khô căng sau khi làm sạch.\n" +
                                    "\n" +
                                    "- Đối tượng sử dụng: \n" +
                                    "  + Moi loại da. Đặc biệt da khô, thường.\n" +
                                    "  + Da lão hóa\n" +
                                    "\n" +
                                    "HƯỚNG DẪN SỬ DỤNG:\n" +
                                    "\n" +
                                    "Lấy một lượng vừa đủ ra bông cotton nhẹ nhàng lau lên mặt sau đó rửa lại bằng nước ấm. Với vùng da trang điểm đậm/kỹ giữ và ấn nhẹ trong vòng 10 giây để có thể làm sạch hiệu quả.\n" +
                                    "\n" +
                                    "HSD: 3 năm kể từ ngày sản xuất.",
                            category3, sub10
                    ),

                    //DỤNG CỤ CHẮM SÓC DA

                    new Product(
                            "Máy massage mặt đẩy tinh chất nâng cơ mặt cầm tay máy điện di máy tẩy trang nâng cơ mặt làm sạch sâu cấp ẩm Halushop22",
                            "https://down-vn.img.susercontent.com/file/vn-11134207-7ras8-m5qsmb291ad4e3@resize_w900_nl.webp",
                            new BigDecimal("84000"),
                            "1. Máy đẩy tinh chất incor:\t\t\n" +
                                    "Máy đẩy tinh chất incor là dụng cụ làm đẹp không thễ thiều cho các chị em. Công thức tác động tiêu chuẩn giúp\t\t\n" +
                                    "các chị em có được làn da trắng sáng tự nhiên, mịn màng như ý\t\t\n" +
                                    "Đặc điểm thiết kế nỗi bật của máy đẩy tinh chất incor\t\t\n" +
                                    "Máy massage làm sạch, đấy tỉnh chất incor được thiết kế đơn giản, như thiết bị chăm sóc da tại nhà với công\t\t\n" +
                                    "năng không kém gì các thiết bị chăm sóc chuyên sâu tại các cơ sở làm đẹp: Spa, Thắm mỹ Viện\t\t\n" +
                                    "Thiết kế vỏ bọc máy chất lượng ABS cao cấp với phần đuôi máy nhỏ gọn, phù hợp với tay cằm của các bạn nữ.\t\t\n" +
                                    "Màn hình LCD cao cấp, hiện đại, thễ hiện rõ nét các thông tin cho các chị em theo dõi\t\t\n" +
                                    "Máy massage mặt incor đi kèm với 3 nút điều chỉnh chế độ massage đơn giản, dễ sử dụng\t\t\n" +
                                    "Bề mặt diện tích tiếp xúc lớn tồi ưu khả năng chăm sóc các vùng trên da mặt\t\t\n" +
                                    "\t\t\n" +
                                    "2. Bộ máy đẩy tinh chất incor gồm những gì?\t\t\n" +
                                    "Bộ máy massage da mặt gồm 1 máy massage, 1 đề sạc, 1 cáp sạc và hướng dẫn sử dụng rõ ràng\t\t\n" +
                                    "Bộ máy massage được thiết kế đặt gọn gàng trong hộp. Mỗi thiết bị đều được gói túi bảo vệ cần thận\t\t\n" +
                                    "\t\t\n" +
                                    "3. Tính năng và cơ chế hoạt động:\t\t\n" +
                                    "Chế độ chăm sóc\tTác động\t\n" +
                                    "Massage nóng lạnh\tChế độ massage nóng lạnh hỗ trợ giản nở các lỗ chân lông, cải thiện\t\n" +
                                    "\t hiệu quả các dấu hiệu  bụi bẩn trên da\t\n" +
                                    "\tMáy massage mặt incor hỗ trợ giảm tình trạng mụn và hạn chế hình thành mụn\t\n" +
                                    "Massage giảm nhăn\tThiết bị hỗ trợ đẩy mạnh quá trình lưu thông khí huyết, hiệu quả trong \t\n" +
                                    "\thỗ trợ làm tăng sing collagen trên da\t\n" +
                                    "\tHỗ trợ làm giảm nếp nhăn các vùng khóe mắt, khóe miệng, gò má,... \t\n" +
                                    "Chế độ làm sạch\tIncor kết hợp với chế độ rung massage hỗ trợ  hút sạch các bụi bẩn và đưa chúng ra ngoài hiệu quả \t\n" +
                                    "\tHỗ trợ cải thiện vấn đề về bã nhờn gây bí tắc dưới da\t\n" +
                                    "Chế độ ánh sáng sinh học \tÁnh sáng đỏ: hỗ trợ sản sinh collagen tự nhiên trên da, hỗ trợ cho da đàn hồi \t\n" +
                                    "\tÁnh sáng xanh: hỗ trợ  bảo vệ da toàn diện, giúp giảm khô ráp và hư tổn trên da\t\n" +
                                    "Khả năng đẩy tinh chất\tThiết bị đẩy tinh chất incor hỗ trợ hiệu quả trong tăng cường khả năng hấp thụ trên da\t\n" +
                                    "\tCác dưỡng chất từ các sản phẩm chăm sóc thẩm thấu tối đa trên da\t\n" +
                                    "\tKhả năng dưỡng ẩm đạt hiệu quả gấp đôi so với sử dụng sản phẩm dưỡng ẩm chay thông thường. \t\n" +
                                    "\t\t\n" +
                                    "4. Hướng dẫn sử dụng máy đẩy tinh chất incor:\t\t\n" +
                                    "Làm sạch da mặt với sữa rửa mặt, để da khô tự nhiên.\t\t\n" +
                                    "Dũng dưỡng chất chăm sóc da: serum hoặc kem dưỡng để thoa trên da\t\t\n" +
                                    "Dùng máy massage di chuyễn trên bề mặt da theo hướng từ dưới lên\t\t\n" +
                                    "Dùng máy massage đấy nhẹ nhàng theo chiều dưới lên sẽ giúp các dưỡng chất thẩm thầu sâu và nâng cơ da mặt hiệu quả\t\t\n" +
                                    "\t\t\n" +
                                    "Lưu ý:\t\t\n" +
                                    "Sử dụng máy massage chăm sóc da đều đặn để mang đền hiệu quả tối ưu\t\t\n" +
                                    "Bảo quản thiết bị nơi khô ráo, thoáng mát, hạn chề để thiết bị tiếp xúc với nước\t\t\n" +
                                    "\t\t\n" +
                                    "5. Chính sách bảo hành và đổi trả:\t\t\n" +
                                    "* Bảo hành chính hãng cho sản phẩm 01 đổi 01 trong vòng 07 ngày với những lỗi do nhà sản xuất \t\t\n" +
                                    "* Đổi và trả hàng:\t\t\n" +
                                    " Bước 1: Kiểm tra kỹ thông tin:\t\t\n" +
                                    "Ngay khi nhận hàng, khách hàng kiểm tra kĩ thông tin người gửi, người nhận và sản phẩm.",
                            category3, sub11
                    ),

                    new Product(
                            "Máy mát xa con lăn ngọc bích tự nhiên cho mặt Cơ thể lưng Con lăn Massage chân Nâng cơ mặt",
                            "https://down-vn.img.susercontent.com/file/sg-11134301-7rdvl-lyygecrxknjg91@resize_w900_nl.webp",
                            new BigDecimal("101000"),
                            "Máy mát xa con lăn ngọc bích tự nhiên cho khuôn mặt Cơ thể lưng Con lăn Massage chân Nâng cơ mặt Chống nhăn Hai đầu Gua Sha Đá ngọc bích tự nhiên Máy mát xa con lăn ngọc bích tự nhiên cho mặt Cơ thể lưng Con lăn Massage chân Con lăn nâng cơ mặt Chống nhăn Hai đầu Gua Sha Jade Đá đá.",
                            category3, sub11
                    ),

                    new Product(
                            "Bộ Que Nặn Mụn 8 Chi Tiết Hộp Thép Không Gỉ Xmusk Chuyên Dụng Spa,Thẩm Mỹ Viện (Tặng 6 Khăn Lau Cồn)",
                            "https://down-vn.img.susercontent.com/file/vn-11134207-7r98o-llx173qz66lb10@resize_w900_nl.webp",
                            new BigDecimal("69000"),
                            "Công cụ loại bỏ mụn đầu đen làm mờ vết thâm\n" +
                                    "\n" +
                                    "8 trong 1 với Vỏ kim loại “” lựa chọn lý tưởng của bạn!\n" +
                                    "\n" +
                                    "***Lưu ý: Sử dụng đúng cách để mọi thứ trở nên dễ dàng, chúng tôi không khuyến khích sử dụng bất kỳ mụn đầu đen nào trước khi mụn trưởng thành, và vui lòng lau tất Cả dụng cụ tẩm cồn trước và sau mỗi lần sử dụng và sử dụng theo chỉ dẫn.\n" +
                                    "\n" +
                                    "***Hướng dẫn sử dụng:\n" +
                                    "\n" +
                                    "1.Làm sạch mặt bằng nước ấm và giữ ấm khăn mặt trên da trong vài giây để lỗ chân lông mở ra.\n" +
                                    "\n" +
                                    "2.Đặt đầu quanh mụn đầu đen bạn muốn chiết xuất.\n" +
                                    "\n" +
                                    "3.Nhẹ nhàng ấn xuống một bên của mụn đầu đen - di chuyển dụng cụ trên cùng.\n" +
                                    "\n" +
                                    "4.Làm sạch da một lần nữa, sau đó thoa toner và kem dưỡng ẩm.\n" +
                                    "\n" +
                                    "5.Luôn rửa dụng cụ trong nước xà phòng / cồn nóng và để khô trong không khí.\n" +
                                    "\n" +
                                    "Cách dùng: Dùng cho mụn trứng cá, mụn đầu đen, mụn đầu trắng, mụn trứng cá, mụn nhọt, mụn bọc, mụn trứng cá.\n" +
                                    "\n" +
                                    "*** Điểm nổi bật:\n" +
                                    "- Chức năng tuyệt vời: Những công cụ khác nhau này có thể giúp loại bỏ mụn đầu đen, mụn trứng cá và nhiều nhược điểm khác nhau, giữ cho khuôn mặt của bạn sạch sẽ và mịn màng.Không có mẩn đỏ hoặc sẹo.\n" +
                                    "- Mọi thứ trong một bộ: Dụng cụ loại bỏ mụn đầu đen 4 cái / 8 cái, kích thước nhỏ gọn với trọng lượng nhẹ với hộp đựng để giữ dụng cụ an toàn và sạch sẽ, mọi vật dụng đều được thiết lập đúng nơi.\n" +
                                    "- Face Beauty: Bộ dụng cụ loại bỏ mụn đầu đen này được thiết kế để giải quyết các vấn đề về da mặt khác nhau, dễ dàng loại bỏ mụn đầu đen, mụn đầu trắng, mụn trứng cá.Trị mụn, vết thâm trên trán, má, mũi và cằm, giúp da mặt luôn sạch đẹp hiệu quả.\n" +
                                    "- Dễ sử dụng: Bộ dụng cụ nặn mụn này với thiết kế chống trượt giúp bạn kiểm soát áp lực tốt hơn trong quá trình sử dụng, tránh làm tổn thương da.Sự lựa chọn tuyệt vời cho các tiệm trang điểm chuyên nghiệp, studio mỹ phẩm và sử dụng tại nhà.\n" +
                                    "- Tay nghề tuyệt vời: Máy hút lỗ chân lông trên khuôn mặt này được làm bằng thép không gỉ cao cấp, nhẹ và bền cho cả thẩm mỹ viện và sử dụng hàng ngày.Tẩy mụn đầu đen của chúng tôi có thể hoạt động trên mọi loại da.Đi kèm với một hộp đựng đồ xinh xắn, di động và dễ dàng mang theo, nó sẽ không chiếm quá nhiều diện tích.",
                            category3, sub11
                    ),

                    new Product(
                            "1 Con lăn mặt đá, con lăn lce để giảm bọng mắt & mặt, Đường viền mặt nạ và tăng cường chăm sóc da & phát sáng",
                            "https://down-vn.img.susercontent.com/file/sg-11134301-7rdyd-lzravtppovcn45@resize_w900_nl.webp",
                            new BigDecimal("31000"),
                            "Chất liệu sản phẩm: chất liệu silicon\n" +
                                    "\n" +
                                    "Cải THIỆN LÀN DA: lăn đá mặt có thể loại bỏ tình trạng giảm bọng mắt, làm sáng da, se khít và thu nhỏ lỗ chân lông, kích thích lưu thông máu và giảm viêm, có nhiều chức năng như làm đẹp, làm sạch và lưu thông máu.\n" +
                                    "\n" +
                                    "Dễ SỬ DỤNG: Đổ đầy nước vào khuôn máy mát xa con lăn đá. Để đông lạnh trong tủ lạnh hơn 4 giờ, khi sử dụng, hãy thoa đá lên da cách nhau 30 giây theo chuyển động tròn. Để có kết quả tối ưu, nên sử dụng 1 hoặc 2 ti\n" +
                                    "\n" +
                                    "Tiết KIỆM TIỀN VÀ VERSATILE: Có thể nạp lại cho một khối lập phương tươi và sạch mỗi lần sử dụng. Đông lạnh các công thức nấu ăn hình khối thay thế, chẳng hạn như nước chanh để làm trắng da, trà xanh để giảm viêm, nước dưa chuột để giảm sưng tấy, lá bạc hà sảng khoái và dừa để cải thiện làn da Sữa.\n" +
                                    "\n" +
                                    "Quà TẶNG HOÀN HẢO: Lý tưởng cho phòng tập thể dục da cá nhân của riêng bạn. Lướt đá khắp mặt, để tạo đường nét, điêu khắc và nâng da, Hãy chiêu đãi bản thân hoặc người thân một món quà không ngừng tặng và là món quà lý tưởng cho Ngày của Mẹ, sinh nhật, kỷ niệm.",
                            category3, sub11
                    ),

                    new Product(
                            "Máy rửa mặt 4 trong 1 METIS thiết kế mini giúp rửa mặt di tinh chất làm sạch đẹp da",
                            "https://down-vn.img.susercontent.com/file/vn-11134207-7ra0g-m7aok9w1iqnq63@resize_w900_nl.webp",
                            new BigDecimal("669000"),
                            "Nguồn: USB thười lượng sử dụng lên tới 8H\n" +
                                    "\n" +
                                    "Chất liệu: vỏ nhựa + đá tự nhiên\n" +
                                    "\n" +
                                    "Kích thước sản phẩm: 97mm * 75mm * 28mm\n" +
                                    "\n" +
                                    "Trọng lượng sản phẩm: 73g\n" +
                                    "\n" +
                                    "Cơ chế hoạt động: massage rung + ánh sáng hồng ngoại làm ấm \n" +
                                    "\n" +
                                    "CHỨC NĂNG CƠ BẢN CỦA SẢN PHẨM\n" +
                                    "\n" +
                                    "Máy massage mặt lưu thông hệ bạch huyết, tuần hoàn máu, đào thải độc tố giảm bọng mắt và cải thiện sắc da hồng hào, trắng sáng\n" +
                                    "\n" +
                                    "Máy massage nóng kích thích nâng cơ, giảm chảy xệ và thon gọn mặt đồng thời kích thích tái sinh collagen trẻ hóa da\n" +
                                    "\n" +
                                    "Đặc tính đá thiên nhiên tốt cho sức khỏe, kinh mạch, tiêu trừ các bức xạ hay từ trường xấu trên da mặt\n" +
                                    "\n" +
                                    "Máy massage có kích cỡ nhỏ gọn và sang trọng thích hợp mang theo bên mình để massage mọi lúc mọi nơi khi căng thẳng mệt mỏi\n" +
                                    "\n" +
                                    "NGOÀI CHỨC NĂNG DI TINH CHẤT MÁY CÒN CÓ ĐẦU RỬA MẶT MỀM MẠI. SẢN PHẨM CHẤT LƯỢNG MANG LẠI SỰ TIỆN LỢIĐể khởi động hoặc tắt máy, bạn hãy giữ nút nguồn 3 giây.\n" +
                                    "\n" +
                                    "Để sử dụng các chế độ của máy, bạn hãy tham khảo hướng dẫn sau:\n" +
                                    "\n" +
                                    "\n" +
                                    "* Bấm lần 1 ( đèn màu xanh): Rửa mặt - Nhẹ nhàng cho da nhạy cảm\n" +
                                    "\n" +
                                    "\n" +
                                    "* Bấm lần 2 ( đèn màu xanh): Rửa mặt - Mức độ vừa phải\n" +
                                    "\n" +
                                    "\n" +
                                    "* Bấm lần 3 ( đèn màu xanh): Rửa mặt - Làm sạch sâu cho da thường\n" +
                                    "\n" +
                                    "\n" +
                                    "Bạn hãy chọn chế độ rửa mặt phù hợp với làn da của mình. Chúng mình khuyến khích bạn nên chọn chế độ nhẹ nhàng cho da nhạy cảm trước nhé.\n" +
                                    "\n" +
                                    "\n" +
                                    "* Bấm lần 4 ( đèn màu đỏ): Đẩy tinh chất - Nhiệt độ 42*\n" +
                                    "\n" +
                                    "\n" +
                                    "Hãy đợi 15 giây để máy lên nhiệt. Bạn có thể xoa tinh chất (serum) bằng tay trước rồi dùng máy đẩy cho thấm sâu hơn, hoặc trực tiếp bôi tinh chất lên mặt inox để thoa lên da trong 2 phút.\n" +
                                    "\n" +
                                    "\n" +
                                    "* Bấm lần 5 (đèn vừa xanh vừa đỏ): Massage rung ấm trên da mặt\n" +
                                    "\n" +
                                    "\n" +
                                    "Sau khi bôi kem dưỡng da, bạn hãy bấm sang nút thứ 5 và đưa máy di chuyển trên da theo hướng từ dưới lên trên. Riêng khu vực đường rãnh giữa mũi và miệng, bạn hãy đưa máy chéo sang hai bên nhé.**LƯU Ý\t\t\t\t\t\t\t\t\t\n" +
                                    "\n" +
                                    "\n" +
                                    "- Nếu da có mụn sưng viêm nặng: nên sử dụng tính năng rửa mặt 1 tuần cho bớt sưng viêm sau đố mới đẩy tinh chất (mụn nhỏ, mụn thường đẩy tinh chất bình thường)\t\t\t\t\t\t\t\t\t\n" +
                                    "\n" +
                                    "\n" +
                                    "- Sử dụng tính năng đẩy tinh chất với mặt nạ: mức nhiệt của máy là an toàn cho da nên khi qua 1 lớp mặt nạ giấy thì mức nhiệt sẽ giảm đi 1 chút -> mở chế độ đẩy tinh chất 1 phút để mặt inox nóng hẳn lên rồi đắp mặt nạ và di đều máy xung quanh mặt trong vòng 3 phút để đạt hiệu quả tốt nhất\t\t\t\t\t\t\t\t\t\n" +
                                    "\n" +
                                    "\n" +
                                    "- Chế độ massage nâng cơ: mức nhiệt phù hợp với mức độ nhạy cảm của da. Máy ấm trên toàn bộ mặt inox tráng gương, càng để lâu tỏa nhiệt từ lõi lên mặt inox càng nhiều. Nếu da có mụn sưng nhạy cảm: đợi nhiệt lên trong vòng 15-30s và sử dụng. Nếu muốn ấm nóng hơn: đợi nhiệt lên trong vòng 1-2 phút.",
                            category3, sub11
                    ),

                    new Product(
                            "Máy Chăm Sóc Da Nóng Lạnh Đẩy Tinh Chất Trị Liệu Ánh Sáng, Làm Trẻ Hóa Da Sạch Sâu Bảo Hành",
                            "https://down-vn.img.susercontent.com/file/sg-11134201-22110-qa0664lkuzjv0f@resize_w900_nl.webp",
                            new BigDecimal("500000"),
                            "⚡Đặᴄ đɪểᴍ ᴠượᴛ ᴛʀộɪ ᴄủᴀ ᴍáʏ ᴄʜăᴍ sóᴄ ᴅᴀ ɴóɴɢ ʟạɴʜ  \n" +
                                    "\n" +
                                    " \uD835\uDFF7. ᴄôɴɢ ɴɢʜệ ɪᴏɴ ᴋếᴛ ʜợᴘ ɴʜɪệᴛ ɴóɴɢ \uD835\uDFFA\uD835\uDFFB độ ᴄ: ᴋíᴄʜ ᴛʜíᴄʜ ᴄáᴄ ᴅưỡɴɢ ᴄʜấᴛ ᴛʜấᴍ sâᴜ ᴠàᴏ ʜạ ʙì ᴅᴀ, ᴛăɴɢ ɢấᴘ \uD835\uDFF9.\uD835\uDFFB ʟầɴ ʜɪệᴜ ǫᴜả ɢɪảᴍ ᴛʜâᴍ ᴠà ᴅưỡɴɢ ᴛʀắɴɢ sᴏ ᴠớɪ ᴛʜᴏᴀ ᴛᴀʏ ᴛʜôɴɢ ᴛʜườɴɢ\n" +
                                    "\n" +
                                    " \uD835\uDFF8. xᴜɴɢ đɪệɴ ᴇᴍs: ɴâɴɢ ᴄơ ᴍặᴛ, ᴛʀẻ ʜóᴀ ᴅᴀ, ɢɪúᴘ ᴄảɪ ᴛʜɪệɴ ɴếᴘ ɴʜăɴ, ʟàᴍ ᴄăɴɢ ʙóɴɢ ᴅᴀ\n" +
                                    "\n" +
                                    " \uD835\uDFF9. sóɴɢ ʀᴜɴɢ ғ-ᴠɪʙʀᴀᴛɪᴏɴ: ᴄảɪ ᴛʜɪệɴ ᴛᴜầɴ ʜᴏ.àɴ ᴍá.ᴜ, ɴâɴɢ ᴄơ ᴠà ʟàᴍ săɴ ᴄʜắᴄ ᴅᴀ\n" +
                                    "\n" +
                                    " \uD835\uDFFA. ᴄʜế độ ʟàᴍ ʟạɴʜ: ᴍáᴛ xᴀ ᴅᴀ ᴛʜư ɢɪãɴ, ᴋʜóᴀ ᴅưỡɴɢ ᴠà sᴇ ᴋʜíᴛ ʟỗ ᴄʜâɴ ʟôɴɢ\n" +
                                    "\n" +
                                    " \uD835\uDFFB. Áɴʜ sáɴɢ sɪɴʜ ʜọᴄ xᴀɴʜ ᴠà đỏ: ᴄảɪ ᴛʜɪệɴ sắ.ᴄ ᴛ.ố ᴅᴀ, ᴛăɴɢ sɪɴʜ ᴄᴏʟʟᴀ.ɢᴇɴ, ᴋʜá.ɴɢ ᴠɪê.ᴍ, ɴɢăɴ ɴɢừᴀ ᴍ.ụɴ\n" +
                                    "\n" +
                                    " \uD835\uDFFC. \uD835\uDFFB ᴄʜế độ ʟàᴍ đẹᴘ, \uD835\uDFF9 ᴄấᴘ độ ᴍạɴʜ ɴʜẹ, ᴀɴ ᴛᴏàɴ ᴄʜᴏ ᴄả ʟàɴ ᴅᴀ ɴʜạʏ ᴄảᴍ.\n" +
                                    "\n" +
                                    "ᴍáʏ ᴄʜăᴍ sóᴄ ᴅᴀ ɴóɴɢ ʟạɴʜ ᴄó \uD835\uDFFB ᴄʜế độ ᴄʜăᴍ sóᴄ ᴄʜᴜʏêɴ sâᴜ, ʜᴏàɴ ᴄʜỉɴʜ ᴄʜᴜ ᴛʀìɴʜ ᴄʜăᴍ sóᴄ ᴠà ᴅưỡɴɢ ᴛʀắɴɢ ᴅᴀ ᴄủᴀ ʙạɴ:\n" +
                                    "\n" +
                                    " ⚡ ᴄʜế độ ᴄʟᴇᴀɴ ( ʟàᴍ sạᴄʜ) : ᴛʜờɪ ɢɪᴀɴ \uD835\uDFFB ᴘʜúᴛ\n" +
                                    "\n" +
                                    "sử ᴅụɴɢ ɴʜɪệᴛ ʟàᴍ ɴóɴɢ+ʀᴜɴɢ ᴛầɴ số ᴄᴀᴏ(sᴏɴɪᴄ) ᴋếᴛ ʜợᴘ ᴠớɪ ʙôɴɢ ᴠà ᴍỹ ᴘʜẩᴍ ᴅạɴɢ ɴướᴄ để ʟàᴍ sạᴄʜ ᴅᴀ.\n" +
                                    "\n" +
                                    "- ɴʜɪệᴛ ᴛạᴏ ʀᴀ ᴛừ ᴍáʏ ʟàᴍ ʙụɪ ʙẩɴ ʙáᴍ ᴠàᴏ ʟỗ ᴄʜâɴ ʟôɴɢ ᴅễ ᴅàɴɢ ʀơɪ ʀᴀ. ᴋếᴛ ʜợᴘ ᴠớɪ ʀᴜɴɢ sᴏɴɪᴄ ᴛầɴ số ᴄᴀᴏ sẽ đáɴʜ ʙậᴛ ᴄáᴄ ʙụɪ ʙẩɴ ᴛừ sâᴜ ʙêɴ ᴅướɪ ʟỗ ᴄʜâɴ ʟôɴɢ ʀᴀ ɴɢᴏàɪ.\n" +
                                    "\n" +
                                    " ⚡ ᴄʜế độ ᴄᴏᴏʟ sử ᴅụɴɢ ᴠớɪ đèɴ ʟᴇᴅ xᴀɴʜ(ʟàᴍ ʟạɴʜ) : ᴛʜờɪ ɢɪᴀɴ \uD835\uDFF8 ᴘʜúᴛ: sᴇ ʟỗ ᴄʜâɴ ʟôɴɢ, ɢɪữ độ ẩᴍ ᴄʜᴏ ᴅᴀ, ʟᴇᴅ ʙʟᴜᴇ ʙướᴄ sóɴɢ \uD835\uDFFA\uD835\uDFFD\uD835\uDFF6ɴᴍ ᴄó ᴛáᴄ ᴅụɴɢ ɢɪảᴍ ᴍụɴ ᴛʀứɴɢ ᴄá, ᴛɪêᴜ ᴅɪệᴛ ᴠà ɴɢăɴ ɴɢừᴀ ᴠɪ ᴋʜᴜẩɴ ᴛʀêɴ ᴅᴀ, ɴɢăɴ sẹᴏ ᴍớɪ ʜìɴʜ ᴛʜàɴʜ.\n" +
                                    "\n" +
                                    " ⚡ ᴄʜế độ ᴇᴍs ᴜᴘ : (ɴâɴɢ ᴄơ ᴍặᴛ) ᴛʜờɪ ɢɪᴀɴ \uD835\uDFFB ᴘʜúᴛ\n" +
                                    "\n" +
                                    "ᴋʜɪ sử ᴅụɴɢ ᴄʜế độ ɴàʏ, ᴅᴀ sẽ ᴄảᴍ ɢɪáᴄ ɴʜư ɢɪậᴛ đɪệɴ ɴʜẹ.\n" +
                                    "\n" +
                                    "ᴠớɪ ᴠɪệᴄ áᴘ ᴅụɴɢ ᴅòɴɢ xᴜɴɢ đɪệɴ ᴍɪᴄʀᴏ ᴇᴍs ᴄáᴄ ᴛầɴ số ᴛừ ᴛʜấᴘ đếɴ ᴄᴀᴏ, ᴋʜôɴɢ ᴄʜỉ ᴄó ᴘʜầɴ ᴄơ ᴛʀêɴ ʙề ᴍặᴛ ᴅᴀ, ᴍà ᴄả ᴘʜầɴ ᴄơ ở sâᴜ ʙêɴ ᴅướɪ ᴄũɴɢ đượᴄ ᴋíᴄʜ ᴛʜíᴄʜ ɢɪúᴘ ᴄơ ᴍặᴛ đượᴄ ᴄăɴɢ ʟêɴ.\n" +
                                    "\n" +
                                    "STORE EVA CAM KẾT CHÍNH SÁCH BÁN HÀNG TỐT NHẤT ĐẾN TAY NGƯỜI TIÊU DÙNG:\n" +
                                    "\n" +
                                    "   1- Sản phẩm 100% giống hình ảnh, mô tả\n" +
                                    "\n" +
                                    "   2- Hàng hóa trước khi giao đến tay khách hàng đều được kiểm tra kỹ càng, cẩn thận và đóng gói chắc chắn\n" +
                                    "\n" +
                                    "   3- Tư vấn nhiệt tình, đầy đủ và chân thật nhất về sản phẩm 24/7 để khách hàng có thể hiểu rõ nhất về sản phẩm\n" +
                                    "\n" +
                                    "   4- Hàng được đặt luôn có sẵn tại kho, sẽ giao cho ĐVVC sớm nhất trong ngày\n" +
                                    "\n" +
                                    "   5- Hoàn tiền, hỗ trợ bảo hành đầy đủ cho khách hàng kể từ 7 ngày khi nhận sản phẩm.",
                            category3, sub11
                    ),

                    new Product(
                            "Máy Cà Da Chết ion - Dùng Trong SPA - TMV",
                            "https://down-vn.img.susercontent.com/file/vn-11134207-7r98o-lz2ta1cwdj8h3c@resize_w900_nl.webp",
                            new BigDecimal("210000"),
                            "\n" +
                                    " (N'Máy Cà Da Chết ion - Dùng Trong SPA - TMV', N'https://down-vn.img.susercontent.com/file/vn-11134207-7r98o-lz2ta1cwdj8h3c@resize_w900_nl.webp', 210000, N'- SHOPSPA- CUNG CẤP THIẾT BỊ THẨM MỸ CHÍNH HÃNG \n" +
                                    ".....................................................................................................................\n" +
                                    "- Không tẩy da chết thường xuyên làm sạch da là nguyên nhân chính dẫn đến các bệnh lý về da. \n" +
                                    "- Giải pháp cho các chị e đây cá nhân hay spa dùng đều dùng được. \n" +
                                    "- Máy cà da chết, sủi da, kết hợp điện di ion hiệu quả vừa #tẩy_da_chết vừa #điện_di_ion \n" +
                                    "- Máy tích điện tiện dụng dễ sử dụng.",
                            category3, sub11
                    ),

                    new Product(
                            "Máy đẩy tinh chất massage nâng cơ mặt bằng sóng siêu âm, máy tẩy trang điện di tinh chất bằng ánh sáng sinh học",
                            "https://down-vn.img.susercontent.com/file/vn-11134207-7ra0g-m7933j3ocq2k3a@resize_w900_nl.webp",
                            new BigDecimal("169000"),
                            "Máy massage mặt 4 in 1, dụng cụ spa chăm sóc da\n" +
                                    "CHỨC NĂNG\n" +
                                    "1. Làm sạch sâu, sạch bụi siêu nhỏ 2.5 micromet, sạch phần dư thừa của lớp trang điểm và bã nhờn từ đó loại bỏ nguyên nhân ngây mụn.\n" +
                                    "2. Massage nóng (đẩy dưỡng): Thúc đẩy khả năng hấp thụ gấp đôi các sản phẩm chăm sóc da. Tổ hợp chức năng ion âm + rung sonic + nén nhiệt sẽ đẩy tinh chất trực tiếp cho da, tăng cường khả năng hiệu quả của tinh chất lên gấp 2 lần. Chức năng này các bạn có thể sử dụng với mặt nạ dưỡng da nha.\n" +
                                    "3. Nâng cơ EMS có thể làm giảm phù nề, cải thiện nếp nhăn và tăng độ đàn hồi cho da.\n" +
                                    "4.  Ánh sáng đỏ trẻ hóa và làm trắng da: làm cho da mịn màng và đầy đặn. Ánh sáng đỏ có khả năng đi sâu vào lớp cơ kích thích da sản sinh collagen và estatin từ đó thúc đẩy nhanh quá trình trẻ hóa cho làn da đã lão hóa.\n" +
                                    "5. Ánh sáng xanh ức chế sự phát triển của mụn\n" +
                                    "6. Massage quanh mắt, xóa mờ nếp nhăn, thư giãn\n" +
                                    "\n" +
                                    "HƯỚNG DẪN SỬ DỤNG:\n" +
                                    "1.Nhấn nút nguồn 3 giây để bật, không sử dụng máy trong lúc sạc.\n" +
                                    "2.Tay để vị trí hai thanh cảm biến bằng kim loại 2 bên thân máy.\n" +
                                    "3.Ấn nút nguồn để chuyển chế độ khác\n" +
                                    "4.Ấn nút quạt gió để tăng hoặc giảm cấp độ\n" +
                                    "#dungculamdep #dungcuchamsocdamat #skincare #maylamsachdatainha #maymassagemat#dienditinhchat #matxa #taytrang #duongchat #maydaytinhchat #chonglaohoa #trehoalanda #nangco #duongtrang #nguanepnhan #sekhitlochanlong #lamsachsau #thongon#maymatxa#maylamda#ruamat#maymat#maylammat\n" +
                                    "\n" +
                                    "***Máy đẩy tinh chất có 4 chức năng chính :\n" +
                                    "- Chế độ làm sạch da\n" +
                                    "- Chế độ ánh sáng  ( ánh sáng đỏ)\n" +
                                    "- Chế độ đưa tinh chất (ánh sáng xanh)\n" +
                                    "- Chế độ chăm sóc mắt.",
                            category3, sub11
                    ),

                    //THỰC PHẨM CHỨC NĂNG

                    new Product(
                            "Viên uống hỗ trợ miễn dịch, tăng sinh collagen Now L-Lysine 1000mg 100 viên",
                            "https://down-vn.img.susercontent.com/file/vn-11134207-7r98o-ltdbvsxporyxc9@resize_w900_nl.webp",
                            new BigDecimal("370000"),
                            "- Dạng bào chế: Dạng viên\n" +
                                    "\n" +
                                    "- Quy cách: Hộp 100 viên\n" +
                                    "\n" +
                                    "THÀNH PHẦN:\n" +
                                    "\n" +
                                    "- L-Lysine (form L-Lysine Hydrochloride) 1000mg.\n" +
                                    "\n" +
                                    "- Thành phần khác gồm: Microcrystalline Cellulose, Silicon Dioxide, Stearic Acid (vegetable source), Cellulose, Croscarmellose Sodium, Magnesium Stearate (vegetalbe source).\n" +
                                    "\n" +
                                    "CÔNG DỤNG:\n" +
                                    "\n" +
                                    "- Hỗ trợ việc điều chỉnh giảm mất cân bằng nội tiết – là nguyên nhân gây ra mụn, rụng tóc. Dùng L-Lysine kết hợp với collagen giảm mụn hiệu quả, ngăn tình trạng rụng tóc\n" +
                                    "\n" +
                                    "- Hỗ trợ tổng hợp collagen: L-Lysine là nguyên liệu cần thiết để sản sinh collagen, đồng thời ngăn chặn sự hoạt động của các enzym tiêu thụ collagen,  làm quá trình phá hủy collagen trong cơ thể bị chậm đi\n" +
                                    "\n" +
                                    "- Giúp giảm stress hiệu quả: L-Lysine tăng mức độ chất dẫn truyền thần kinh có tên gọi là hocmon hạnh phúc, giúp ăn ngon, ngủ ngon hơn, vui vẻ hơn…. \n" +
                                    "\n" +
                                    "- L-lysine giúp tăng hấp thụ canxi, tăng lượng kháng thể giúp hệ miễn dịch tốt hơn, đồng thời giúp mụn nhanh lành\n" +
                                    "\n" +
                                    "- Nếu bạn nào đang sử dụng sắt và zinc (kẽm) thì nên dùng l-lysine kèm theo để tăng hiệu quả sử dụng vì L-Lysine tăng tính hấp thu 2 chất này: sắt, kẽm\n" +
                                    "\n" +
                                    "HƯỚNG DẪN SỬ DỤNG\n" +
                                    "\n" +
                                    "- Dùng 1 viên/lần, 1-3 lần/ngày (tùy theo lượng cần thiết của cơ thể).\n" +
                                    "\n" +
                                    "- Sử dụng đều đặn hàng ngày để thấy rõ hiệu quả.\n" +
                                    "\n" +
                                    "- Trong khi sử dụng sản phẩm nên hạn chế thức khuya và cần ăn uống điều độ.\n" +
                                    "\n" +
                                    "CAM KẾT CỦA SHOP:\n" +
                                    "\n" +
                                    "- Cam kết phân phối sản phẩm 100% chính hãng, nhập khẩu chính ngạch, đầy đủ giấy tờ tem niêm phong và tem phụ Tiếng Việt,...\n" +
                                    "\n" +
                                    "- Hỗ trợ đổi trả trong vòng 07 ngày nếu sản phẩm gặp các vấn đề lỗi từ phía nhà sản xuất, sản phẩm gặp vấn đề trong quá trình vận chuyển.\n" +
                                    "\n" +
                                    "- Sản phẩm đổi trả phải còn nguyên mác niêm phong, chưa qua sử dụng.\n" +
                                    "\n" +
                                    "- Khách hàng nên quay lại quá trình mở kiện hàng vận chuyển để thuận tiện hơn trong quá trình đổi, trả hàng nếu có sai sót ở sản phẩm.\n" +
                                    "\n" +
                                    "- Khi đổi trả sản phẩm, nếu không phải lỗi sản phẩm hay shop giao sai sản phẩm, quý khách vui lòng trả phí vận chuyển. \n" +
                                    "\n" +
                                    "Sản phẩm không phải là thuốc và không có tác dụng thay thế thuốc chữa bệnh.",
                            category3, sub12
                    ),

                    new Product(
                            "Viên sủi KUDOS EXTRA bổ sung 18 vitamin và khoáng chất hỗ trợ tăng đề kháng, năng lượng tức thì (20 viên/tuýp)",
                            "https://down-vn.img.susercontent.com/file/vn-11134207-7r98o-lx9f3ammov6j78@resize_w900_nl.webp",
                            new BigDecimal("122850"),
                            "Điểm nổi bật:\n" +
                                    "\n" +
                                    "-       Sản xuất tại Đức, tiêu chuẩn chất lượng Châu Âu\n" +
                                    "\n" +
                                    "-       Không chứa lactose, gluten và dùng được cho người ăn chay\n" +
                                    "\n" +
                                    "Công dụng: \n" +
                                    "\n" +
                                    "Bổ sung vitamin (B1, B2, B3, B5, B6, B8, B9, B12, C, E) và khoáng chất (magnesi, kẽm, mangan, đồng, iod, selen, crom) cho cơ thể. \n" +
                                    "\n" +
                                    "Thành phần \n" +
                                    "\n" +
                                    "Trong mỗi viên sủi 4,1 g chứa: Calci (Calci carbonat) 120 mg, Vitamin C (Acid L-ascorbic) 100 mg, Magnesi (Magnesi carbonat) 56 mg, Chiết xuất nhân sâm 50 mg, Niacin (Nicotinamid) 16 mg NE, Vitamin E (DL-alpha-tocopheryl acetat) 12 mg α-TE, Acid pantothenic (D-pantothenat, calci) 6 mg, Kẽm (Kẽm citrat) 5 mg, Vitamin B6 (Pyridoxin hydroclorid) 5 mg, Vitamin B1 (Thiamin mononitrat) 3 mg, Mangan (Mangan sulfat) 2 mg, Vitamin B2 (Riboflavin) 2 mg, Đồng (Đồng sulfat) 1 mg, Acid folic (Acid pteroymonoglutamic) 200 µg, Biotin (D-Biotin) 150 µg, Iod (Kali iodat) 100 µg, Selen (Natri selenit) 55 µg, Crom (Crom (III) clorid) 40 µg, Vitamin B12 (Cyanocobalamin) 5 µg. \n" +
                                    "\n" +
                                    "Phụ liệu: Chất điều chỉnh độ acid: acid citric, natri hydro carbonat, kali hydro carbonat; chất độn: \n" +
                                    "\n" +
                                    "sorbitol, maltodextrin, bột nước ép củ dền; chất tạo ngọt tổng hợp: natri cyclamat; hương liệu tổng hợp \n" +
                                    "\n" +
                                    "(hương trái cây nhiệt đới); chất tạo ngọt tổng hợp: natri saccharin \n" +
                                    "\n" +
                                    "●      Đối tượng sử dụng:  Người trưởng thành có nhu cầu bổ sung vitamin và khoáng chất.\n" +
                                    "\n" +
                                    "●      Hướng dẫn sử dụng: Dùng 1 viên mỗi ngày, hòa tan trong một cốc nước (200 ml)\n" +
                                    "\n" +
                                    "●      Bảo quản: Bảo quản dưới 25oC ở nơi khô ráo và đậy nắp kín\n" +
                                    "\n" +
                                    "Chú ý:\n" +
                                    "\n" +
                                    "• Thực phẩm này không phải là thuốc, không có tác dụng thay thế thuốc chữa bệnh.\n" +
                                    "\n" +
                                    "• Không dùng cho người mẫn cảm, kiêng kỵ với bất cứ thành phần nào của sản phẩm.\n" +
                                    "\n" +
                                    "• Phụ nữ có thai, đang cho con bú, người bị viêm loét dạ dày, tá tràng, nên tham khảo ý kiến bác sĩ, chuyên gia y tế trước khi dùng.\n" +
                                    "\n" +
                                    "• Không dùng quá liều khuyến nghị hàng ngày.\n" +
                                    "\n" +
                                    "• Không phù hợp cho trẻ em dưới 14 tuổi. Để xa tầm tay trẻ nhỏ.\n" +
                                    "\n" +
                                    "• Không dùng sản phẩm sau ngày hết hạn.\n" +
                                    "\n" +
                                    "• Sản phẩm là thực phẩm bảo vệ sức khỏe chứa vitamin, khoáng chất và chất tạo ngọt. \n" +
                                    "\n" +
                                    "• Thực phẩm bảo vệ sức khỏe không thay thế cho chế độ ăn uống đa dạng cân bằng và lối sống lành mạnh.\n" +
                                    "\n" +
                                    "• Sản phẩm không chứa lactose, gluten và thân thiện với người ăn chay.\n" +
                                    "\n" +
                                    "Thời hạn sử dụng: 36 tháng kể từ ngày sản xuất\n" +
                                    "\n" +
                                    "NSX, HSD: Xem “MFD” và “EXP” ở đáy tuýp.\n" +
                                    "\n" +
                                    "Khối lượng tịnh: 82 g (20 viên/tuýp x 4,1 g/viên)\n" +
                                    "\n" +
                                    "Xuất xứ: Đức.",
                            category3, sub12
                    ),

                    new Product(
                            "Viên uống Trắng da DHC Nhật Bản Adlay Extract",
                            "https://down-vn.img.susercontent.com/file/2970dc4fe94abf29fff64cffaaf5d1ae@resize_w900_nl.webp",
                            new BigDecimal("129000"),
                            "Viên uống Trắng da DHC Nhật Bản Adlay Extract\n" +
                                    "\n" +
                                    "Thương hiệu: DHC\n" +
                                    "\n" +
                                    "Xuất Xứ: Nhật Bản\n" +
                                    "\n" +
                                    "Quy cách: Gói 15 viên, Gói 20 viên & Gói 30 viên\n" +
                                    "\n" +
                                    "Công dụng của Viên uống trắng da DHC\n" +
                                    "\n" +
                                    "- Làm trắng da, bổ sung và dưỡng ẩm cho da giúp ngăn ngừa hiện tượng khô da và da nứt nẻ\n" +
                                    "\n" +
                                    "- Bổ sung các dưỡng chất cho da như: Vitamin E, Vitamin B1, B12, axit linoleic, axit palmitic, axit stearic, axit cis-8-oc-tadecenoic … giúp làm mềm và dưỡng ẩm, ngăn ngừa các dấu hiệu lão hóa da, loại bỏ các vết thâm đen\n" +
                                    "\n" +
                                    "- Giúp ngăn ngừa nám da, làm mờ thâm sẹo, phục hồi tổn thương do tia UV gây ra, khôi phục lại sức sống cho làn da, tránh được tối đa sự hình thành những đốm nâu, tàn nhang\n" +
                                    "\n" +
                                    "- Ngăn ngừa sự tích lũy của mỡ thừa, giúp duy trì vóc dáng thon gọn\n" +
                                    "\n" +
                                    "- Giúp lợi tiểu, làm giảm thiểu sưng phù và giúp làm da tươi sáng, giảm vết thâm nám da hiệu quả\n" +
                                    "\n" +
                                    "Thành phần của Viên uống trắng da Coix Extract DHC\n" +
                                    "\n" +
                                    "Hàm lượng trong 1 viên: 555mg\n" +
                                    "\n" +
                                    "- Dinh dưỡng: 3,2 kcal\n" +
                                    "\n" +
                                    "- Đạm: 0,14 g\n" +
                                    "\n" +
                                    "- Chất béo: 0,21 g\n" +
                                    "\n" +
                                    "- Tinh bột: 0,18 g\n" +
                                    "\n" +
                                    "- Natri: 0,52 mg\n" +
                                    "\n" +
                                    "- Vitamin E (d-α tocopherol): 10 mg\n" +
                                    "\n" +
                                    "- Bột chiết xuất lúa mạch: 170 mg\n" +
                                    "\n" +
                                    "Cách sử dụng Viên uống trắng da DHC\n" +
                                    "\n" +
                                    "- Uống 1 viên/ ngày\n" +
                                    "\n" +
                                    "- Tốt nhất vào buổi tối trước khi đi ngủ\n" +
                                    "\n" +
                                    "- Uống với nước hoặc nước ấm\n" +
                                    "\n" +
                                    "Hạn sử dụng: 36 tháng kể từ ngày sản xuất.\n" +
                                    "\n" +
                                    "Lưu ý: Bảo quản nơi khô ráo, thoáng mát, tránh những nơi ẩm ướt, tránh để viên uống trắng da DHC ở những nơi có nhiệt độ cao và tránh ánh nắng mặt trời\n" +
                                    "\n" +
                                    "-\tSản phẩm này không phải là thuốc, không có tác dụng thay thế thuốc chữa bệnh.",
                            category3, sub12
                    ),

                    new Product(
                            "Thực phẩm bảo vệ sức khỏe InnerB Aqua Bank (giữ ẩm cho da từ Axit Hyaluronic) lọ 56viên",
                            "https://down-vn.img.susercontent.com/file/vn-11134201-7r98o-lwzdukyk5hax15@resize_w900_nl.webp",
                            new BigDecimal("304000"),
                            "Công dụng:\n" +
                                    "\n" +
                                    "\n" +
                                    "- Bổ sung Hyaluronic Acid cho làn da\n" +
                                    "\n" +
                                    "- Mang đến cho da mềm mịn đủ nước\n" +
                                    "\n" +
                                    "- Cải thiện nếp gấp, nếp nhăn, rãnh sâu\n" +
                                    "\n" +
                                    "- Hỗ trợ làm sáng da, cải thiện da tươi tắn và khỏe mạnh, đàn hồi\n" +
                                    "\n" +
                                    "Đối tượng sử dụng:\n" +
                                    "\n" +
                                    "- Phù hợp với mọi loại da\n" +
                                    "\n" +
                                    "- Phù hợp cho độ tuổi từ 20 trở lên\n" +
                                    "\n" +
                                    "Quy cách đóng gói: Lọ 16.8g - 56 viên \n" +
                                    "\n" +
                                    "Hạn sử dụng: 24 tháng kể từ ngày sản xuất\n" +
                                    "\n" +
                                    "***Khuyến cáo sản phẩm này không phải là th.u.ốc và không có tác dụng thay thế th.u.ốc c.h.ữa bệnh.\n" +
                                    "\n" +
                                    "Thương hiệu: InnerB\n" +
                                    "\n" +
                                    "Xuất xứ thương hiệu: Hàn Quốc\n" +
                                    "\n" +
                                    "Sản xuất tại: Hàn Quốc.",
                            category3, sub12
                    ),

                    new Product(
                            "Viên uống bổ sung vitamin tổng hợp Collagen Bunkka 120 viên chăm sóc sức khỏe và làn da",
                            "https://down-vn.img.susercontent.com/file/vn-11134207-7ras8-m4k3wi9u7drk07@resize_w900_nl.webp",
                            new BigDecimal("93000"),
                            "THÔNG TIN CHUNG\n" +
                                    "- Thành phần chính: Vitamin A (dưới dạng Retinyl Palmitate), Vitamin D (dưới dạng Cholecalciferol), Thiamin (vitamin B1 dưới dạng Thiamin HCl), Riboflavin (vitamin B2), Niacin (vitamin B3 dưới dạng Niacinamide), Vitamin B6 (dưới dạng Pyridoxine HCl), Folate (200 mcg Folic Acid), Vitamin B12 (dưới dạng Methylcobalamin), Biotin, Pantothenic Acid (dưới dạng Calcium D-Pantothenate), Calcium (dưới dạng Tricalcium Phosphate), Phosphorus (dưới dạng Tricalcium Phosphate), Hỗn hợp Proprietary (Collagen Cá, Methylsulfonylmethane (MSM), Collagen Thủy Phân Loại II và III, Chiết xuất Tre (Bambusa vulgaris) (thân và lá) (chuẩn đến 70% silica), Dầu Dừa (Cocos Nucifera), Chiết xuất Cây Tầm Gai (Urtica Dioica) (rễ), Chiết xuất Hạt Nho (Vitis Vinifera), Acid Hyaluronic (dưới dạng Sodium Hyaluronate)), Glutathione, Gelatin, Microcrystalline Cellulose.\n" +
                                    "- Thương hiệu: Bunkka Hoa Kỳ\n" +
                                    "- Dạng: Viên nang\n" +
                                    "- Mùi vị: Không vị - tự nhiên\n" +
                                    "- Dung tích: 120 viên\n" +
                                    "\n" +
                                    "LỢI ÍCH SẢN PHẨM\n" +
                                    "- Hỗ trợ sức khỏe mắt: Nhờ vào Vitamin A, giúp duy trì thị lực và bảo vệ mắt khỏi các tác nhân gây hại, mang lại đôi mắt sáng khỏe.\n" +
                                    "- Tăng cường hệ miễn dịch: Nhờ vào Vitamin D, giúp cơ thể chống lại các bệnh nhiễm trùng và duy trì sức khỏe xương, hỗ trợ cơ thể khỏe mạnh từ trong ra ngoài.\n" +
                                    "- Hỗ trợ chuyển hóa năng lượng: Nhờ vào Thiamin, Riboflavin, Niacin, Vitamin B6 và B12, giúp cơ thể chuyển hóa thực phẩm thành năng lượng hiệu quả, mang lại nguồn năng lượng dồi dào.\n" +
                                    "- Hỗ trợ sức khỏe da, tóc và móng: Nhờ vào Biotin, giúp duy trì sự khỏe mạnh và vẻ đẹp tự nhiên của da, tóc và móng, mang lại sự tự tin với làn da mịn màng và mái tóc bóng mượt.\n" +
                                    "- Hỗ trợ sức khỏe xương và răng: Nhờ vào Calcium và Phosphorus, giúp duy trì cấu trúc xương và răng chắc khỏe, phòng ngừa các bệnh về xương.\n" +
                                    "- Hỗ trợ sức khỏe khớp và da: Nhờ vào Collagen và Acid Hyaluronic, giúp duy trì độ đàn hồi và độ ẩm cho da, đồng thời hỗ trợ sức khỏe khớp, mang lại vẻ ngoài tươi trẻ và sức khỏe bền vững.\n" +
                                    "\n" +
                                    "HƯỚNG DẪN SỬ DỤNG:\n" +
                                    "- Uống 2 viên mỗi ngày, tốt nhất là trong bữa ăn hoặc theo chỉ dẫn của chuyên gia y tế.\n" +
                                    "- Bảo quản: Nơi khô ráo, thoáng mát, tránh ánh nắng trực tiếp và xa tầm tay trẻ em.\n" +
                                    "- Lưu ý: Sản phẩm này không phải là thuốc, không có chức năng thay thế thuốc chữa bệnh.",
                            category3, sub12
                    ),

                    new Product(
                            "Collagen uống thủy phân dạng sủi chiết xuất da cá tuyết cao cấp nhật bản trẻ hóa sáng da lọ 20 viên NYOKO PHARM",
                            "https://down-vn.img.susercontent.com/file/vn-11134207-7ras8-m11548ir47fje3@resize_w900_nl.webp",
                            new BigDecimal("189000"),
                            "Collagen uống thủy phân dạng sủi chiết xuất da cá tuyết cao cấp nhật bản trẻ hóa sáng da lọ 20 viên NYOKO PHARM\n" +
                                    "\n" +
                                    "1. THÔNG TIN SẢN PHẨM\n" +
                                    "\n" +
                                    "- Tên: Viên Sủi Collagen Peptide Type S Hương Táo\n" +
                                    "\n" +
                                    "- Thương hiệu: Nyoko Pharm\n" +
                                    "\n" +
                                    "- Xuất xứ: Việt Nam\n" +
                                    "\n" +
                                    "- Quy cách: Hộp 1 Lọ 20 Viên/lọ\n" +
                                    "\n" +
                                    "- NSX: in trên bao bì sản phẩm\n" +
                                    "\n" +
                                    "- HSD: 36 tháng từ ngày sản xuất\n" +
                                    "\n" +
                                    "- Đối tượng sử dụng: Người trưởng thành muốn đẹp da. Người khô da, nhăn da, nám da\n" +
                                    "2. Thành phần\n" +
                                    "\n" +
                                    "Thành phần cho 1 viên : Fish collagen peptide type S 1250mg, glutathione 250mg, Vitamin C 100mg, Acid hyaluronic 10mg, và các phụ liệu khác (in trên bao bì sản phẩm)\n" +
                                    "\n" +
                                    "- Collagen thủy phân hiệu quả gấp 7 lần collagen thường\n" +
                                    "\n" +
                                    "- Da cá tuyết ít chất béo không làm tăng cân như collagen thông thường\n" +
                                    "\n" +
                                    "- Vitamin C : môi trường giúp collagen phát huy tối đa hiệu quả làm đẹp.",
                            category3, sub12
                    ),

                    new Product(
                            "Viên uống Esunvy Hỗ trợ hạn chế thâm nám da, giảm bã nhờn, giảm mụn hộp 30v",
                            "https://down-vn.img.susercontent.com/file/vn-11134207-7r98o-lwjkkkjcbaop01@resize_w900_nl.webp",
                            new BigDecimal("105000"),
                            "CÔNG DỤNG\n" +
                                    "– Hỗ trợ thanh nhiệt, hỗ trợ giải độc, hỗ trợ tăng cường chức năng gan.\n" +
                                    "\n" +
                                    "– Hỗ trợ hạn chế thâm nám da, hỗ trợ giảm bã nhờn, hỗ trợ giảm mụn.\n" +
                                    "\n" +
                                    "– Hỗ trợ phục hồi vùng da bị tổn thương do mụn.\n" +
                                    "\n" +
                                    "*Thực phẩm này không phải là thuốc và không có tác dụng thay thế thuốc chữa bênh.\n" +
                                    "\n" +
                                    "CÁCH DÙNG\n" +
                                    "Uống 1 viên/lần × 2 lần/ngày.\n" +
                                    "\n" +
                                    "*Lưu ý: Không sử dụng cho người mẫn cảm với bất kỳ thành phần nào của sản phẩm.\n" +
                                    "\n" +
                                    "ĐỐI TƯỢNG SỬ DỤNG\n" +
                                    "Các trường hợp bị bã nhờn trên da, bị các loại mụn: mụn trứng cá, mụn viêm, mụn cám, mụn đầu trắng, mụn đầu đen, mụn mủ, mụn bọc.",
                            category3, sub12
                    ),

                    new Product(
                            "Viên Uống Trắng Da Glutathione Mix Collagen GC Hàn Quốc Lọ 60 Viên Giúp Trắng Da Sáng Ngời Và Duy Trì Làn Da Khỏe Mạnh",
                            "https://down-vn.img.susercontent.com/file/vn-11134207-7r98o-lv5rlhnpczjt5c@resize_w900_nl.webp",
                            new BigDecimal("292000"),
                            "Viên Uống Trắng Da GLUTATHIONE MIX COLLAGEN Giúp Trắng Da Sáng Ngời Và Duy Trì Làn Da Khỏe Mạnh\n" +
                                    "\n" +
                                    "*** Thông Tin Sản Phẩm:\n" +
                                    "\n" +
                                    " - Xuất Xứ: Hàn Quốc\n" +
                                    "\n" +
                                    " - Quy Cách: Lọ 60 Viên\n" +
                                    "\n" +
                                    " - Hàm lượng Glutathione: 600mg\n" +
                                    "\n" +
                                    " - Collagen Peptide 3000DA: Dưỡng ẩm, duy trì làn da khỏe mạnh chống lại tác động của tia UV.\n" +
                                    "\n" +
                                    " - Các Thành Phần Bổ Sung: Hyaluronic Acid, Vitamin C, Biotin, Tinh Chất từ Quả Cà Chua Trắng để bảo vệ tế bào khỏi oxy hóa.\n" +
                                    "\n" +
                                    "*** Đặc Điểm Nổi Bật.\n" +
                                    "\n" +
                                    " - Kiểm soát sắc tố melanin với Vitamin C và Glutathione.\n" +
                                    "\n" +
                                    " - Cải thiện độ đàn hồi da với Collagen Peptide 3.000DA.\n" +
                                    "\n" +
                                    " - Phục hồi da, tóc, móng với Biotin, Prolastin, Tinh Chất từ Quả Cà Chua Trắng, Sữa Ceramide.\n" +
                                    "\n" +
                                    "CÔNG DỤNG SẢN PHẨM: \n" +
                                    "\n" +
                                    "  - Giúp làn da trở nên mịn màng, căng bóng, trắng sáng và tràn đầy sức sống.\n" +
                                    "\n" +
                                    "  - Chống oxy hóa, giúp bảo vệ làn da nhạy cảm khỏi những tác động xấu từ bên ngoài như: khói bụi, vi khuẩn, tia cực tím từ ánh mắt mặt trời,…\n" +
                                    "\n" +
                                    "  - Dưỡng ẩm cho da, giúp làn da duy trì độ chắc khỏe, đàn hồi, mềm mịn. Tránh được tình trạng da khô, nứt nẻ, bong tróc.\n" +
                                    "\n" +
                                    "  - Ngăn ngừa và giúp làm chậm lại quá trình lão hóa da. Đồng thời, sản phẩm còn giúp hạn chế những khuyết điểm về da như nếp nhăn, thâm sạm, tàn nhang.\n" +
                                    "\n" +
                                    " HƯỚNG DẪN SỬ DỤNG:\n" +
                                    "\n" +
                                    "  - Ngày uống 1 - 2 viên sau ăn sáng. Liệu trình 3 hộp sau đó ngưng để hấp thụ sau đó có thể sử dụng tiếp.\n" +
                                    "\n" +
                                    "Lưu Ý: Thực Phẩm Này Không Phải Là Thuốc, Không Có Tác Dụng Thay Thế Thuốc Chữa Bệnh.",
                            category3, sub12
                    )


                    );

            // ✅ Lưu vào database
            productRepo.saveAll(products);
            System.out.println("✅ Đã thêm dữ liệu vào bảng Product!");
        };
    }
}
