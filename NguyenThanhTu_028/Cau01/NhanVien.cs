using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Cau01
{
    class NhanVien
    {
        private string hoten;
        private int songaycong;
        private int songaylamthem;
        private string xeploai;
        private string bophan;

        public NhanVien()
        {
        }
        public NhanVien(string hoten, int songaycong, int songaylamthem, string xeploai, string bophan)
        {
            this.hoten = hoten;
            this.songaycong = songaycong;
            this.songaylamthem = songaylamthem;
            this.xeploai = xeploai;
            this.bophan = bophan;
        }

        public string HoTen
        {
            set { hoten = value; }
            get { return hoten; }
        }
        public int SoNgayCong
        {
            set { songaycong = value; }
            get { return songaycong; }
        }
        public int SoNgayLamThem
        {
            set { songaylamthem = value; }
            get { return songaylamthem; }
        }
        public string XepLoai
        {
            set { xeploai = value; }
            get { return xeploai; }
        }
        public string BoPhan
        {
            set { bophan = value; }
            get { return bophan; }
        }

        public double TinhLuong()
        {

        }
        public void InThongTIn()
        {
            Console.WriteLine(" Thong tin sinh vien : ");
            Console.WriteLine(" Ho ten : {0}", HoTen);
            Console.WriteLine(" Bo phan : {0}", BoPhan);
            Console.WriteLine(" Thu nhap : {0}");
        }
    }
}
