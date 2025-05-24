package database;

import java.util.ArrayList;

import Model.NhanVien;

public class NhanVienDAO {
	private ArrayList<NhanVien> data = new ArrayList<NhanVien>();
	
	private ArrayList<NhanVien> selectAll(){
		return data;
	}
	
	private NhanVien selectById(int ma) {
		NhanVien result = null;
		NhanVien tim = new NhanVien();
		tim.setId(ma);
		for(NhanVien nhanVien : data) {
			if(nhanVien.equals(tim)) {
				return nhanVien;
			}
		}
		return null;
	}
	
	private int insert(NhanVien nv)
	{
		NhanVien KiemTraTonTai = this.selectById(nv.getId());
		if(KiemTraTonTai == null) {
			data.add(nv);
			return 1;
		}else {
			return 0;
		}
	}
	
	private int insertAll(ArrayList<NhanVien> list) {
		int dem = 0;
		for (NhanVien nhanVien : list) {
			dem += this.insert(nhanVien);
		}
		return dem;
	}
	
	private int delete(NhanVien nv)
	{
		NhanVien KiemTraTonTai = this.selectById(nv.getId());
		if(KiemTraTonTai != null) {
			data.remove(nv);
			return 1;
		}else {
			return 0;
		}
	}
	
	//deleteALL
	
	private int update(NhanVien nv)
	{
		NhanVien KiemTraTonTai = this.selectById(nv.getId());
		if(KiemTraTonTai != null) {
			data.remove(KiemTraTonTai);
			data.add(nv);
			return 1;
		}else {
			return 0;
		}
	}
}
