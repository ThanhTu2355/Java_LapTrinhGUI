using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Cau02
{
    class Vuong : ChuNhat
    {
        private double canh;

        public Vuong()
        {
        }
        public Vuong(double canh)
        {
            this.canh = canh;
        }

        public double Canh
        {
            set { canh = value; }
            get { return canh; }
        }

        public override double TinhChuVi()
        {
            return canh * 4;
        }
        public override double TinhDienTich()
        {
            return canh * canh;
        }
        public override void Xuat()
        {
            Console.WriteLine("- Canh : {0}\t- Chu vi : {1}\t- Dien tich : {2}",
                     Canh, TinhChuVi(), TinhDienTich());

        }
    }
}
