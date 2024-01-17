using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Cau01
{
    class Program
    {
        static void Main(string[] args)
        {
            Console.WriteLine(" Nhap thong tin sinh vien : ");
            Console.Write(" Ho ten : ");
            string hoten = Console.ReadLine();
            Console.Write(" So ngay cong : ");
            int songaycong = int.Parse(Console.ReadLine());
            Console.Write(" So ngay lam them : ");
            int songaylamthem = int.Parse(Console.ReadLine());
            Console.Write(" Xep loai : ");
            string xeploai = Console.ReadLine();
            Console.Write(" Bo phan : ");
            string bophan = Console.ReadLine();
            NhanVien nv1 = new NhanVien(hoten, songaycong, songaylamthem, xeploai, bophan);
            Console.WriteLine(" - Ho ten : {0}\t- So ngay cong : {1}\t- So ngay lam them : {2}\t- Xep loai : {3}\t- Bo phan : {4}", 
                                  hoten, songaycong, songaylamthem, xeploai, bophan);
            Console.ReadLine();
        }
    }
}
