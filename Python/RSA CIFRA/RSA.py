class RSA():
	def __init__(self):
		self.e = 3
		self.p = 17
		self.q = 23
		self.mensagem = 112

	def produzPQ(self):
		n = self.p*self.q
		return n

	def fTotiente(self):
		ft = (self.p-1)*(self.q-1)
		return ft

	def inversoMultiplicativo(self):
		inv = 0
		x = 0
		while x<99999999999:
			if ((x*self.e)%self.fTotiente()==1):
				inv = x
				break
			x = x + 1
		return inv

	def encripta(self):
		with open('E:/Programacao/New/Read.txt', 'r') as f:
			filecontent = f.read()
			s = filecontent
			x = 0
			m = ''
			with open('E:/Programacao/New/TABELA ASCII DECIMAL.txt', 'r') as tascii:
				text = tascii.read()
				while x < s.__len__():
					count = 0
					while count < text.__len__():
						if s[x] == text[count]:
							c = int(((((count / 2) + 1)+31) ** self.e)%self.produzPQ())
							m += str(c) + " "
							count = text.__len__()
						count = count + 1
					x = x + 1
				#print('mensagem cifrada:', m)
				with open('E:/Programacao/New/re-write.txt', 'w') as w:
					w.write(m)

		return c



#	def decripta(self):
#		m = (self.encripta()**self.inversoMultiplicativo())%self.produzPQ()
#		return m

rsa1 = RSA()
#print(rsa1.produzPQ())
#print(rsa1.fTotiente())
#print(rsa1.inversoMultiplicativo())
rsa1.encripta()
#print(rsa1.decripta())
