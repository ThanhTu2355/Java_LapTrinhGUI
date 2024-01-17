using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Cau02
{
    class Program
    {
        static void Main(string[] args)
        {
            Console.WriteLine(" -- Thong tin hinh chu nhat : ");
            ChuNhat cn = new ChuNhat(3,5);
            cn.Xuat();
            Console.WriteLine(" -- Thong tin hinh vuong : ");
            ChuNhat vu = new Vuong(4);
            vu.Xuat();
            Console.ReadLine();
        }
    }
}
